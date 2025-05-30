package com.cesde.proyecto_integrador.service;

import java.util.List;

import com.cesde.proyecto_integrador.model.Evento;

public interface EventoService {
     public Evento creaEvento(Evento evento);
      public List<Evento> listarEventos();
     public Evento obtenerEventoPorId(Long id);
     public Evento actualizarEvento(Long id, Evento evento);
       public void eliminarEvento(Long id);

}
