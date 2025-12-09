package br.com.hugomachadodev.projeto_sala_de_aula.services;

import org.springframework.stereotype.Service;

@Service
public class ValidaIdService {
    public boolean validaId(String id){
        if (id == null || id.trim().isEmpty()) {
            return false;
        }

        id = id.trim();

        if (!id.matches("\\d+")) {
            return false;
        }

        return (convertToLong(id) >= 1);
    }

    public Long convertToLong(String id){
        return Long.parseLong(id);
    }
}
