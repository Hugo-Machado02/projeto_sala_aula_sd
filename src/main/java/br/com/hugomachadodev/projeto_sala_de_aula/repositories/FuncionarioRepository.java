package br.com.hugomachadodev.projeto_sala_de_aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hugomachadodev.projeto_sala_de_aula.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}