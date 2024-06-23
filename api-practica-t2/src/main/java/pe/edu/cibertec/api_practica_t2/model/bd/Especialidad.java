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
@Table(name = "Especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idespecialidad")
    private Integer idespecialidad;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "funcion")
    private String funcion;
    @Column(name = "fechgraduacion")
    private Date fechgraduacion;
    @ManyToOne
    @JoinColumn(name = "idmedico")
    private Medico medico;
}
