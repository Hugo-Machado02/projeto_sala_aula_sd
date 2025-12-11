package br.com.hugomachadodev.projeto_sala_de_aula.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Departamento;


@Service
public class DepartamentoService {

    public Departamento findbyId(String id){
        Departamento departamento = new Departamento(
            "Administração - Mock",
            "ADM - Mock",
            "Tecnologia - Mock",
            "Heitor Mathias - Mock",
            "adm.tec@universidade.com - Mock",
            "(64) 97257-3098 - Mock",
            "Sala 5 - Bloco B - Mock"
        );

        return departamento;
    }

    public List<Departamento> findAll(){
        List<Departamento> departamentos = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Departamento departamento = mockDepartamento(i);
            departamentos.add(departamento);
        }
        return departamentos;
    }

    public Departamento create(Departamento departamento) {
		return departamento;
	}

    public Departamento update(Departamento departamento) {
		return departamento;
	}

    public Departamento delete(Departamento departamento) {
		return departamento;
	}



    private Departamento mockDepartamento(int i) {
        Departamento departamento = new Departamento(
            "Administração - " + i,
            "ADM - " + i,
            "Tecnologia - " + i,
            "Heitor Mathias - " + i,
            "adm.tec@universidade.com - " + i,
            "(64) 97257-3098 - " + i,
            "Sala 5 - Bloco B - " + i
        );

        return departamento;
    }
}

