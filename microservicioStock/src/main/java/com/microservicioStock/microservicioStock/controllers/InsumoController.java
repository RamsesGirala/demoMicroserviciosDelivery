package com.microservicioStock.microservicioStock.controllers;

import com.microservicioStock.microservicioStock.entities.stock.Insumo;
import com.microservicioStock.microservicioStock.services.InsumoServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/insumo")
public class InsumoController extends BaseControllerImpl<Insumo, InsumoServiceImpl>{


}

