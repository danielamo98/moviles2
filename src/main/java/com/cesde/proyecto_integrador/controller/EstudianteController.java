package com.cesde.proyecto_integrador.controller;


import com.cesde.proyecto_integrador.model.Estudiante;
import com.cesde.proyecto_integrador.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    // Crear estudiante
    @PostMapping
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante estudiante) {
        Estudiante nuevo = estudianteService.creaEstudiante(estudiante);
        return ResponseEntity.ok(nuevo);
    }

    // Listar todos los estudiantes
    @GetMapping
    public ResponseEntity<List<Estudiante>> listarEstudiantes() {
        List<Estudiante> estudiantes = estudianteService.listarEstudiantes();
        return ResponseEntity.ok(estudiantes);
    }

    // Obtener estudiante por ID
    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtenerEstudiantePorId(@PathVariable Long id) {
        Estudiante estudiante = estudianteService.obtenerEstudianteporId(id);
        return ResponseEntity.ok(estudiante);
    }

    // Actualizar estudiante
    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> actualizarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        Estudiante actualizado = estudianteService.actualizarEstudiante(id, estudiante);
        return ResponseEntity.ok(actualizado);
    }

    // Eliminar estudiante
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminarEstudiante(id);
        return ResponseEntity.noContent().build();
    }
}
