package com.microservicioStock.microservicioStock.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Existencia{

    private Long id;

    private float cantActual;

    private float cantEntrada;

    private Proveedor proveedor;

    private Unidad expresadoEn;
}
