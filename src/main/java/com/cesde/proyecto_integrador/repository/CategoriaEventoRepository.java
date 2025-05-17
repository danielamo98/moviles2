package com.cesde.proyecto_integrador.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.proyecto_integrador.model.CategoriaEvento;

public interface CategoriaEventoRepository extends JpaRepository<CategoriaEvento, Long> {
     Optional<CategoriaEvento> findById(Long id);
     CategoriaEvento findByNombre(String nombre);
     
   
}
