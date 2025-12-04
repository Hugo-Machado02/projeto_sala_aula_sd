package br.com.hugomachadodev.projeto_sala_de_aula.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Aluno;
import br.com.hugomachadodev.projeto_sala_de_aula.services.AlunoServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoServices alunoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Aluno findbyIdAlunos(@PathVariable (value = "id") String id){
        return alunoService.findbyId(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Aluno> findAllAlunos() {
        return alunoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Aluno createAluno(@RequestBody Aluno Aluno) {
        return alunoService.create(Aluno);
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT,
                    produces=MediaType.APPLICATION_JSON_VALUE,
                    consumes=MediaType.APPLICATION_JSON_VALUE)
	public Aluno updateAluno(@RequestBody Aluno Aluno) {
        return alunoService.update(Aluno);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Aluno deleteAluno(@PathVariable (value = "id") String id) {
        return alunoService.delete(null);
    }
    
}
