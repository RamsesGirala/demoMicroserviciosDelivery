package com.example.facturas.controllers;

import com.example.facturas.entities.Factura;
import com.example.facturas.services.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "facturas")
public class FacturaController extends BaseController<Factura, FacturaServiceImpl> {
}
