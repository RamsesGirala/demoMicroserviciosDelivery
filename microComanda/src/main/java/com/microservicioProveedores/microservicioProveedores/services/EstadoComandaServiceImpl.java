package com.microservicioProveedores.microservicioProveedores.services;

import com.microservicioProveedores.microservicioProveedores.entities.cocina.EstadoComanda;
import com.microservicioProveedores.microservicioProveedores.repositories.BaseRepository;
import com.microservicioProveedores.microservicioProveedores.repositories.EstadoComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoComandaServiceImpl extends BaseServiceImpl<EstadoComanda,Long> implements EstadoComandaService{

	@Autowired
	private EstadoComandaRepository EstadoComandaRepository;
	
	public EstadoComandaServiceImpl(BaseRepository<EstadoComanda, Long> baseRepository){
        super(baseRepository);
    }
}


