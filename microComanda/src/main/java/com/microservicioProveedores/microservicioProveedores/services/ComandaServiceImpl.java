package com.microservicioProveedores.microservicioProveedores.services;

import com.microservicioProveedores.microservicioProveedores.entities.cocina.Comanda;
import com.microservicioProveedores.microservicioProveedores.repositories.BaseRepository;
import com.microservicioProveedores.microservicioProveedores.repositories.ComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComandaServiceImpl extends BaseServiceImpl<Comanda,Long> implements ComandaService{

	@Autowired
	private ComandaRepository ComandaRepository;
	
	public ComandaServiceImpl(BaseRepository<Comanda, Long> baseRepository){
        super(baseRepository);
    }
}


