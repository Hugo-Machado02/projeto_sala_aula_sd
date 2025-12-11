package br.com.hugomachadodev.projeto_sala_de_aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Universidade;
import br.com.hugomachadodev.projeto_sala_de_aula.services.UniversidadeService;

@RestController
@RequestMapping("/api/universidade")
public class UniversidadeController {

    @Autowired
    private UniversidadeService service;

    @GetMapping
    public List<Universidade> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Universidade findById(@PathVariable(value = "id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Universidade create(@RequestBody Universidade universidade) {
        return service.create(universidade);
    }

    @PutMapping
    public Universidade update(@RequestBody Universidade universidade) {
        return service.update(universidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}