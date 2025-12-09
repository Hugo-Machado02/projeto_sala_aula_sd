package br.com.hugomachadodev.projeto_sala_de_aula.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.ResourceNotFoundException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Aluno;
import br.com.hugomachadodev.projeto_sala_de_aula.repositories.AlunoRepository;

@Service
public class AlunoServices {

    @Autowired
    AlunoRepository alunoRepository;


    public Aluno findbyId(Long id){
        return alunoRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Não Há Registros para esse ID"));
    }

    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    public Aluno create(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

    public Aluno update(Aluno aluno) {
        var entity = alunoRepository.findById(aluno.getIdAluno()).orElseThrow(
            ()->new ResourceNotFoundException("Não Há Registros para esse ID"));

        entity.setNomeCompleto(aluno.getNomeCompleto());
        entity.setDataNascimento(aluno.getDataNascimento());
        entity.setIdentificacao(aluno.getIdentificacao());
        entity.setEmailInstitucional(aluno.getEmailInstitucional());
        entity.setTelefone(aluno.getTelefone());

		return alunoRepository.save(entity);
	}

    public void delete(Long id) {
		var entity = alunoRepository.findById(id).orElseThrow(
            ()->new ResourceNotFoundException("Não Há Registros para esse ID"));
        
        alunoRepository.delete(entity);
	}
}

