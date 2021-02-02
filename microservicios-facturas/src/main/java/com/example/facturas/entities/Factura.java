package com.example.facturas.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "facturas")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Factura extends Base{

    @Column(name = "fecha_factura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;

    @Column(name = "monto_imp")
    private float montoImp;

    @Column(name = "tipo_factura")
    private char tipoFactura;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricoEstadoFactura> estadoFactura = new ArrayList<HistoricoEstadoFactura>();

    @PrePersist
    public void prePersist(){
        this.fechaFactura = new Date();
    }
    
}
