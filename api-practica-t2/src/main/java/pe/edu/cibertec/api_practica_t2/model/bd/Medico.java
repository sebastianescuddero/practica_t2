package pe.edu.cibertec.api_practica_t2.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmedico")
    private Integer idmedico;
    @Column(name = "nommedico")
    private String nommedico;
    @Column(name = "apemedico")
    private String apemedico;
    @Column(name = "fechnacmedico")
    private Date fechnacmedico;
}
