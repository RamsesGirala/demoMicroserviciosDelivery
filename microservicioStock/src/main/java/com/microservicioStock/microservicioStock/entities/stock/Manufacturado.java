	package com.microservicioStock.microservicioStock.entities.stock;
		import javax.persistence.JoinColumn;
		import javax.persistence.CascadeType;
			import javax.persistence.OneToMany;
			import javax.persistence.JoinTable;
			import java.util.ArrayList;
			import java.util.List;
			import lombok.Builder.Default;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	import org.hibernate.envers.Audited;
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	
		
	@Entity
	@Table(name= "manufacturado")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	@Audited
	public class Manufacturado 	extends Articulo
	  {
	
	
	
	
					@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
			
			private List<Receta> recetas = new ArrayList<Receta>();
	
	
	
	
	}
