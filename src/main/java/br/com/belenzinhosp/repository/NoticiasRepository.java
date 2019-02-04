package br.com.belenzinhosp.repository;

import br.com.belenzinhosp.model.entity.Banners;
import br.com.belenzinhosp.model.entity.Noticias;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoticiasRepository extends CrudRepository<Noticias, Integer> {

    @Query("SELECT b FROM Noticias b WHERE b.dateBloqueio IS NULL ORDER BY b.dateEntrada DESC")
    Optional<List<Noticias>> findNoticiasActives();
}
