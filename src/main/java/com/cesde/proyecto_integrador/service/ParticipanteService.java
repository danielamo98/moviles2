package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Participante;

public interface ParticipanteService {

       public Participante creaParticipante(Participante participante);
       public java.util.List<Participante> listarParticipantes();
       public Participante obtenerParticipanteporId(Long id);
       public Participante actualizarParticipante(Long id, Participante participante);
       public void eliminarParticipante(Long id);

}
