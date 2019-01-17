package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.ResultMap;
import br.com.belenzinhosp.service.AtividadeProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtividadeProfissionalResource {

    @Autowired
    private AtividadeProfissionalService atividadeProfissionalService;

    @GetMapping("/api/atividade-profissional")
    public ResponseEntity<List<ResultMap>> atividadeProfissional() {
        List<ResultMap> list = atividadeProfissionalService.getAll();
        return ResponseEntity.ok(list);
    }
}
