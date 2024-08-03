package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelos.cuotas;

public interface cuotaRepository extends JpaRepository<cuotas, Integer>{
    
}
