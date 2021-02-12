package com.microservicioStock.microservicioStock.clients;

import com.microservicioStock.microservicioStock.remote_models.Existencia;
import com.microservicioStock.microservicioStock.remote_models.Proveedor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "microProveedores", url= "localhost:8080")
public interface ProveedorClientRest {

    @GetMapping("/microProveedores/api/v1/proveedor/{id}")
    public ResponseEntity<?> getOneProveedor(@PathVariable Long id);

    @PostMapping("/microProveedores/api/v1/proveedor/")
    public ResponseEntity<?> saveProveedor(@RequestBody Proveedor entity);

    @PutMapping("/microProveedores/api/v1/proveedor/{id}")
    public ResponseEntity<?> updateProveedor(@PathVariable Long id,@RequestBody Proveedor entity);

    @DeleteMapping("/microProveedores/api/v1/proveedor/{id}")
    public ResponseEntity<?> deleteProveedor(@PathVariable Long id);

    @GetMapping("/microProveedores/api/v1/existencia/{id}")
    public ResponseEntity<?> getOneExistencia(@PathVariable Long id);

    @PostMapping("/microProveedores/api/v1/existencia/")
    public ResponseEntity<?> saveExistencia(@RequestBody Existencia entity);

    @PutMapping("/microProveedores/api/v1/existencia/{id}")
    public ResponseEntity<?> updateExistencia(@PathVariable Long id,@RequestBody Existencia entity);

    @DeleteMapping("/microProveedores/api/v1/existencia/{id}")
    public ResponseEntity<?> deleteExistencia(@PathVariable Long id);
}
