package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAluno;

    @Column(name = "nome_completo", nullable = false, length = 100)
    String nomeCompleto;

    @Column(name = "data_nascimento", nullable = false, length = 11)
    String dataNascimento;

    @Column(name = "identificacao", nullable = false, length = 20)
    String identificacao;

    @Column(name = "email_institucional", nullable = false, length = 60)
    String emailInstitucional;

    @Column(name = "telefone", nullable = false, length = 16)
    String telefone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_professor", nullable = false)
    Professor professor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_departamento", nullable = false)
    Departamento departamento;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "aluno_funcionario",
        joinColumns = @JoinColumn(name = "id_aluno"),
        inverseJoinColumns = @JoinColumn(name = "id_funcionario")
    )
    List<Funcionario> funcionarios;

    @OneToOne(mappedBy = "aluno")
    CarteiraDeEstudante carteiraDeEstudante;

    public Aluno() {}

    public long getIdAluno() {
        return idAluno;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public CarteiraDeEstudante getCarteiraDeEstudante() {
        return carteiraDeEstudante;
    }

    public void setCarteiraDeEstudante(CarteiraDeEstudante carteiraDeEstudante) {
        this.carteiraDeEstudante = carteiraDeEstudante;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (idAluno ^ (idAluno >>> 32));
        result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
        result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
        result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
        result = prime * result + ((emailInstitucional == null) ? 0 : emailInstitucional.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
        Aluno other = (Aluno) obj;
        if (idAluno != other.idAluno)
            return false;
        if (nomeCompleto == null) {
            if (other.nomeCompleto != null)
                return false;
        } else if (!nomeCompleto.equals(other.nomeCompleto))
            return false;
        if (dataNascimento == null) {
            if (other.dataNascimento != null)
                return false;
        } else if (!dataNascimento.equals(other.dataNascimento))
            return false;
        if (identificacao == null) {
            if (other.identificacao != null)
                return false;
        } else if (!identificacao.equals(other.identificacao))
            return false;
        if (emailInstitucional == null) {
            if (other.emailInstitucional != null)
                return false;
        } else if (!emailInstitucional.equals(other.emailInstitucional))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        return true;
    }

    
}
