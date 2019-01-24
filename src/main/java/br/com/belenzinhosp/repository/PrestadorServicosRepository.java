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

    @Query("SELECT p FROM PrestadorServicos p INNER JOIN AtividadePrestador a ON a.id = p.atividadePrestadorId WHERE UPPER(a.name) LIKE %:term% AND UPPER(p.ativacao) = 'SIM' ORDER BY p.name ASC")
    Optional<List<PrestadorServicos>> findPrestadorServicos(@Param("term") String term);
}
