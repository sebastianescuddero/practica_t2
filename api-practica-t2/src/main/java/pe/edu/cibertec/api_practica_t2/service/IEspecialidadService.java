package pe.edu.cibertec.api_practica_t2.service;

import pe.edu.cibertec.api_practica_t2.model.bd.Especialidad;

import java.util.List;
import java.util.Optional;

public interface IEspecialidadService {

    List<Especialidad> listarEspecialidades();
    Especialidad guardarEspecialidad(Especialidad especialidad);
    Optional<Especialidad> obtenerEspecialidadxId(Integer id);
}
