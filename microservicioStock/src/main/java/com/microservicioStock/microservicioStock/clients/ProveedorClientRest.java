package com.microservicioStock.microservicioStock.clients;

import com.microservicioStock.microservicioStock.models.Proveedor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "microProveedores", url= "localhost:8080")
public interface ProveedorClientRest {

    @GetMapping("/api/v1/proveedor/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id);

    @PostMapping("/api/v1/proveedor/")
    public ResponseEntity<?> save(@RequestBody Proveedor entity);

    @PutMapping("/api/v1/proveedor/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody Proveedor entity);

    @GetMapping("/api/v1/existencia/{id}")
    public ResponseEntity<?> getOneE(@PathVariable Long id);

}
