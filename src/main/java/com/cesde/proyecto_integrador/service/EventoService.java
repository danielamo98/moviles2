package com.cesde.proyecto_integrador.service;

import java.util.List;

import com.cesde.proyecto_integrador.model.Evento;

public interface EventoService {
     public Evento creaEvento(Evento evento);
      public List<Evento> listarEventos();
     public Evento obtenerEventoPorId(Long id);
     public Evento actualizarEvento(Long id, Evento evento);
       public void eliminarEvento(Long id);

<<<<<<< HEAD
}
=======
}
>>>>>>> 0cff71a61388702957029836d2a5be6f69cd58eb
