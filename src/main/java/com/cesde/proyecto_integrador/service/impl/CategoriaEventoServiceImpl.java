package com.cesde.proyecto_integrador.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cesde.proyecto_integrador.exception.ResourceNotFoundException;
import com.cesde.proyecto_integrador.model.CategoriaEvento;
import com.cesde.proyecto_integrador.repository.CategoriaEventoRepository;
import com.cesde.proyecto_integrador.service.CategoriaEventoService;


@Service
public class CategoriaEventoServiceImpl implements CategoriaEventoService {

    @Autowired
    public CategoriaEventoRepository categoriaEventoRepository;

//CRUD
@Override
public CategoriaEvento creaCategoriaEvento(CategoriaEvento categoriaEvento){
    return categoriaEventoRepository.save(categoriaEvento);
 }

 @Override
  @GetMapping
    public List<CategoriaEvento> listarCategoriaEvento() {
        return categoriaEventoRepository.findAll();
    }


  @Override
    public CategoriaEvento obtenerCategoriaEventoporId(Long id) {
    return categoriaEventoRepository.findById(id)
    .orElseThrow(() -> new ResourceNotFoundException("CategoriaEvento not found with id: " + id));
    }
@Override
public CategoriaEvento actualizarCategoriaEvento(Long id, CategoriaEvento categoriaEvento){
    CategoriaEvento existingUser = obtenerCategoriaEventoporId(id);
    existingUser.setNombre(categoriaEvento.getNombre());
    return categoriaEventoRepository.save(existingUser);
    }

@Override
public void eliminarCategoriaEvento(Long id) {
    categoriaEventoRepository.deleteById(id);
}

//operaciones adicionales

@Override
public CategoriaEvento obtenerCategoriaEventoporNombre(String nombre){
return categoriaEventoRepository.findByNombre(nombre);
 }

}
