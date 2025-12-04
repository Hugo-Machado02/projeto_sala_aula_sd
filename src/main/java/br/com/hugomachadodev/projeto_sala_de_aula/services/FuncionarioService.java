package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Funcionario;

@Service
public class FuncionarioService {

    public Funcionario findbyId(String id){
        Funcionario funcionario = new Funcionario(
            "Funcionario Teste- Busca por ID",
            "00821167123",
            "funcionario.silva@estudante.ifgoiano.edu.br",
            "64009876543",
            "Analista SR",
            "CLT"
        );

        return funcionario;
    }

    public List<Funcionario> findAll(){
        List<Funcionario> funcionarios = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Funcionario funcionario = mockFuncionario(i);
            funcionarios.add(funcionario);
        }
        return funcionarios;
    }

    public Funcionario create(Funcionario funcionario) {
		return funcionario;
	}

    public Funcionario update(Funcionario funcionario) {
		return funcionario;
	}

    public Funcionario delete(Funcionario funcionario) {
		return funcionario;
	}



    private Funcionario mockFuncionario(int i) {
        Funcionario funcionario = new Funcionario(
            "Funcionario Teste "+ i +" Teste Mock",
            "00821167123",
            "func.silva@ifgoiano.edu.br",
            "64009876543",
            "Analista SR",
            "CLT"
        );

        return funcionario;
    }
}

