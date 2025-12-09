package br.com.hugomachadodev.projeto_sala_de_aula.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.UnsupportedServiceException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Funcionario;
import br.com.hugomachadodev.projeto_sala_de_aula.services.FuncionarioService;
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
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private ValidaIdService validaIdService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Funcionario findbyIdFuncionario(@PathVariable (value = "id") String id){
        if(!validaIdService.validaId(id)){
            throw new UnsupportedServiceException("Id não é valido!");
        }

        Long idFuncionarioBd = validaIdService.convertToLong(id);
        return funcionarioService.findbyId(idFuncionarioBd);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Funcionario> findAllFuncionario() {
        return funcionarioService.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.create(funcionario);
    }

    @PutMapping(produces=MediaType.APPLICATION_JSON_VALUE,
                    consumes=MediaType.APPLICATION_JSON_VALUE)
	public Funcionario updateFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.update(funcionario);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteFuncionario(@PathVariable (value = "id") String id) {
        if(!validaIdService.validaId(id)){
            throw new UnsupportedServiceException("Id não é valido!");
        }
        Long idFuncionarioBd = validaIdService.convertToLong(id);
        funcionarioService.delete(idFuncionarioBd);

        return ResponseEntity.noContent().build();
    }
}
