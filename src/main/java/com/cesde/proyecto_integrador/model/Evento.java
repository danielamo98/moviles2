package com.cesde.proyecto_integrador.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String título;
    private String descripción;
    private Date fecha;
    private String lugar;
    private String imagen;

    @OneToMany(mappedBy = "participante_id")
    private Participante participante;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEvento categoria;

    @OneToMany(mappedBy = "asistenciaEvento_id")
    private AsistenciaEvento asistenciaEvento;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;


}
