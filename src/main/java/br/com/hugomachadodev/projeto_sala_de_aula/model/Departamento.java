package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;
import java.util.UUID;

public class Departamento implements Serializable{
    private static final long serialVersionUID = 1L;
    final UUID id_departamento;
    String nome;
    String sigla;
    String centro_academico;
    String chefe_departamento;
    String email_contato;
    String telefone;
    String localizacao;

    public Departamento(String nome, String sigla, String centro_academico,
            String chefe_departamento, String email_contato, String telefone, String localizacao) {
        this.id_departamento = UUID.randomUUID();
        this.nome = nome;
        this.sigla = sigla;
        this.centro_academico = centro_academico;
        this.chefe_departamento = chefe_departamento;
        this.email_contato = email_contato;
        this.telefone = telefone;
        this.localizacao = localizacao;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UUID getId_departamento() {
        return id_departamento;
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

    public String getCentro_academico() {
        return centro_academico;
    }

    public void setCentro_academico(String centro_academico) {
        this.centro_academico = centro_academico;
    }

    public String getChefe_departamento() {
        return chefe_departamento;
    }

    public void setChefe_departamento(String chefe_departamento) {
        this.chefe_departamento = chefe_departamento;
    }

    public String getEmail_contato() {
        return email_contato;
    }

    public void setEmail_contato(String email_contato) {
        this.email_contato = email_contato;
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
        result = prime * result + ((id_departamento == null) ? 0 : id_departamento.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
        result = prime * result + ((centro_academico == null) ? 0 : centro_academico.hashCode());
        result = prime * result + ((chefe_departamento == null) ? 0 : chefe_departamento.hashCode());
        result = prime * result + ((email_contato == null) ? 0 : email_contato.hashCode());
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
        if (id_departamento == null) {
            if (other.id_departamento != null)
                return false;
        } else if (!id_departamento.equals(other.id_departamento))
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
        if (centro_academico == null) {
            if (other.centro_academico != null)
                return false;
        } else if (!centro_academico.equals(other.centro_academico))
            return false;
        if (chefe_departamento == null) {
            if (other.chefe_departamento != null)
                return false;
        } else if (!chefe_departamento.equals(other.chefe_departamento))
            return false;
        if (email_contato == null) {
            if (other.email_contato != null)
                return false;
        } else if (!email_contato.equals(other.email_contato))
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


