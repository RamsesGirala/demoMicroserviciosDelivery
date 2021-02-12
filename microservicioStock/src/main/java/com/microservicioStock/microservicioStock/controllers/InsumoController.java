package com.microservicioStock.microservicioStock.controllers;

import com.google.gson.Gson;
import com.microservicioStock.microservicioStock.clients.ProveedorClientRest;
import com.microservicioStock.microservicioStock.local_models.stock.Articulos_Existencia;
import com.microservicioStock.microservicioStock.local_models.stock.Insumo;
import com.microservicioStock.microservicioStock.remote_models.Existencia;
import com.microservicioStock.microservicioStock.remote_models.Proveedor;
import com.microservicioStock.microservicioStock.services.InsumoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "microStock/api/v1/insumo")
public class InsumoController extends BaseControllerImpl<Insumo, InsumoServiceImpl> {

    @Autowired
    private ProveedorClientRest provClient;

    private Gson gson = new Gson();

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            //este es el buscar
            Insumo i = service.findById(id);

            //para XtoOne
            Proveedor prov = gson.fromJson(provClient.getOneProveedor(i.getIdDistribProv()).getBody().toString(), Proveedor.class);
            i.setProveedor(prov);

            //para XtoMany
            for (Articulos_Existencia a : i.getArticulos_existencias())
                a.setExistencia(gson.fromJson(provClient.getOneExistencia(a.getId_existencia()).getBody().toString(), Existencia.class));

            return ResponseEntity.status(HttpStatus.OK).body(i);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Insumo entity) {
        try {
            // para XtoOne
            Proveedor prov = gson.fromJson(provClient.getOneProveedor(entity.getIdDistribProv()).getBody().toString(), Proveedor.class);
            entity.setProveedor(prov);

            // para XtoMany
            for (Articulos_Existencia a : entity.getArticulos_existencias())
                a.setExistencia(gson.fromJson(provClient.getOneExistencia(a.getId_existencia()).getBody().toString(), Existencia.class));

            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }

    @PostMapping("/subordinada")
    public ResponseEntity<?> saveSubordinada(@RequestBody Insumo entity) {
        try {
            // para XtoOne
            Proveedor prov = gson.fromJson(provClient
                            .saveProveedor(entity.getProveedor())
                            .getBody()
                            .toString()
                    , Proveedor.class);
            entity.setIdDistribProv(prov.getId());
            entity.getProveedor().setId(prov.getId());

            // para XtoMany
            for (Articulos_Existencia a : entity.getArticulos_existencias()) {
                Existencia existencia = gson.fromJson(provClient
                                .saveExistencia(a.getExistencia())
                                .getBody()
                                .toString()
                        , Existencia.class);
                a.setId_existencia(existencia.getId());
                a.getExistencia().setId(existencia.getId());
            }
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }

    @PutMapping("/subordinada/{id}")
    public ResponseEntity<?> updateSubordinada(@PathVariable Long id, @RequestBody Insumo entity) {
        try {

            if (entity.getIdDistribProv() == 0) {
                Proveedor prov = gson.fromJson(provClient.saveProveedor(entity.getProveedor()).getBody().toString(), Proveedor.class);
                entity.setIdDistribProv(prov.getId());
            } else provClient.updateProveedor(entity.getIdDistribProv(), entity.getProveedor());


            for (Articulos_Existencia a : entity.getArticulos_existencias()) {
                if (a.getId_existencia() == 0) {
                    Existencia existencia = gson.fromJson(provClient
                                    .saveExistencia(a.getExistencia())
                                    .getBody()
                                    .toString()
                            , Existencia.class);
                    a.setId_existencia(existencia.getId());
                    a.getExistencia().setId(existencia.getId());
                }else provClient.updateExistencia(a.getId_existencia(),a.getExistencia());
            }
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Insumo entity) {
        try {

            Proveedor prov = gson.fromJson(provClient.getOneProveedor(entity.getIdDistribProv()).getBody().toString(), Proveedor.class);
            entity.setProveedor(prov);

            for(Articulos_Existencia a : entity.getArticulos_existencias()){
                a.setExistencia(gson.fromJson(provClient.getOneExistencia(a.getId_existencia()).getBody().toString(),Existencia.class));
            }
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }

    @DeleteMapping("/subordinada/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try{

            Insumo i = service.findById(id);

            provClient.deleteProveedor(i.getIdDistribProv());

            for(Articulos_Existencia a : i.getArticulos_existencias())
                provClient.deleteExistencia(a.getId_existencia());

            return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error\"}");
        }
    }
}