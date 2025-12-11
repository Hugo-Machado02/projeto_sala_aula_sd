package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.ResourceNotFoundException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.CarteiraDeEstudante;
import br.com.hugomachadodev.projeto_sala_de_aula.repositories.CarteiraDeEstudanteRepository;

@Service
public class CarteiraDeEstudanteService {

    @Autowired
    CarteiraDeEstudanteRepository repository;

    public List<CarteiraDeEstudante> findAll() {
        return repository.findAll();
    }

    public CarteiraDeEstudante findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Carteira de estudante não encontrada"));
    }

    public CarteiraDeEstudante create(CarteiraDeEstudante carteira) {
        return repository.save(carteira);
    }

    public CarteiraDeEstudante update(CarteiraDeEstudante carteira) {
        var entity = repository.findById(carteira.getIdCarteira())
                .orElseThrow(() -> new ResourceNotFoundException("Carteira de estudante não encontrada"));
        
        entity.setNumeroCarteira(carteira.getNumeroCarteira());
        entity.setDataEmissao(carteira.getDataEmissao());
        entity.setDataValidade(carteira.getDataValidade());
        entity.setAluno(carteira.getAluno());
        
        return repository.save(entity);
    }

    public void delete(Long id) {
        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Carteira de estudante não encontrada"));
        repository.delete(entity);
    }
}