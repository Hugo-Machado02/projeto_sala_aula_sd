package br.com.hugomachadodev.projeto_sala_de_aula.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Departamento;
import br.com.hugomachadodev.projeto_sala_de_aula.services.DepartamentoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Departamento findbyIdDepartamento(@PathVariable (value = "id") String id){
        return departamentoService.findbyId(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Departamento> findAllDepartamento() {
        return departamentoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Departamento createDepartamento(@RequestBody Departamento departamento) {
        return departamentoService.create(departamento);
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT,
                    produces=MediaType.APPLICATION_JSON_VALUE,
                    consumes=MediaType.APPLICATION_JSON_VALUE)
	public Departamento updateDepartamento(@RequestBody Departamento departamento) {
        return departamentoService.update(departamento);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Departamento deleteDepartamento(@PathVariable (value = "id") String id) {
        return departamentoService.delete(null);
    }
    
}
