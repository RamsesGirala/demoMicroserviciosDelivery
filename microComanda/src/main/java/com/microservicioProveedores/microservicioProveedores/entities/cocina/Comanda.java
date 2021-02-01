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
	@Table(name= "comanda")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	@Audited
	public class Comanda 	extends Base
	  {
	@Column(name = "horaSalidaEstimada")
		private  Date horaSalidaEstimada;
	
	
	
	
	
	}
