package com.microservicioStock.microservicioStock.entities.stock;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder.Default;

import org.hibernate.envers.Audited;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.microservicioStock.microservicioStock.entities.Base;


@Entity
@Table(name = "articulo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public abstract class Articulo extends Base {
    @Column(name = "apilable")
    protected boolean apilable;
    @Column(name = "descripcion")
    protected String descripcion;
    @Column(name = "isComerciable")
    protected boolean isComerciable;
    @Column(name = "nombre")
    protected String nombre;
    @Column(name = "refrigerado")
    protected boolean refrigerado;
    @Column(name = "stockMax")
    protected int stockMax;
    @Column(name = "stockMin")
    protected int stockMin;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)

    private List<HistoricoPrecios> precio = new ArrayList<HistoricoPrecios>();


}
