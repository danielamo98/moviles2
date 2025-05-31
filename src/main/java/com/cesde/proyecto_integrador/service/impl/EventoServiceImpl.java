package com.cesde.proyecto_integrador.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cesde.proyecto_integrador.exception.ResourceNotFoundException;
import com.cesde.proyecto_integrador.model.Evento;
import com.cesde.proyecto_integrador.repository.EventoRepository;
import com.cesde.proyecto_integrador.service.EventoService;



@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public Evento creaEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    @GetMapping
    public List<Evento> listarEventos() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento obtenerEventoPorId(Long id) {
    return eventoRepository.findById(id)
    .orElseThrow(() -> new ResourceNotFoundException("Evento not found with id: " + id));
    }

    @Override
    public Evento actualizarEvento(Long id, Evento evento) {
        Evento existingEvento = obtenerEventoPorId(id);
        existingEvento.setTítulo(evento.getTítulo());
        existingEvento.setDescripción(evento.getDescripción());
        existingEvento.setFecha(evento.getFecha());
        existingEvento.setLugar(evento.getLugar());
        existingEvento.setImagen(evento.getImagen());

        return eventoRepository.save(existingEvento);
    }

    @Override
    public void eliminarEvento(Long id) {
        eventoRepository.deleteById(id);
    }
}