package com.microservicioProveedores.microservicioProveedores.controllers;

import com.microservicioProveedores.microservicioProveedores.entities.proveedores.Unidad;
import com.microservicioProveedores.microservicioProveedores.services.UnidadServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/unidad")
public class UnidadController extends BaseControllerImpl<Unidad, UnidadServiceImpl>{


}

