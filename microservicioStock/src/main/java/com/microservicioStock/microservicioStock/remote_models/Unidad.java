package com.microservicioStock.microservicioStock.remote_models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Unidad{

    private Long id;

    private String nombre;
}
