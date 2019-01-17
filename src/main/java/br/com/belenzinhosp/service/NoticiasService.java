package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.ResultMap;
import br.com.belenzinhosp.model.entity.AtividadePrestador;
import br.com.belenzinhosp.model.entity.Noticias;
import br.com.belenzinhosp.repository.AtividadePrestadorRepository;
import br.com.belenzinhosp.repository.NoticiasRepository;
import org.glassfish.jersey.internal.guava.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class NoticiasService {

    @Autowired
    private NoticiasRepository noticiasRepository;

    public List<Noticias> getAll(Integer qtde){
        List<Noticias> list = new ArrayList<>();
        Iterable<Noticias> noticias = noticiasRepository.findAll();
        list = Lists.newArrayList(noticias);
        return list;
    }
}
