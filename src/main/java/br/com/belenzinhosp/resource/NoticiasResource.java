package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.entity.Noticias;
import br.com.belenzinhosp.service.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NoticiasResource {

    @Autowired
    private NoticiasService noticiasService;

    @GetMapping("/api/noticias")
    public ResponseEntity<List<Noticias>> noticias() {
        List<Noticias> noticias = new ArrayList<>();
        List<Noticias> list = noticiasService.getNoticiasActives();
        if (!list.isEmpty()) {
            if (list.size() > 3) {
                noticias = list.subList(0, 2);
            }else{
                noticias = list;
            }
        }
        return ResponseEntity.ok(noticias);
    }
}
