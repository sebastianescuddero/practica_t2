package pe.edu.cibertec.api_practica_t2.service;

import pe.edu.cibertec.api_practica_t2.model.bd.Medico;

import java.util.List;
import java.util.Optional;

public interface IMedicoService {

    List<Medico> listarMedicos();
    Medico guardarMedico(Medico medico);
    Optional<Medico> obtenerMedicoxId(Integer id);

}
