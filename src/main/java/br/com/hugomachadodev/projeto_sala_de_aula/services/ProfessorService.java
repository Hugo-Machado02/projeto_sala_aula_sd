package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Professor;

@Service
public class ProfessorService {

    public Professor findbyId(String id){
        Professor professor = new Professor(
            "Professor da Silva - Busca por ID",
            "89783823234",
            "professor.silva@estudante.ifgoiano.edu.br",
            "63999999999",
            "Mestre",
            "Tecnologia",
            "40h"
        );

        return professor;
    }

    public List<Professor> findAll(){
        List<Professor> professores = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Professor professor = mockProfessores(i);
            professores.add(professor);
        }
        return professores;
    }

    public Professor create(Professor professor) {
		return professor;
	}

    public Professor update(Professor professor) {
		return professor;
	}

    public Professor delete(Professor professor) {
		return professor;
	}



    private Professor mockProfessores(int i) {
        Professor professor = new Professor(
            "Professor da Silva "+ i +" - Mock",
            "89783823234",
            "professor.silva@estudante.ifgoiano.edu.br",
            "63999999999",
            "Mestre",
            "Tecnologia",
            "40h"
        );

        return professor;
    }
}

