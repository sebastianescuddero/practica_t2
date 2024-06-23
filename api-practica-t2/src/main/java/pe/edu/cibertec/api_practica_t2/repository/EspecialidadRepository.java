package pe.edu.cibertec.api_practica_t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_practica_t2.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository
        extends JpaRepository<Especialidad, Integer> {
}
