package br.com.hugomachadodev.projeto_sala_de_aula.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.UnsupportedServiceException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Professor;
import br.com.hugomachadodev.projeto_sala_de_aula.services.ProfessorService;
import br.com.hugomachadodev.projeto_sala_de_aula.services.ValidaIdService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private ValidaIdService validaIdService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Professor findbyIdProfessor(@PathVariable (value = "id") String id){
        if(!validaIdService.validaId(id)){
            throw new UnsupportedServiceException("Id não é valido!");
        }

        Long idProfessorBd = validaIdService.convertToLong(id);
        return professorService.findbyId(idProfessorBd);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Professor> findAllProfessor() {
        return professorService.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorService.create(professor);
    }

    @PutMapping(produces=MediaType.APPLICATION_JSON_VALUE,
                    consumes=MediaType.APPLICATION_JSON_VALUE)
	public Professor updateFProfessor(@RequestBody Professor Professor) {
        return professorService.update(Professor);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteProfessor(@PathVariable (value = "id") String id) {
        if(!validaIdService.validaId(id)){
            throw new UnsupportedServiceException("Id não é valido!");
        }
        Long idProfessorBd = validaIdService.convertToLong(id);
        professorService.delete(idProfessorBd);

        return ResponseEntity.noContent().build();
    }
}
