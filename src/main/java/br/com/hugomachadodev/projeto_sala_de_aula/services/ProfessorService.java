package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.ResourceNotFoundException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Professor;
import br.com.hugomachadodev.projeto_sala_de_aula.repositories.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;


    public Professor findbyId(Long id){
        return professorRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Não Há Registros para esse ID"));
    }

    public List<Professor> findAll(){
        return professorRepository.findAll();
    }

    public Professor create(Professor professor) {
		return professorRepository.save(professor);
	}

    public Professor update(Professor professor) {
        var entity = professorRepository.findById(professor.getIdProfessor()).orElseThrow(
            ()->new ResourceNotFoundException("Não Há Registros para esse ID"));

        entity.setNomeCompleto(professor.getNomeCompleto());
        entity.setIdentificacao(professor.getIdentificacao());
        entity.setEmailInstitucional(professor.getEmailInstitucional());
        entity.setTelefone(professor.getIdentificacao());
        entity.setTitulacao(professor.getTelefone());
        entity.setAreaAtuacao(professor.getAreaAtuacao());
        entity.setRegimeTrabalho(professor.getRegimeTrabalho());

		return professorRepository.save(entity);
	}

    public void delete(Long id) {
		var entity = professorRepository.findById(id).orElseThrow(
            ()->new ResourceNotFoundException("Não Há Registros para esse ID"));
        
        professorRepository.delete(entity);
	}
}