package com.cesde.proyecto_integrador.service;

import java.util.List;

import com.cesde.proyecto_integrador.model.CategoriaEvento;

public interface CategoriaEventoService {
    public CategoriaEvento creaCategoriaEvento(CategoriaEvento categoriaEvento);
       public CategoriaEvento obtenerCategoriaEventoporId(Long id);
       public CategoriaEvento actualizarCategoriaEvento(Long id, CategoriaEvento categoriaEvento);
       public void eliminarCategoriaEvento(Long id);
       public CategoriaEvento obtenerCategoriaEventoporNombre(String nombre);
         public List<CategoriaEvento> listarCategoriaEvento();

}
