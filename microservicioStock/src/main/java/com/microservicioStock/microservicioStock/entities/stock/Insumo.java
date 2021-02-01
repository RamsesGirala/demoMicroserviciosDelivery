	package com.microservicioStock.microservicioStock.entities.stock;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	import org.hibernate.envers.Audited;
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	
		
	@Entity
	@Table(name= "insumo")
	@Data
	@NoArgsConstructor
	@Builder
	
	@Audited
	public class Insumo 	extends Articulo
	  {
	
	
	
	
	
	}
