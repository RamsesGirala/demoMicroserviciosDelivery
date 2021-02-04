package com.example.pedidos.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "medios_pagos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedioPago extends Base{

    @Column(name = "descuento")
    private int descuento;

    @Column(name = "nombre")
    private String nombre;
}
