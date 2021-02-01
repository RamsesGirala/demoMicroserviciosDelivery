package com.microservicioStock.microservicioStock.services;

import com.microservicioStock.microservicioStock.entities.stock.Insumo;
import com.microservicioStock.microservicioStock.repositories.BaseRepository;
import com.microservicioStock.microservicioStock.repositories.InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsumoServiceImpl extends BaseServiceImpl<Insumo,Long> implements InsumoService{

	@Autowired
	private InsumoRepository InsumoRepository;
	
	public InsumoServiceImpl(BaseRepository<Insumo, Long> baseRepository){
        super(baseRepository);
    }
}

