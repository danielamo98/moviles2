package com.cesde.proyecto_integrador.service;

import java.util.List;

import com.cesde.proyecto_integrador.model.Estudiante;

public interface EstudianteService {
        public Estudiante creaEstudiante(Estudiante estudiante);
        public List<Estudiante> listarEstudiantes();
        public Estudiante obtenerEstudianteporId(Long id);
        public Estudiante actualizarEstudiante(Long id, Estudiante estudiante);
        public void eliminarEstudiante(Long id);

}
