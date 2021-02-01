package com.microservicioProveedores.microservicioProveedores.controllers;

import com.microservicioProveedores.microservicioProveedores.entities.proveedores.Proveedor;
import com.microservicioProveedores.microservicioProveedores.services.ProveedorServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/proveedor")
public class ProveedorController extends BaseControllerImpl<Proveedor, ProveedorServiceImpl>{


}

