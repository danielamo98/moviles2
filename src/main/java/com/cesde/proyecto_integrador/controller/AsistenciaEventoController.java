package com.cesde.proyecto_integrador.controller;

import com.cesde.proyecto_integrador.model.AsistenciaEvento;
import com.cesde.proyecto_integrador.service.AsistenciaEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asistenciaeventos")
public class AsistenciaEventoController {

    @Autowired
    private AsistenciaEventoService asistenciaEventoService;

    // Crear una asistencia a evento
    @PostMapping
    public ResponseEntity<AsistenciaEvento> crearAsistenciaEvento(@RequestBody AsistenciaEvento asistenciaEvento) {
        AsistenciaEvento nueva = asistenciaEventoService.creaAsistenciaEvento(asistenciaEvento);
        return ResponseEntity.ok(nueva);
    }

    // Listar todas las asistencias
    @GetMapping
    public ResponseEntity<List<AsistenciaEvento>> listarAsistenciaEventos() {
        List<AsistenciaEvento> lista = asistenciaEventoService.listarAsistenciaEventos();
        return ResponseEntity.ok(lista);
    }

    // Obtener asistencia por ID
    @GetMapping("/{id}")
    public ResponseEntity<AsistenciaEvento> obtenerPorId(@PathVariable Long id) {
        AsistenciaEvento asistencia = asistenciaEventoService.obtenerAsistenciaEventoporId(id);
        return ResponseEntity.ok(asistencia);
    }

   
    // Actualizar categoría
      @PutMapping("/{id}")
    public ResponseEntity<AsistenciaEvento> actualizarAsistenciaEvento(@PathVariable Long id, @RequestBody AsistenciaEvento asistenciaEvento) {
        AsistenciaEvento existente = asistenciaEventoService.obtenerAsistenciaEventoporId(id);
        existente.setAsistencia(asistenciaEvento.getAsistencia());
        existente.setAsistencia(asistenciaEvento.getAsistencia());
        AsistenciaEvento actualizada = asistenciaEventoService.creaAsistenciaEvento(existente);
        return ResponseEntity.ok(actualizada);
    }

    // Eliminar asistencia por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAsistencia(@PathVariable Long id) {
        asistenciaEventoService.eliminarAsistenciaEvento(id);
        return ResponseEntity.noContent().build();
    }
}

