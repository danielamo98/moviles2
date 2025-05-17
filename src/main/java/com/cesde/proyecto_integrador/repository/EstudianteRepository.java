package com.cesde.proyecto_integrador.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.proyecto_integrador.model.Estudiante;


public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
      Optional<Estudiante> findById(Long id);
      Estudiante findByNombre(String nombre);
      Estudiante findByApellido(String apellido);
      Estudiante findByCorreo(String correo);

}
