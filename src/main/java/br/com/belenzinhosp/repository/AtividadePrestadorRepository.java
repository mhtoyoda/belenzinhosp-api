package br.com.belenzinhosp.repository;

import br.com.belenzinhosp.model.entity.AtividadePrestador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadePrestadorRepository extends CrudRepository<AtividadePrestador, Integer> {

}
