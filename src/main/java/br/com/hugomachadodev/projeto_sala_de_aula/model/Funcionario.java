package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFuncionario;

    @Column(name = "nome_completo", nullable = false, length = 100)
    String nomeCompleto;

    @Column(name = "identificacao", nullable = false, length = 20)
    String identificacao;

    @Column(name = "email_institucional", nullable = false, length = 60)
    String emailInstitucional;

    @Column(name = "telefone", nullable = false, length = 16)
    String telefone;

    @Column(name = "cargo", nullable = false, length = 50)
    String cargo;

    @Column(name = "tipo_vinculo", nullable = false, length = 30)
    String tipoVinculo;

    public Funcionario(){}

    public Long getIdFuncionario() {
        return idFuncionario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idFuncionario == null) ? 0 : idFuncionario.hashCode());
        result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
        result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
        result = prime * result + ((emailInstitucional == null) ? 0 : emailInstitucional.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + ((tipoVinculo == null) ? 0 : tipoVinculo.hashCode());
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
        if (idFuncionario == null) {
            if (other.idFuncionario != null)
                return false;
        } else if (!idFuncionario.equals(other.idFuncionario))
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
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (tipoVinculo == null) {
            if (other.tipoVinculo != null)
                return false;
        } else if (!tipoVinculo.equals(other.tipoVinculo))
            return false;
        return true;
    }

    
    
}
