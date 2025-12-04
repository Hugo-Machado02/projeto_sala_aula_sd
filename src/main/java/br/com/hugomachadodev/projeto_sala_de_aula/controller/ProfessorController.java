package br.com.hugomachadodev.projeto_sala_de_aula.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Professor;
import br.com.hugomachadodev.projeto_sala_de_aula.services.ProfessorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Professor findbyIdProfessor(@PathVariable (value = "id") String id){
        return professorService.findbyId(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Professor> findAllProfessor() {
        return professorService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorService.create(professor);
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT,
                    produces=MediaType.APPLICATION_JSON_VALUE,
                    consumes=MediaType.APPLICATION_JSON_VALUE)
	public Professor updateProfessor(@RequestBody Professor professor) {
        return professorService.update(professor);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Professor deleteProfessor(@PathVariable (value = "id") String id) {
        return professorService.delete(null);
    }
    
}
