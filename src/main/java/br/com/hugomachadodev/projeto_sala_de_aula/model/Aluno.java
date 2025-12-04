package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;
import java.util.UUID;

public class Aluno implements Serializable{
    private static final long serialVersionUID = 1L;
    final UUID id_aluno;
    String nome_completo;
    String data_nascimento;
    String identificacao;
    String email_institucional;
    String telefone;

    public Aluno(String nome_completo, String data_nascimento, String identificacao,
            String email_institucional, String telefone) {
        this.id_aluno = UUID.randomUUID();
        this.nome_completo = nome_completo;
        this.data_nascimento = data_nascimento;
        this.identificacao = identificacao;
        this.email_institucional = email_institucional;
        this.telefone = telefone;
    }

    public UUID getId_aluno() {
        return id_aluno;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getEmail_institucional() {
        return email_institucional;
    }

    public void setEmail_institucional(String email_institucional) {
        this.email_institucional = email_institucional;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_aluno == null) ? 0 : id_aluno.hashCode());
        result = prime * result + ((nome_completo == null) ? 0 : nome_completo.hashCode());
        result = prime * result + ((data_nascimento == null) ? 0 : data_nascimento.hashCode());
        result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
        result = prime * result + ((email_institucional == null) ? 0 : email_institucional.hashCode());
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
        if (id_aluno == null) {
            if (other.id_aluno != null)
                return false;
        } else if (!id_aluno.equals(other.id_aluno))
            return false;
        if (nome_completo == null) {
            if (other.nome_completo != null)
                return false;
        } else if (!nome_completo.equals(other.nome_completo))
            return false;
        if (data_nascimento == null) {
            if (other.data_nascimento != null)
                return false;
        } else if (!data_nascimento.equals(other.data_nascimento))
            return false;
        if (identificacao == null) {
            if (other.identificacao != null)
                return false;
        } else if (!identificacao.equals(other.identificacao))
            return false;
        if (email_institucional == null) {
            if (other.email_institucional != null)
                return false;
        } else if (!email_institucional.equals(other.email_institucional))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        return true;
    }
}
