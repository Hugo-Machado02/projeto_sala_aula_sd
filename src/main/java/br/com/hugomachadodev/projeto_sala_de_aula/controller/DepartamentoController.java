package br.com.hugomachadodev.projeto_sala_de_aula.controller;

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
import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.UnsupportedServiceException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Departamento;
import br.com.hugomachadodev.projeto_sala_de_aula.services.DepartamentoService;
import br.com.hugomachadodev.projeto_sala_de_aula.services.ValidaIdService;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @Autowired
    private ValidaIdService validaIdService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Departamento findbyIdDepartamento(@PathVariable (value = "id") String id){
        if(!validaIdService.validaId(id)){
            throw new UnsupportedServiceException("Id não é valido!");
        }

        Long idDepartamentoBd = validaIdService.convertToLong(id);
        return departamentoService.findbyId(idDepartamentoBd);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Departamento> findAllDepartamento() {
        return departamentoService.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Departamento createDepartamento(@RequestBody Departamento departamento) {
        return departamentoService.create(departamento);
    }

    @PutMapping(produces=MediaType.APPLICATION_JSON_VALUE,
                    consumes=MediaType.APPLICATION_JSON_VALUE)
	public Departamento updateDepartamento(@RequestBody Departamento departamento) {
        return departamentoService.update(departamento);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteDepartamento(@PathVariable (value = "id") String id) {
        if(!validaIdService.validaId(id)){
            throw new UnsupportedServiceException("Id não é valido!");
        }
        Long idDepartamentoBd = validaIdService.convertToLong(id);
        departamentoService.delete(idDepartamentoBd);

        return ResponseEntity.noContent().build();
    }
}
