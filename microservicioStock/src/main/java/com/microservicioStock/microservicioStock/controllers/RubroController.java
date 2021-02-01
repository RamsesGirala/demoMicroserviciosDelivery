package com.microservicioStock.microservicioStock.controllers;

import com.microservicioStock.microservicioStock.entities.stock.Rubro;
import com.microservicioStock.microservicioStock.services.RubroServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubro")
public class RubroController extends BaseControllerImpl<Rubro, RubroServiceImpl>{


}

