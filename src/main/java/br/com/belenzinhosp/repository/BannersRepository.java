package br.com.belenzinhosp.repository;

import br.com.belenzinhosp.model.entity.Banners;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BannersRepository extends CrudRepository<Banners, Integer> {

    @Query("SELECT b FROM Banners b WHERE UPPER(b.liberaBanner) = 'SIM' AND b.localBanner IN (1,2,3) ORDER BY b.localBanner ASC")
    Optional<List<Banners>> findBannerLeftActives();

    @Query("SELECT b FROM Banners b WHERE UPPER(b.liberaBanner) = 'SIM' AND b.localBanner IN (4) ORDER BY b.localBanner ASC")
    Optional<List<Banners>> findBannerRightActives();
}
