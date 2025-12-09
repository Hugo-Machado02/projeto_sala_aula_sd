package br.com.hugomachadodev.projeto_sala_de_aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
