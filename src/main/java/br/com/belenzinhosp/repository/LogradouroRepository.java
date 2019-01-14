package br.com.belenzinhosp.repository;

import br.com.belenzinhosp.model.entity.Logradouro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogradouroRepository extends CrudRepository<Logradouro, Integer> {

}
