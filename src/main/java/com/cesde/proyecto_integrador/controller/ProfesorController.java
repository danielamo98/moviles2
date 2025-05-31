package com.cesde.proyecto_integrador.controller;

import com.cesde.proyecto_integrador.model.Profesor;
import com.cesde.proyecto_integrador.service.ProfesorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    // Crear un nuevo profesor
    @PostMapping
    public ResponseEntity<Profesor> crearProfesor(@RequestBody Profesor profesor) {
        Profesor nuevo = profesorService.creaProfesor(profesor);
        return ResponseEntity.ok(nuevo);
    }

    // Listar todos los profesores
    @GetMapping
    public ResponseEntity<List<Profesor>> listarProfesores() {
        List<Profesor> profesores = profesorService.listarProfesores();
        return ResponseEntity.ok(profesores);
    }

    // Obtener profesor por ID
    @GetMapping("/{id}")
    public ResponseEntity<Profesor> obtenerProfesorPorId(@PathVariable Long id) {
        Profesor profesor = profesorService.obtenerProfesorporId(id);
        return ResponseEntity.ok(profesor);
    }

    // Actualizar profesor por ID
    @PutMapping("/{id}")
    public ResponseEntity<Profesor> actualizarProfesor(@PathVariable Long id, @RequestBody Profesor profesor) {
        Profesor actualizado = profesorService.actualizarProfesor(id, profesor);
        return ResponseEntity.ok(actualizado);
    }

    // Eliminar profesor por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProfesor(@PathVariable Long id) {
        profesorService.eliminarProfesor(id);
        return ResponseEntity.noContent().build();
    }
}

