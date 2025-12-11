package br.com.hugomachadodev.projeto_sala_de_aula.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_universidade")
public class Universidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUniversidade;

    @Column(name = "nome_universidade", nullable = false, length = 100)
    String nomeUniversidade;

    @Column(name = "sigla_universidade", nullable = false, length = 10)
    String siglaUniversidade;

    @Column(name = "tipo", nullable = false, length = 20)
    String tipo;

    @OneToMany(mappedBy = "universidade", cascade = CascadeType.ALL)
    List<Departamento> departamentos;

    public Universidade() {}

    public Long getIdUniversidade() {
        return idUniversidade;
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public String getSiglaUniversidade() {
        return siglaUniversidade;
    }

    public void setSiglaUniversidade(String siglaUniversidade) {
        this.siglaUniversidade = siglaUniversidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idUniversidade == null) ? 0 : idUniversidade.hashCode());
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
        Universidade other = (Universidade) obj;
        if (idUniversidade == null) {
            if (other.idUniversidade != null)
                return false;
        } else if (!idUniversidade.equals(other.idUniversidade))
            return false;
        return true;
    }
}