package com.example.pedidos.repositories;

import com.example.pedidos.entities.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido,Long>{
}
