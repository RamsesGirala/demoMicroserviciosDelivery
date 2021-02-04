package com.microservicioStock.microservicioStock.entities.stock;

import com.microservicioStock.microservicioStock.entities.Base;
import com.microservicioStock.microservicioStock.models.Existencia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "articulo_existencia")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Articulos_Existencia extends Base {

    @Column(name="id_existencia")
    private Long id_existencia;

    @Transient
    private Existencia existencia;
}
