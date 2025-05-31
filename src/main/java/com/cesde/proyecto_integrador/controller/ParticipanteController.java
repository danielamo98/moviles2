package com.cesde.proyecto_integrador.controller;

import com.cesde.proyecto_integrador.model.Participante;
import com.cesde.proyecto_integrador.service.ParticipanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    // Crear un nuevo participante
    @PostMapping
    public ResponseEntity<Participante> crearParticipante(@RequestBody Participante participante) {
        Participante nuevo = participanteService.creaParticipante(participante);
        return ResponseEntity.ok(nuevo);
    }

    // Listar todos los participantes
    @GetMapping
    public ResponseEntity<List<Participante>> listarParticipantes() {
        List<Participante> participantes = participanteService.listarParticipantes();
        return ResponseEntity.ok(participantes);
    }

    // Obtener participante por ID
    @GetMapping("/{id}")
    public ResponseEntity<Participante> obtenerParticipantePorId(@PathVariable Long id) {
        Participante participante = participanteService.obtenerParticipanteporId(id);
        return ResponseEntity.ok(participante);
    }

    // Actualizar participante por ID
    @PutMapping("/{id}")
    public ResponseEntity<Participante> actualizarParticipante(@PathVariable Long id, @RequestBody Participante participante) {
        Participante actualizado = participanteService.actualizarParticipante(id, participante);
        return ResponseEntity.ok(actualizado);
    }

    // Eliminar participante por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarParticipante(@PathVariable Long id) {
        participanteService.eliminarParticipante(id);
        return ResponseEntity.noContent().build();
    }
}
<<<<<<< HEAD
=======

>>>>>>> 0cff71a61388702957029836d2a5be6f69cd58eb
