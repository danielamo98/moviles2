package com.cesde.proyecto_integrador.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.proyecto_integrador.model.Evento;


public interface EventoRepository extends JpaRepository<Evento, Long> {
  Optional<Evento> findById(Long id);
  Evento  findByTítulo(String título);


}

