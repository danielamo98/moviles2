package com.cesde.proyecto_integrador.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesde.proyecto_integrador.exception.ResourceNotFoundException;
import com.cesde.proyecto_integrador.model.Profesor;
import com.cesde.proyecto_integrador.repository.ProfesorRepository;
import com.cesde.proyecto_integrador.service.ProfesorService;

@Service
public class ProfesorServiceImpl  implements ProfesorService{

    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public Profesor creaProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor obtenerProfesorporId(Long id) {
        return profesorRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Profesor not found with id: " + id));
    }
    @Override
    public <list> List<Profesor> listarProfesores() {
        return profesorRepository.findAll();
    }
    @Override
    public Profesor actualizarProfesor(Long id, Profesor profesor) {
        Profesor existingProfesor = obtenerProfesorporId(id);
        existingProfesor.setNombre(profesor.getNombre());
        existingProfesor.setCorreo(profesor.getCorreo());
        existingProfesor.setTelefono(profesor.getTelefono());
        existingProfesor.setFechaIngreso(profesor.getFechaIngreso());
        return profesorRepository.save(existingProfesor);
    }
    @Override
    public void eliminarProfesor(Long id) {
        Profesor profesor = obtenerProfesorporId(id);
        profesorRepository.delete(profesor);
    }

}
