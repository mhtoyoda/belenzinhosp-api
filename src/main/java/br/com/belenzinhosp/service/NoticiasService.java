package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.entity.Noticias;
import br.com.belenzinhosp.repository.NoticiasRepository;
import org.glassfish.jersey.internal.guava.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class NoticiasService {

    @Autowired
    private NoticiasRepository noticiasRepository;

    public List<Noticias> getNoticiasActives(){
        List<Noticias> list = new ArrayList<>();
        Optional<List<Noticias>> noticiasActives = noticiasRepository.findNoticiasActives();
        if(noticiasActives.isPresent()){
            list = Lists.newArrayList(noticiasActives.get());
        }
        return list;
    }
}
