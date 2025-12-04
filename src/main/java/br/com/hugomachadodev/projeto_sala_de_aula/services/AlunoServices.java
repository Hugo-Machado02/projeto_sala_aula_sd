package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Aluno;

@Service
public class AlunoServices {

    public Aluno findbyId(String id){
        Aluno aluno = new Aluno(
            "Aluno da Silva - Busca por ID",
            "10/10/2000",
            "89783823234",
            "teste.silva@estudante.ifgoiano.edu.br",
            "63999999999"
        );

        return aluno;
    }

    public List<Aluno> findAll(){
        List<Aluno> alunos = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Aluno aluno = mockAlunos(i);
            alunos.add(aluno);
        }
        return alunos;
    }

    public Aluno create(Aluno aluno) {
		return aluno;
	}

    public Aluno update(Aluno aluno) {
		return aluno;
	}

    public Aluno delete(Aluno aluno) {
		return aluno;
	}



    private Aluno mockAlunos(int i) {
        Aluno aluno = new Aluno(
            "Aluno da Silva "+ i +" - Busca por ID",
            "10/10/2000",
            "89783823234",
            "teste.silva@estudante.ifgoiano.edu.br",
            "63999999999"
        );

        return aluno;
    }
}

