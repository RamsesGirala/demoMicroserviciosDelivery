package com.microservicioProveedores.microservicioProveedores.controllers;

import com.microservicioProveedores.microservicioProveedores.entities.cocina.Comanda;
import com.microservicioProveedores.microservicioProveedores.services.ComandaServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/comanda")
public class ComandaController extends BaseControllerImpl<Comanda, ComandaServiceImpl>{


}

