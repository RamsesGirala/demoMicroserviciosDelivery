package com.microservicioProveedores.microservicioProveedores.controllers;

import com.microservicioProveedores.microservicioProveedores.entities.proveedores.Proveedor;
import com.microservicioProveedores.microservicioProveedores.services.ProveedorServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/proveedor")
public class ProveedorController extends BaseControllerImpl<Proveedor, ProveedorServiceImpl>{

//    @Autowired
//    private StockClientRest stockClient;
//
//    private Gson gson = new Gson();
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getOne(@PathVariable Long id) {
//        try{
//            Proveedor prov = service.findById(id);
//
//            prov.setInsumos(null);
//
//            for (Articulos_Proveedor a : prov.getArticulos_ids()){
//
//                Insumo insumo = gson.fromJson(stockClient.getOne(a.getId_insumo()).getBody().toString(),Insumo.class);
//
//                prov.getInsumos().add(insumo);
//
//                prov.getInsumos().add(Insumo.builder().stockMax(200).stockMin(200).build());
//            }
//
//            return ResponseEntity.status(HttpStatus.OK).body(prov);
//        }catch (Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error2\"}");
//        }
//    }

}

