package com.example.comanda.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estados_comandas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EstadoComanda extends Base{

    @Column(name = "nombre_estado")
    private String nombreEstado;
}
