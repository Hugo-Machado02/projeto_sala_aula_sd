package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_professor")
public class Professor implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProfessor;
    
    @Column(name = "nome_completo", nullable = false, length = 100)
    String nomeCompleto;
    
    @Column(name = "identificacao", nullable = false, length = 20)
    String identificacao;
    
    @Column(name = "email_institucional", nullable = false, length = 60)
    String emailInstitucional;
    
    @Column(name = "telefone", nullable = false, length = 16)
    String telefone;
    
    @Column(name = "titulacao", nullable = false, length = 50)
    String titulacao;
    
    @Column(name = "area_atuaçao", nullable = false, length = 40)
    String areaAtuacao;
    
    @Column(name = "regime_trabalho", nullable = false, length = 30)
    String regimeTrabalho;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_departamento")
    Departamento departamento;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    List<Aluno> alunos;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "professor_funcionario",
        joinColumns = @JoinColumn(name = "id_professor"),
        inverseJoinColumns = @JoinColumn(name = "id_funcionario")
    )
    List<Funcionario> funcionarios;

    public Professor() {}

    public Long getIdProfessor() {
        return idProfessor;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
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

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getRegimeTrabalho() {
        return regimeTrabalho;
    }

    public void setRegimeTrabalho(String regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idProfessor == null) ? 0 : idProfessor.hashCode());
        result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
        result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
        result = prime * result + ((emailInstitucional == null) ? 0 : emailInstitucional.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((titulacao == null) ? 0 : titulacao.hashCode());
        result = prime * result + ((areaAtuacao == null) ? 0 : areaAtuacao.hashCode());
        result = prime * result + ((regimeTrabalho == null) ? 0 : regimeTrabalho.hashCode());
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
        Professor other = (Professor) obj;
        if (idProfessor == null) {
            if (other.idProfessor != null)
                return false;
        } else if (!idProfessor.equals(other.idProfessor))
            return false;
        if (nomeCompleto == null) {
            if (other.nomeCompleto != null)
                return false;
        } else if (!nomeCompleto.equals(other.nomeCompleto))
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
        if (titulacao == null) {
            if (other.titulacao != null)
                return false;
        } else if (!titulacao.equals(other.titulacao))
            return false;
        if (areaAtuacao == null) {
            if (other.areaAtuacao != null)
                return false;
        } else if (!areaAtuacao.equals(other.areaAtuacao))
            return false;
        if (regimeTrabalho == null) {
            if (other.regimeTrabalho != null)
                return false;
        } else if (!regimeTrabalho.equals(other.regimeTrabalho))
            return false;
        return true;
    }
}


