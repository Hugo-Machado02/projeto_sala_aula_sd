package br.com.hugomachadodev.projeto_sala_de_aula.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.UnsupportedServiceException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Aluno;
import br.com.hugomachadodev.projeto_sala_de_aula.services.AlunoServices;
import br.com.hugomachadodev.projeto_sala_de_aula.services.ValidaIdService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoServices alunoService;

    @Autowired
    private ValidaIdService validaIdService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Aluno findbyIdAlunos(@PathVariable (value = "id") String id){
        if(!validaIdService.validaId(id)){
            throw new UnsupportedServiceException("Id não é valido!");
        }

        Long idAlunoBd = validaIdService.convertToLong(id);
        return alunoService.findbyId(idAlunoBd);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Aluno> findAllAlunos() {
        return alunoService.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Aluno createAluno(@RequestBody Aluno Aluno) {
        return alunoService.create(Aluno);
    }

    @PutMapping(produces=MediaType.APPLICATION_JSON_VALUE,
                    consumes=MediaType.APPLICATION_JSON_VALUE)
	public Aluno updateAluno(@RequestBody Aluno Aluno) {
        return alunoService.update(Aluno);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteAluno(@PathVariable (value = "id") String id) {
        if(!validaIdService.validaId(id)){
            throw new UnsupportedServiceException("Id não é valido!");
        }
        Long idAlunoBd = validaIdService.convertToLong(id);
        alunoService.delete(idAlunoBd);

        return ResponseEntity.noContent().build();
    }
}
