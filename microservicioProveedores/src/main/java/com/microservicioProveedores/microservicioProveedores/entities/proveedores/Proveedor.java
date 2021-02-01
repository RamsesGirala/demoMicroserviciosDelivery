	package com.microservicioProveedores.microservicioProveedores.entities.proveedores;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	import org.hibernate.envers.Audited;
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import com.microservicioProveedores.microservicioProveedores.entities.Base;
	
		
	@Entity
	@Table(name= "proveedor")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	@Audited
	public class Proveedor 	extends Base
	  {
	@Column(name = "razonSocial")
		private  String razonSocial;
	@Column(name = "contacto")
		private  String contacto;
	
	
	
	
	
	}
