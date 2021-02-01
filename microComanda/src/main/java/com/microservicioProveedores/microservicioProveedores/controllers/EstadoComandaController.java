package com.microservicioProveedores.microservicioProveedores.controllers;

import com.microservicioProveedores.microservicioProveedores.entities.cocina.EstadoComanda;
import com.microservicioProveedores.microservicioProveedores.services.EstadoComandaServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/estadoComanda")
public class EstadoComandaController extends BaseControllerImpl<EstadoComanda, EstadoComandaServiceImpl>{


}

