package com.cesde.proyecto_integrador.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.proyecto_integrador.model.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
     Optional<Profesor> findById(Long id);
    Profesor findByCorreo(String correo);
    Profesor findByNombre(String nombre);



}