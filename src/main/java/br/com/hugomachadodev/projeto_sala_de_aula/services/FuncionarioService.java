package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.exception.ResourceNotFoundException;
import br.com.hugomachadodev.projeto_sala_de_aula.model.Funcionario;
import br.com.hugomachadodev.projeto_sala_de_aula.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;


    public Funcionario findbyId(Long id){
        return funcionarioRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Não Há Registros para esse ID"));
    }

    public List<Funcionario> findAll(){
        return funcionarioRepository.findAll();
    }

    public Funcionario create(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

    public Funcionario update(Funcionario funcionario) {
        var entity = funcionarioRepository.findById(funcionario.getIdFuncionario()).orElseThrow(
            ()->new ResourceNotFoundException("Não Há Registros para esse ID"));

        entity.setNomeCompleto(funcionario.getNomeCompleto());
        entity.setIdentificacao(funcionario.getIdentificacao());
        entity.setEmailInstitucional(funcionario.getEmailInstitucional());
        entity.setTelefone(funcionario.getTelefone());
        entity.setCargo(funcionario.getCargo());
        entity.setTipoVinculo(funcionario.getTipoVinculo());

		return funcionarioRepository.save(entity);
	}

    public void delete(Long id) {
		var entity = funcionarioRepository.findById(id).orElseThrow(
            ()->new ResourceNotFoundException("Não Há Registros para esse ID"));
        
        funcionarioRepository.delete(entity);
	}
}