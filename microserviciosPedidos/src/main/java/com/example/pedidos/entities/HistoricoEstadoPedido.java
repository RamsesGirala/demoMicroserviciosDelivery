package com.example.pedidos.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "historicos_estados_pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistoricoEstadoPedido extends Base{

    @Column(name = "fecha_cambio")
    private Date fechaCambio;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name="fk_estado_pedido")
    private EstadoPedido estadoPedido;

}
