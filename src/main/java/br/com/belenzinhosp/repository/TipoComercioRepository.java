package br.com.belenzinhosp.repository;

import br.com.belenzinhosp.model.TipoComercio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoComercioRepository extends CrudRepository<TipoComercio, Integer> {

}
