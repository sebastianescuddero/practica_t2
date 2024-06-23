package pe.edu.cibertec.api_practica_t2.controller;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.api_practica_t2.exception.ResourceNotFoundException;
import pe.edu.cibertec.api_practica_t2.model.bd.Medico;
import pe.edu.cibertec.api_practica_t2.service.MedicoService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/p2/medico")
public class MedicoController {

    private MedicoService medicoService;

    @GetMapping("")
    public ResponseEntity<List<Medico>> listarMedicos(){
        List<Medico> medicoList = new ArrayList<>(medicoService.listarMedicos());
        if(medicoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(medicoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> obtenerMedicoXId(
            @PathVariable Integer id){
        Medico medico = medicoService
                .obtenerMedicoxId(id).orElseThrow(
                        () -> new ResourceNotFoundException("El médico con Id " +
                                id + " no existe"));
        return new ResponseEntity<>(medico, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Medico> registrarMedico(
            @RequestBody Medico medico
    ){
        return new ResponseEntity<>(
                medicoService.guardarMedico(medico), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medico> actualizarMedico(
            @PathVariable Integer id,
            @RequestBody Medico medico
    ){
        Medico newMedico = medicoService.obtenerMedicoxId(id)
                .orElseThrow(() -> new ResourceNotFoundException("El médico con Id "
                + id + " no existe"));
        newMedico.setNommedico(medico.getNommedico());
        newMedico.setApemedico(medico.getApemedico());
        newMedico.setFechnacmedico(medico.getFechnacmedico());
        return new ResponseEntity<>(
                medicoService.guardarMedico(newMedico),
                HttpStatus.OK);
    }
}
