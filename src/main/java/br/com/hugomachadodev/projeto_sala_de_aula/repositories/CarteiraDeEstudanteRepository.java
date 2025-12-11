package br.com.hugomachadodev.projeto_sala_de_aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hugomachadodev.projeto_sala_de_aula.model.CarteiraDeEstudante;

@Repository
public interface CarteiraDeEstudanteRepository extends JpaRepository<CarteiraDeEstudante, Long> {
}