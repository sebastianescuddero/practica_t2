package pe.edu.cibertec.api_practica_t2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_practica_t2.model.bd.Medico;
import pe.edu.cibertec.api_practica_t2.repository.MedicoRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MedicoService implements IMedicoService {

    private MedicoRepository medicoRepository;

    @Override
    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }

    @Override
    public Medico guardarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public Optional<Medico> obtenerMedicoxId(Integer id) {
        Optional<Medico> medico
                = medicoRepository.findById(id);
        if(medico.isEmpty()){
            return Optional.empty();
        }
        return medico;
    }
}
