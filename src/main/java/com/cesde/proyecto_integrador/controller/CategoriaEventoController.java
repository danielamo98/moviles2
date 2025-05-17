package com.cesde.proyecto_integrador.controller;

import com.cesde.proyecto_integrador.model.CategoriaEvento;
import com.cesde.proyecto_integrador.service.CategoriaEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/categoriasevento")
public class CategoriaEventoController {

    @Autowired
    private CategoriaEventoService categoriaEventoService;

    // Crear una categoría de evento
    @PostMapping
    public ResponseEntity<CategoriaEvento> crearCategoriaEvento(@RequestBody CategoriaEvento categoriaEvento) {
        CategoriaEvento nuevaCategoria = categoriaEventoService.creaCategoriaEvento(categoriaEvento);
        return ResponseEntity.ok(nuevaCategoria);
    }

       @GetMapping
    public ResponseEntity<List<CategoriaEvento>> listarCategoriaEvento() {
        List<CategoriaEvento> categorias = categoriaEventoService.listarCategoriaEvento();
        return ResponseEntity.ok(categorias);
    }

    // Obtener categoría por ID
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaEvento> obtenerCategoriaPorId(@PathVariable Long id) {
        CategoriaEvento categoria = categoriaEventoService.obtenerCategoriaEventoporId(id);
        return ResponseEntity.ok(categoria);
    }

    // Actualizar categoría
    @PutMapping("/{id}")
    public ResponseEntity<CategoriaEvento> actualizarCategoria(@PathVariable Long id, @RequestBody CategoriaEvento categoriaEvento) {
        CategoriaEvento actualizada = categoriaEventoService.actualizarCategoriaEvento(id, categoriaEvento);
        return ResponseEntity.ok(actualizada);
    }

    // Eliminar categoría
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCategoria(@PathVariable Long id) {
        categoriaEventoService.eliminarCategoriaEvento(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar por nombre
    @GetMapping("/buscar")
    public ResponseEntity<CategoriaEvento> obtenerPorNombre(@RequestParam String nombre) {
        CategoriaEvento categoria = categoriaEventoService.obtenerCategoriaEventoporNombre(nombre);
        if (categoria != null) {
            return ResponseEntity.ok(categoria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

