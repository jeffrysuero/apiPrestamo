package com.Prestamo.App.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;
    @Column(length = 50,nullable = false)
    private String nombre;
    @Column(length = 11,nullable = false,unique = true)
    private String cedula;
    @Column(length = 50,nullable = false)
    private String direccion;
    @Column(length = 50,nullable = false)
    private String telefono;
    private int estado;
}
