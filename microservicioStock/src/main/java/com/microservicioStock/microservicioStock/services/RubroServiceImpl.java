package com.microservicioStock.microservicioStock.services;

import com.microservicioStock.microservicioStock.entities.stock.Rubro;
import com.microservicioStock.microservicioStock.repositories.BaseRepository;
import com.microservicioStock.microservicioStock.repositories.RubroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubroServiceImpl extends BaseServiceImpl<Rubro,Long> implements RubroService{

	@Autowired
	private RubroRepository RubroRepository;
	
	public RubroServiceImpl(BaseRepository<Rubro, Long> baseRepository){
        super(baseRepository);
    }
}

