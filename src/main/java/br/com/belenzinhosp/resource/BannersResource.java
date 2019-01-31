package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.entity.Banners;
import br.com.belenzinhosp.repository.BannersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class BannersResource {

    @Autowired
    private BannersRepository bannersRepository;

    @GetMapping("/api/banner/left")
    public ResponseEntity<List<Banners>> bannersLeft() {
        List<Banners> banners = Collections.emptyList();
        Optional<List<Banners>> bannerLeftActives = bannersRepository.findBannerLeftActives();
        if (bannerLeftActives.isPresent()) {
            banners = bannerLeftActives.get();
            if (banners.size() > 3) {
                banners = banners.subList(0, 2);
            }
        }
        return ResponseEntity.ok(banners);
    }

    @GetMapping("/api/banner/right")
    public ResponseEntity<List<Banners>> bannersRight() {
        List<Banners> banners = Collections.emptyList();
        Optional<List<Banners>> bannerRightActives = bannersRepository.findBannerRightActives();
        if (bannerRightActives.isPresent()) {
            banners = bannerRightActives.get();
            if (banners.size() > 1) {
                banners = banners.subList(0, 0);
            }
        }
        return ResponseEntity.ok(banners);
    }
}
