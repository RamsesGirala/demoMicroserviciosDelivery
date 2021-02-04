package com.microservicioStock.microservicioStock.controllers;

import com.google.gson.Gson;
import com.microservicioStock.microservicioStock.clients.ProveedorClientRest;
import com.microservicioStock.microservicioStock.entities.stock.Articulos_Existencia;
import com.microservicioStock.microservicioStock.entities.stock.Insumo;
import com.microservicioStock.microservicioStock.models.Existencia;
import com.microservicioStock.microservicioStock.models.Proveedor;
import com.microservicioStock.microservicioStock.services.InsumoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonBuilderCustomizer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/insumo")
public class InsumoController extends BaseControllerImpl<Insumo, InsumoServiceImpl>{

    @Autowired
    private ProveedorClientRest provClient;

    private Gson gson = new Gson();

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try{
            //este es el buscar
            Insumo i = service.findById(id);

            //para XtoOne
            Proveedor prov = gson.fromJson(provClient.getOne(i.getIdDistribProv()).getBody().toString(),Proveedor.class);

            i.setProveedor(prov);

            //para XtoMany
            for(Articulos_Existencia a : i.getArticulos_existencias()){

                a.setExistencia(gson.fromJson(provClient.getOneE(a.getId_existencia()).getBody().toString(), Existencia.class));

            }

            return ResponseEntity.status(HttpStatus.OK).body(i);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Insumo entity) {
        try{

            Proveedor prov = gson.fromJson(provClient.getOne(entity.getIdDistribProv()).getBody().toString(),Proveedor.class);

            entity.setProveedor(prov);

            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }

    @PostMapping("/subordinada")
    public ResponseEntity<?> saveSubordinada(@RequestBody Insumo entity) {
        try{

            Proveedor prov = gson.fromJson(provClient.save(entity.getProveedor()).getBody().toString(),Proveedor.class);

            entity.setIdDistribProv(prov.getId());

            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }

    @PutMapping("/subordinada/{id}")
    public ResponseEntity<?> updateSubordinada(@PathVariable Long id,@RequestBody Insumo entity) {
        try{

            if(entity.getIdDistribProv()==0){

                Proveedor prov = gson.fromJson(provClient.save(entity.getProveedor()).getBody().toString(),Proveedor.class);

                entity.setIdDistribProv(prov.getId());

            }else provClient.update(entity.getIdDistribProv(),entity.getProveedor());


            return ResponseEntity.status(HttpStatus.OK).body(service.update(id,entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody Insumo entity) {
        try{

            Proveedor prov = gson.fromJson(provClient.getOne(entity.getIdDistribProv()).getBody().toString(),Proveedor.class);

            entity.setProveedor(prov);

            return ResponseEntity.status(HttpStatus.OK).body(service.update(id,entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }
}