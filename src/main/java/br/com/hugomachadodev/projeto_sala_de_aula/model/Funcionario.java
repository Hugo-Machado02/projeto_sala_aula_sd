package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;
import java.util.UUID;

public class Funcionario implements Serializable{
    final UUID id_funcionario;
    String nome_completo;
    String identificacao;
    String email_institucional;
    String telefone;
    String cargo;
    String tipo_vinculo;

    public Funcionario(String nome_completo, String identificacao, String email_institucional,
            String telefone, String cargo, String tipo_vinculo) {
        this.id_funcionario = UUID.randomUUID();
        this.nome_completo = nome_completo;
        this.identificacao = identificacao;
        this.email_institucional = email_institucional;
        this.telefone = telefone;
        this.cargo = cargo;
        this.tipo_vinculo = tipo_vinculo;
    }

    public UUID getId_funcionario() {
        return id_funcionario;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipo_vinculo() {
        return tipo_vinculo;
    }

    public void setTipo_vinculo(String tipo_vinculo) {
        this.tipo_vinculo = tipo_vinculo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_funcionario == null) ? 0 : id_funcionario.hashCode());
        result = prime * result + ((nome_completo == null) ? 0 : nome_completo.hashCode());
        result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
        result = prime * result + ((email_institucional == null) ? 0 : email_institucional.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + ((tipo_vinculo == null) ? 0 : tipo_vinculo.hashCode());
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
        Funcionario other = (Funcionario) obj;
        if (id_funcionario == null) {
            if (other.id_funcionario != null)
                return false;
        } else if (!id_funcionario.equals(other.id_funcionario))
            return false;
        if (nome_completo == null) {
            if (other.nome_completo != null)
                return false;
        } else if (!nome_completo.equals(other.nome_completo))
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
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (tipo_vinculo == null) {
            if (other.tipo_vinculo != null)
                return false;
        } else if (!tipo_vinculo.equals(other.tipo_vinculo))
            return false;
        return true;
    }
}
