package com.microservicioStock.microservicioStock.clients;

import com.microservicioStock.microservicioStock.models.Existencia;
import com.microservicioStock.microservicioStock.models.Proveedor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "microProveedores", url= "localhost:8080")
public interface ProveedorClientRest {

    @GetMapping("/api/v1/proveedor/{id}")
    public ResponseEntity<?> getOneProveedor(@PathVariable Long id);

    @PostMapping("/api/v1/proveedor/")
    public ResponseEntity<?> saveProveedor(@RequestBody Proveedor entity);

    @PutMapping("/api/v1/proveedor/{id}")
    public ResponseEntity<?> updateProveedor(@PathVariable Long id,@RequestBody Proveedor entity);

    @GetMapping("/api/v1/existencia/{id}")
    public ResponseEntity<?> getOneExistencia(@PathVariable Long id);

    @PostMapping("/api/v1/existencia/")
    public ResponseEntity<?> saveExistencia(@RequestBody Existencia entity);

    @PutMapping("/api/v1/existencia/{id}")
    public ResponseEntity<?> updateExistencia(@PathVariable Long id,@RequestBody Existencia entity);
}
