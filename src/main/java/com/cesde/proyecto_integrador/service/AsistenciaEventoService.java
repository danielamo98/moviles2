package com.cesde.proyecto_integrador.service;

import java.util.List;

import com.cesde.proyecto_integrador.model.AsistenciaEvento;
public interface AsistenciaEventoService {
    public AsistenciaEvento creaAsistenciaEvento(AsistenciaEvento asistenciaEvento);
    public List<AsistenciaEvento> listarAsistenciaEventos();
    public AsistenciaEvento obtenerAsistenciaEventoporId(Long id);
    public AsistenciaEvento actualizarAsistenciaEvento(Long id, AsistenciaEvento asistenciaEvento);
    public void eliminarAsistenciaEvento(Long id);

}
