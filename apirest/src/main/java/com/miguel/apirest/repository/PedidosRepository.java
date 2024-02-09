package com.miguel.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.miguel.apirest.entity.Pedidos;

@Repository
public interface PedidosRepository extends JpaRepository <Pedidos , Integer>{
    
}
