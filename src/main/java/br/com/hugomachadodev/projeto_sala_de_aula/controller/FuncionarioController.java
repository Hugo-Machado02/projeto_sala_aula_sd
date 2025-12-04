package br.com.hugomachadodev.projeto_sala_de_aula.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Funcionario;
import br.com.hugomachadodev.projeto_sala_de_aula.services.FuncionarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Funcionario findbyIdfuncionarios(@PathVariable (value = "id") String id){
        return funcionarioService.findbyId(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Funcionario> findAllFuncionario() {
        return funcionarioService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.create(funcionario);
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT,
                    produces=MediaType.APPLICATION_JSON_VALUE,
                    consumes=MediaType.APPLICATION_JSON_VALUE)
	public Funcionario updateFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.update(funcionario);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Funcionario deleteFuncionario(@PathVariable (value = "id") String id) {
        return funcionarioService.delete(null);
    }
    
}
