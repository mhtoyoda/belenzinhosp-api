package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.ResultMap;
import br.com.belenzinhosp.model.entity.AtividadePrestador;
import br.com.belenzinhosp.model.entity.TipoComercio;
import br.com.belenzinhosp.repository.AtividadePrestadorRepository;
import br.com.belenzinhosp.repository.TipoComercioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TipoNegocioService {

    @Autowired
    private TipoComercioRepository tipoComercioRepository;

    public List<ResultMap> getAll(){
        List<ResultMap> list = new ArrayList<>();
        Iterable<TipoComercio> tipos = tipoComercioRepository.findAll();
        tipos.forEach(tipo -> {
            list.add(new ResultMap(String.valueOf(tipo.getId()), tipo.getName()));
        });

        if(!list.isEmpty()){
            list.sort((p1, p2) -> p1.getValue().compareTo(p2.getValue()));
        }
        return list;
    }
}
