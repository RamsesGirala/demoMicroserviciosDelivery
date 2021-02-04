package com.example.pedidos.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "estados_pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstadoPedido extends Base{

    @Column(name = "nombre")
    private String nombre;
}
