package com.microservicioStock.microservicioStock.remote_models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
