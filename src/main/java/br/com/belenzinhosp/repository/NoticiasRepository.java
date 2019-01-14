package br.com.belenzinhosp.repository;

import br.com.belenzinhosp.model.entity.Noticias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiasRepository extends CrudRepository<Noticias, Integer> {

}
