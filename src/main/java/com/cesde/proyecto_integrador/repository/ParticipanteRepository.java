package com.cesde.proyecto_integrador.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.proyecto_integrador.model.Participante;


public interface ParticipanteRepository extends JpaRepository<Participante, Long> {

    Participante  findByEventoId(Long eventoId);
    Participante  findByEstudianteId(Long estudianteId);

}