package com.example.pedidos.entities;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Pedido extends Base {

    @Column(name = "fecha_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;

    @Column(name = "is_pagado")
    private boolean isPagado;

    @Column(name = "monto_total")
    private float montoTotal;

    @Column(name = "retiro_en_local")
    private boolean retiroEnLocal;

    @PrePersist
    public void prePersist(){
        this.fechaPedido = new Date();
    }

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "Pedido_DetallesPedido",
            joinColumns = @JoinColumn(name = "Pedido"),
            inverseJoinColumns = @JoinColumn(name = "DetallePedido"))
    @Builder.Default
    private List<DetallePedido> detalles = new ArrayList<DetallePedido>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MedioPago> medioPago;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricoEstadoPedido> estadoPedido;

}
