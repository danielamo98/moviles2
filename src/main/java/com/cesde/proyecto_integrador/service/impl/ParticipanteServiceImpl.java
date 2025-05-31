package com.cesde.proyecto_integrador.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cesde.proyecto_integrador.exception.ResourceNotFoundException;
import com.cesde.proyecto_integrador.model.Participante;
import com.cesde.proyecto_integrador.repository.ParticipanteRepository;
import com.cesde.proyecto_integrador.service.ParticipanteService;

@Service

public class ParticipanteServiceImpl implements ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;


    @Override
    public Participante creaParticipante(Participante participante) {
        return participanteRepository.save(participante);

    }

    @Override
    @GetMapping
    public List<Participante> listarParticipantes() {
        return participanteRepository.findAll();
    }

    @Override
    public Participante obtenerParticipanteporId(Long id) {
        return participanteRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Participante not found with id: " + id));
    }

    @Override
    public Participante actualizarParticipante(Long id, Participante participante) {
        Participante existingParticipante = obtenerParticipanteporId(id);
        existingParticipante.setAsistencia(participante.getAsistencia());
        return participanteRepository.save(existingParticipante);
    }

    @Override
    public void eliminarParticipante(Long id) {
        participanteRepository.deleteById(id);
    }
    

}
