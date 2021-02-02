package com.example.comanda.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comandas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comanda extends Base{

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_salida_estimada")
    private Date horaSalidaEstimada;

}
