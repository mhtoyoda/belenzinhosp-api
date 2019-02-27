package br.com.belenzinhosp.util;

import org.springframework.stereotype.Service;

@Service
public class LogradouroUtil {

    public String getEndereco(String logradouro, String numero) {
        String[] logradouros = logradouro.split(",");
        if(logradouros == null){
            return String.format("%s, %s", "Não Informado", numero);
        }
        if(logradouros.length == 2){
            return String.format("%s %s, %s", logradouros[1], logradouros[0], numero);
        }else{
            return String.format("%s %s, %s", "Rua", logradouros[0], numero);
        }
    }
}
