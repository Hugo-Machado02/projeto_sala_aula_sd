package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.ResourceNotFoundException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Universidade;
import br.com.hugomachadodev.projeto_sala_de_aula.repositories.UniversidadeRepository;

@Service
public class UniversidadeService {

    @Autowired
    UniversidadeRepository repository;

    public List<Universidade> findAll() {
        return repository.findAll();
    }

    public Universidade findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Universidade não encontrada"));
    }

    public Universidade create(Universidade universidade) {
        return repository.save(universidade);
    }

    public Universidade update(Universidade universidade) {
        var entity = repository.findById(universidade.getIdUniversidade())
                .orElseThrow(() -> new ResourceNotFoundException("Universidade não encontrada"));
        
        entity.setNomeUniversidade(universidade.getNomeUniversidade());
        entity.setSiglaUniversidade(universidade.getSiglaUniversidade());
        entity.setTipo(universidade.getTipo());
        
        return repository.save(entity);
    }

    public void delete(Long id) {
        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Universidade não encontrada"));
        repository.delete(entity);
    }
}