package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.util.UUID;

public class Professor {
    final UUID id_professor;
    String nome_completo;
    String identificacao;
    String email_institucional;
    String telefone;
    String titulacao;
    String area_de_atuacao;
    String regime_trabalho;
    public Professor(String nome_completo, String identificacao, String email_institucional,
            String telefone, String titulacao, String area_de_atuacao, String regime_trabalho) {
        this.id_professor = UUID.randomUUID();
        this.nome_completo = nome_completo;
        this.identificacao = identificacao;
        this.email_institucional = email_institucional;
        this.telefone = telefone;
        this.titulacao = titulacao;
        this.area_de_atuacao = area_de_atuacao;
        this.regime_trabalho = regime_trabalho;
    }
    public UUID getId_professor() {
        return id_professor;
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
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    public String getArea_de_atuacao() {
        return area_de_atuacao;
    }
    public void setArea_de_atuacao(String area_de_atuacao) {
        this.area_de_atuacao = area_de_atuacao;
    }
    public String getRegime_trabalho() {
        return regime_trabalho;
    }
    public void setRegime_trabalho(String regime_trabalho) {
        this.regime_trabalho = regime_trabalho;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_professor == null) ? 0 : id_professor.hashCode());
        result = prime * result + ((nome_completo == null) ? 0 : nome_completo.hashCode());
        result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
        result = prime * result + ((email_institucional == null) ? 0 : email_institucional.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((titulacao == null) ? 0 : titulacao.hashCode());
        result = prime * result + ((area_de_atuacao == null) ? 0 : area_de_atuacao.hashCode());
        result = prime * result + ((regime_trabalho == null) ? 0 : regime_trabalho.hashCode());
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
        if (id_professor == null) {
            if (other.id_professor != null)
                return false;
        } else if (!id_professor.equals(other.id_professor))
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
        if (titulacao == null) {
            if (other.titulacao != null)
                return false;
        } else if (!titulacao.equals(other.titulacao))
            return false;
        if (area_de_atuacao == null) {
            if (other.area_de_atuacao != null)
                return false;
        } else if (!area_de_atuacao.equals(other.area_de_atuacao))
            return false;
        if (regime_trabalho == null) {
            if (other.regime_trabalho != null)
                return false;
        } else if (!regime_trabalho.equals(other.regime_trabalho))
            return false;
        return true;
    }

    
}


