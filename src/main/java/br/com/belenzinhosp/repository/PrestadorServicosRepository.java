package br.com.belenzinhosp.repository;

import br.com.belenzinhosp.model.entity.PrestadorServicos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PrestadorServicosRepository extends CrudRepository<PrestadorServicos, Integer> {

    @Query("SELECT p FROM PrestadorServicos p WHERE UPPER(p.name) LIKE %:term% ORDER BY p.name")
    Optional<List<PrestadorServicos>> findPrestadorServicos(@Param("term") String term);
}
