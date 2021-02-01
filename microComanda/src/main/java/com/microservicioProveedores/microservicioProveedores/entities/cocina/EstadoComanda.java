	package com.microservicioProveedores.microservicioProveedores.entities.cocina;
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
	@Table(name= "estadoComanda")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	@Audited
	public class EstadoComanda 	extends Base
	  {
	@Column(name = "nombreEstado")
		private  String nombreEstado;
	
	
	
	
	
	}
