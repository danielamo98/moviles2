package com.cesde.proyecto_integrador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String asistencia;

    @ManyToOne
    @JoinColumn(name= "estudiante_id")
    private Estudiante estudiante;
    
    @ManyToOne
    @JoinColumn(name= "evento_id")
    private Evento evento;

}


