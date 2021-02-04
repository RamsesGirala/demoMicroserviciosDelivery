package com.example.pedidos.services;

import com.example.pedidos.entities.MedioPago;
import com.example.pedidos.repositories.BaseRepository;
import com.example.pedidos.repositories.MedioPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedioPagoServiceImpl extends BaseServiceImpl<MedioPago,Long> implements MedioPagoService {

    @Autowired
    private MedioPagoRepository medioPagoRepository;

    public MedioPagoServiceImpl(BaseRepository<MedioPago,Long> baseRepository){
        super(baseRepository);
    }
}
