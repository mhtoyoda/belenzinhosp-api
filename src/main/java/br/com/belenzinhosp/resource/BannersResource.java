package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.entity.Banners;
import br.com.belenzinhosp.service.BannersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BannersResource {

    @Autowired
    private BannersService bannersService;

    @GetMapping("/api/banner/left")
    public ResponseEntity<List<Banners>> bannersLeft() {
        List<Banners> banners = bannersService.findBannerLeftActives();
        if (!banners.isEmpty()) {
            if (banners.size() > 3) {
                banners = banners.subList(0, 2);
            }
        }
        return ResponseEntity.ok(banners);
    }

    @GetMapping("/api/banner/right")
    public ResponseEntity<List<Banners>> bannersRight() {
        List<Banners> banners = bannersService.findBannerRightActives();
        if (!banners.isEmpty()) {
            if (banners.size() > 1) {
                banners = banners.subList(0, 0);
            }
        }
        return ResponseEntity.ok(banners);
    }
}