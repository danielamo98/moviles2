package com.cesde.proyecto_integrador.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cesde.proyecto_integrador.exception.ResourceNotFoundException;
import com.cesde.proyecto_integrador.model.AsistenciaEvento;
import com.cesde.proyecto_integrador.repository.AsistenciaEventoRepository;
import com.cesde.proyecto_integrador.service.AsistenciaEventoService;

@Service
public class AsistenciaEventoServiceImpl implements AsistenciaEventoService {

    @Autowired
    public AsistenciaEventoRepository AsistenciaEventoRepository;

    @Override
    public AsistenciaEvento creaAsistenciaEvento(AsistenciaEvento asistenciaEvento) {
        return AsistenciaEventoRepository.save(asistenciaEvento);
    }

    @Override
    public List<AsistenciaEvento> listarAsistenciaEventos() {
       return AsistenciaEventoRepository.findAll();
    }

    @Override
    public AsistenciaEvento obtenerAsistenciaEventoporId(Long id) {
    return AsistenciaEventoRepository.findById(id)
     .orElseThrow(() -> new ResourceNotFoundException("CategoriaEvento not found with id: " + id));
    }
    @Override
    public AsistenciaEvento actualizarAsistenciaEvento(Long id, AsistenciaEvento asistenciaEvento){
    AsistenciaEvento existingUser = obtenerAsistenciaEventoporId(id);
    return AsistenciaEventoRepository.save(existingUser);
    }

    @Override
    public void eliminarAsistenciaEvento(Long id) {
    AsistenciaEventoRepository.deleteById(id);
}

                            

}
