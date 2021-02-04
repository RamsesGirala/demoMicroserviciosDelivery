package com.example.pedidos.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "detalles_pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedido extends Base{

    @Column(name = "cantidad")
    private int cantidad;
}
