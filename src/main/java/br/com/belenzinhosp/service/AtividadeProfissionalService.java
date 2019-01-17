package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.ResultMap;
import br.com.belenzinhosp.model.entity.AtividadePrestador;
import br.com.belenzinhosp.repository.AtividadePrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AtividadeProfissionalService {

    @Autowired
    private AtividadePrestadorRepository atividadePrestadorRepository;

    public List<ResultMap> getAll(){
        List<ResultMap> list = new ArrayList<>();
        Iterable<AtividadePrestador> atividades = atividadePrestadorRepository.findAll();
        atividades.forEach(atividade -> {
            list.add(new ResultMap(String.valueOf(atividade.getId()), atividade.getName()));
        });

        if(!list.isEmpty()){
            list.sort((p1, p2) -> p1.getValue().compareTo(p2.getValue()));
        }
        return list;
    }
}
