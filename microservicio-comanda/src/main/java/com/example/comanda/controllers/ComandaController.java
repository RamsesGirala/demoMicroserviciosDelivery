package com.example.comanda.controllers;

import com.example.comanda.entities.Comanda;
import com.example.comanda.services.ComandaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "comandas")
public class ComandaController extends BaseController<Comanda, ComandaServiceImpl>{


}
