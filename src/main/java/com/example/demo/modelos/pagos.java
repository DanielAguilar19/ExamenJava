package com.example.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="pagos")
@Data
public class pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigopago")
    private int codigoPago;
    private double mes;
    private double interes;
    private double saldo;

    

}
