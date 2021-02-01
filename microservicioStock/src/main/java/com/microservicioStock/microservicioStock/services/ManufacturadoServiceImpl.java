package com.microservicioStock.microservicioStock.services;

import com.microservicioStock.microservicioStock.entities.stock.Manufacturado;
import com.microservicioStock.microservicioStock.repositories.BaseRepository;
import com.microservicioStock.microservicioStock.repositories.ManufacturadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturadoServiceImpl extends BaseServiceImpl<Manufacturado,Long> implements ManufacturadoService{

	@Autowired
	private ManufacturadoRepository ManufacturadoRepository;
	
	public ManufacturadoServiceImpl(BaseRepository<Manufacturado, Long> baseRepository){
        super(baseRepository);
    }
}


