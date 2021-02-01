	package com.microservicioProveedores.microservicioProveedores.entities.cocina;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import com.microservicioProveedores.microservicioProveedores.entities.Base;

	import java.util.Date;


	@Entity
	@Table(name= "comanda")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	

	public class Comanda 	extends Base
	  {
	@Column(name = "horaSalidaEstimada")
		private Date horaSalidaEstimada;
	
	
	
	
	
	}
