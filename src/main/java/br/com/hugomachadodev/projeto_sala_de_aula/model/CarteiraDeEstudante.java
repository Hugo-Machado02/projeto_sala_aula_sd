package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_carteira_estudante")
public class CarteiraDeEstudante implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCarteira;

    @Column(name = "numero_carteira", nullable = false, length = 20)
    String numeroCarteira;

    @Column(name = "data_emissao", nullable = false)
    LocalDate dataEmissao;

    @Column(name = "data_validade", nullable = false)
    LocalDate dataValidade;

    @OneToOne
    @JoinColumn(name = "id_aluno", nullable = false)
    Aluno aluno;

    public CarteiraDeEstudante() {}

    public Long getIdCarteira() {
        return idCarteira;
    }

    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(String numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCarteira == null) ? 0 : idCarteira.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CarteiraDeEstudante other = (CarteiraDeEstudante) obj;
        if (idCarteira == null) {
            if (other.idCarteira != null)
                return false;
        } else if (!idCarteira.equals(other.idCarteira))
            return false;
        return true;
    }
}