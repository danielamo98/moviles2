package com.cesde.proyecto_integrador.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String codigoEmpleo;
    private String telefono;
    private Date fechaIngreso;

    @OneToMany(mappedBy = "profesor")
    private List<Evento> eventos;

}
