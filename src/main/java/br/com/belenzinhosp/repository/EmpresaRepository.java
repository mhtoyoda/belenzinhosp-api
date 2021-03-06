package br.com.belenzinhosp.repository;

import br.com.belenzinhosp.model.entity.Empresa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Integer> {

    @Query("SELECT e FROM Empresa e WHERE UPPER(e.nomeEmpresa) LIKE %:term% ORDER BY e.nomeEmpresa ASC")
    Optional<List<Empresa>> find(@Param("term") String term);

    @Query("SELECT e FROM Empresa e WHERE UPPER(e.nomeAtividadeComercial) LIKE %:term% ORDER BY e.nomeEmpresa ASC")
    Optional<List<Empresa>> findByTipoNegocio(@Param("term") String term);
}
