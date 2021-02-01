	package com.microservicioProveedores.microservicioProveedores.entities.cocina;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import com.microservicioProveedores.microservicioProveedores.entities.Base;
	
		
	@Entity
	@Table(name= "detalleComanda")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder

	public class DetalleComanda 	extends Base
	  {
	@Column(name = "aclaracion")
		private  String aclaracion;
	@Column(name = "cantidad")
		private  String cantidad;
	
	
	
	
	
	}
