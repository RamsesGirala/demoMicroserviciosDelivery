package com.example.pedidos.services;

import com.example.pedidos.entities.EstadoPedido;
import com.example.pedidos.repositories.BaseRepository;
import com.example.pedidos.repositories.EstadoPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoPedidoServiceImpl extends BaseServiceImpl<EstadoPedido,Long> implements EstadoPedidoService{

    @Autowired
    private EstadoPedidoRepository estadoPedidoRepository;

    public EstadoPedidoServiceImpl (BaseRepository<EstadoPedido,Long> baseRepository){
        super(baseRepository);
    }

}
