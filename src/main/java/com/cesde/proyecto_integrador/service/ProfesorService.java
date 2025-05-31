package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Profesor;

public interface ProfesorService {

     public Profesor creaProfesor(Profesor profesor);
     public Profesor obtenerProfesorporId(Long id);
     public <list> java.util.List<Profesor> listarProfesores();
     public Profesor actualizarProfesor(Long id, Profesor profesor);
     public void eliminarProfesor(Long id);

}
