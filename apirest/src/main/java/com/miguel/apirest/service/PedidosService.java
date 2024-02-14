package com.miguel.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguel.apirest.repository.PedidosRepository;

import com.miguel.apirest.entity.Pedidos;

@Service

public class PedidosService {

    @Autowired

    PedidosRepository pedidosRepository;

    // crear servicios

    // obtener todos los pedidos
    public List<Pedidos> getPedidos() {
        return pedidosRepository.findAll();
    };

    // obtener todos los pedidos por id
    @SuppressWarnings("null")
    public Pedidos getPedidosById(Integer id) {
        return pedidosRepository.findById(id).orElse(null);
    }

    // Crear un pedido
    @SuppressWarnings("null")
    public Pedidos savePedidos(Pedidos pedidos) {
        return pedidosRepository.save(pedidos);
    }

    // Actualizar un pedido
    @SuppressWarnings("null")
    public Pedidos updatePedidosById(Integer id , Pedidos pedidos){
        if(pedidosRepository.existsById(id)){
            pedidos.setId(id);
            return pedidosRepository.save(pedidos);
        }else{
            return null;
        }
    }

    // borrar un pedido
    @SuppressWarnings("null")
    public void deletePedidos(Integer id) {
        pedidosRepository.deleteById(id);
    }
}
