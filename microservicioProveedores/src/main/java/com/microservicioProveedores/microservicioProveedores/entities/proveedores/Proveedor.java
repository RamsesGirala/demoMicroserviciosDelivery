package com.microservicioProveedores.microservicioProveedores.entities.proveedores;

import javax.persistence.*;

import com.microservicioProveedores.microservicioProveedores.models.Insumo;
import org.hibernate.envers.Audited;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.microservicioProveedores.microservicioProveedores.entities.Base;

import java.util.List;


@Entity
@Table(name = "proveedor")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Audited
public class Proveedor extends Base {
    @Column(name = "razonSocial")
    private String razonSocial;
    @Column(name = "contacto")
    private String contacto;
}
