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

import br.com.hugomachadodev.projeto_sala_de_aula.model.CarteiraDeEstudante;
import br.com.hugomachadodev.projeto_sala_de_aula.services.CarteiraDeEstudanteService;

@RestController
@RequestMapping("/api/carteira")
public class CarteiraDeEstudanteController {

    @Autowired
    private CarteiraDeEstudanteService service;

    @GetMapping
    public List<CarteiraDeEstudante> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CarteiraDeEstudante findById(@PathVariable(value = "id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    public CarteiraDeEstudante create(@RequestBody CarteiraDeEstudante carteira) {
        return service.create(carteira);
    }

    @PutMapping
    public CarteiraDeEstudante update(@RequestBody CarteiraDeEstudante carteira) {
        return service.update(carteira);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}