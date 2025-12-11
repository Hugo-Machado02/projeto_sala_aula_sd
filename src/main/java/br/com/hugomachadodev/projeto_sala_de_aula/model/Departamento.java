package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDepartamento;

    @Column(name = "nome", nullable = false, length = 50)
    String nome;
    
    @Column(name = "sigla", nullable = false, length = 10)
    String sigla;
    
    @Column(name = "centro_academico", nullable = false, length = 60)
    String centroAcademico;
    
    @Column(name = "chefe_departamento", nullable = false, length = 60)
    String chefeDepartamento;
    
    @Column(name = "email_contato", nullable = false, length = 100)
    String emailContato;
    
    @Column(name = "telefone", nullable = false, length = 25)
    String telefone;
    
    @Column(name = "localizacao", nullable = false, length = 150)
    String localizacao;

    public Departamento() {}

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCentroAcademico() {
        return centroAcademico;
    }

    public void setCentroAcademico(String centroAcademico) {
        this.centroAcademico = centroAcademico;
    }

    public String getChefeDepartamento() {
        return chefeDepartamento;
    }

    public void setChefeDepartamento(String chefeDepartamento) {
        this.chefeDepartamento = chefeDepartamento;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idDepartamento == null) ? 0 : idDepartamento.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
        result = prime * result + ((centroAcademico == null) ? 0 : centroAcademico.hashCode());
        result = prime * result + ((chefeDepartamento == null) ? 0 : chefeDepartamento.hashCode());
        result = prime * result + ((emailContato == null) ? 0 : emailContato.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((localizacao == null) ? 0 : localizacao.hashCode());
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
        Departamento other = (Departamento) obj;
        if (idDepartamento == null) {
            if (other.idDepartamento != null)
                return false;
        } else if (!idDepartamento.equals(other.idDepartamento))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (sigla == null) {
            if (other.sigla != null)
                return false;
        } else if (!sigla.equals(other.sigla))
            return false;
        if (centroAcademico == null) {
            if (other.centroAcademico != null)
                return false;
        } else if (!centroAcademico.equals(other.centroAcademico))
            return false;
        if (chefeDepartamento == null) {
            if (other.chefeDepartamento != null)
                return false;
        } else if (!chefeDepartamento.equals(other.chefeDepartamento))
            return false;
        if (emailContato == null) {
            if (other.emailContato != null)
                return false;
        } else if (!emailContato.equals(other.emailContato))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (localizacao == null) {
            if (other.localizacao != null)
                return false;
        } else if (!localizacao.equals(other.localizacao))
            return false;
        return true;
    }

    


}


