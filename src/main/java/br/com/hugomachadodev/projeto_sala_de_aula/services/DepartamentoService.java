package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.ResourceNotFoundException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Departamento;
import br.com.hugomachadodev.projeto_sala_de_aula.repositories.DepartamentoRepository;


@Service
public class DepartamentoService {
    
    @Autowired
    DepartamentoRepository departamentoRepository;

    public Departamento findbyId(Long id){
        return departamentoRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Não Há Registros para esse ID"));
    }

    public List<Departamento> findAll(){
        return departamentoRepository.findAll();
    }

    public Departamento create(Departamento aluno) {
		return departamentoRepository.save(aluno);
	}

    public Departamento update(Departamento aluno) {
        var entity = departamentoRepository.findById(aluno.getIdDepartamento()).orElseThrow(
            ()->new ResourceNotFoundException("Não Há Registros para esse ID"));

        entity.setNome(aluno.getNome());
        entity.setSigla(aluno.getSigla());
        entity.setCentroAcademico(aluno.getCentroAcademico());
        entity.setChefeDepartamento(aluno.getChefeDepartamento());
        entity.setEmailContato(aluno.getEmailContato());
        entity.setTelefone(aluno.getTelefone());

		return departamentoRepository.save(entity);
	}

    public void delete(Long id) {
		var entity = departamentoRepository.findById(id).orElseThrow(
            ()->new ResourceNotFoundException("Não Há Registros para esse ID"));
        
        departamentoRepository.delete(entity);
	}
}