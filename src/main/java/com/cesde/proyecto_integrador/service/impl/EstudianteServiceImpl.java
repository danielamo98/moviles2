package com.cesde.proyecto_integrador.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.cesde.proyecto_integrador.exception.ResourceNotFoundException;
import com.cesde.proyecto_integrador.model.Estudiante;
import com.cesde.proyecto_integrador.repository.EstudianteRepository;
import com.cesde.proyecto_integrador.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    
    @Autowired
    public EstudianteRepository estudianteRepository;

    @Override
    public Estudiante creaEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante obtenerEstudianteporId(Long id) {
    return estudianteRepository.findById(id)
    .orElseThrow(() -> new ResourceNotFoundException("CategoriaEvento not found with id: " + id));
    }

    @Override
    public Estudiante actualizarEstudiante(Long id, Estudiante estudiante){
    Estudiante existingUser = obtenerEstudianteporId(id);
    existingUser.setNombre(estudiante.getNombre());
    return estudianteRepository.save(existingUser);
    }

    @Override
    public void eliminarEstudiante(Long id) {
    estudianteRepository.deleteById(id);
}

}
