package com.example.demo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.cliente;
import com.example.demo.servicios.clienteServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cliente")
public class clienteController {
    
    @Autowired
    private clienteServicio clientServ;

    @PostMapping("crear/nuevo")
    public cliente crearCliente(@RequestBody cliente nvoCliente) {

        return this.clientServ.crearCliente(nvoCliente);
    }
    
}
