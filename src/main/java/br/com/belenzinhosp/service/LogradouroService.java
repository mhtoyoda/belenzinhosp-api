package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.ResultMap;
import br.com.belenzinhosp.model.entity.AtividadePrestador;
import br.com.belenzinhosp.model.entity.Logradouro;
import br.com.belenzinhosp.repository.AtividadePrestadorRepository;
import br.com.belenzinhosp.repository.LogradouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LogradouroService {

    @Autowired
    private LogradouroRepository logradouroRepository;

    public List<ResultMap> getAll(){
        List<ResultMap> list = new ArrayList<>();
        Iterable<Logradouro> atividades = logradouroRepository.findAll();
        atividades.forEach(logradouro -> {
            list.add(new ResultMap(String.valueOf(logradouro.getId()), logradouro.getName()));
        });

        if(!list.isEmpty()){
            list.sort((p1, p2) -> p1.getValue().compareTo(p2.getValue()));
        }
        return list;
    }
}
