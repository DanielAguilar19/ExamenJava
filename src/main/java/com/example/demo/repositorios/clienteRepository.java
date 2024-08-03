package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelos.cliente;

public interface clienteRepository extends JpaRepository<cliente, String> {
    
}
