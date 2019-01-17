package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.entity.Noticias;
import br.com.belenzinhosp.service.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticiasResource {

    @Autowired
    private NoticiasService noticiasService;

    @GetMapping("/api/noticias")
    public ResponseEntity<List<Noticias>> noticias(@RequestParam("type") Integer qtde) {
        List<Noticias> list = noticiasService.getAll(qtde);
        return ResponseEntity.ok(list);
    }
}
