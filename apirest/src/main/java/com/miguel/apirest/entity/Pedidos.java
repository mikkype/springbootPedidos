package com.miguel.apirest.entity;

import java.sql.Date;
import java.text.DecimalFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name="Pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_pedido")
    private Integer id;

    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column (name = "fecha_pedido")
    @Temporal(TemporalType.DATE)
    private Date fechaPedido;

    @Column(name = "total")
    private DecimalFormat total;

    @Column(name = "estado")
    private String estado;


    
}
