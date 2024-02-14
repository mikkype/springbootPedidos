package com.miguel.apirest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.apirest.entity.Pedidos;
import com.miguel.apirest.service.PedidosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api")
public class PedidosController {

    // services
    @Autowired
    PedidosService pedidosService;

    @GetMapping("/pedidos")
    public List<Pedidos> allPedidos() {
        return pedidosService.getPedidos();
    }

    @GetMapping("/pedidos/{id}")
    public Pedidos pedidosById(@PathVariable Integer id) {
        return pedidosService.getPedidosById(id);
    }
    
    @PostMapping("/pedidos")
    public Pedidos createPedidos(@RequestBody Pedidos pedidos) {
        return pedidosService.savePedidos(pedidos);
    }


    @PutMapping("pedidos/{id}")
    public Pedidos updatePedidosbyId(@PathVariable Integer id, @RequestBody Pedidos pedidos) {
        return pedidosService.updatePedidosById(id, pedidos);
    }

    @DeleteMapping("/pedidos/{id}")
    public void deletePedidosById(@PathVariable Integer id){
        pedidosService.deletePedidos(id);
    }
    


}
