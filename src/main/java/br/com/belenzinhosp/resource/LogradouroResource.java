package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.ResultMap;
import br.com.belenzinhosp.service.AtividadeProfissionalService;
import br.com.belenzinhosp.service.LogradouroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogradouroResource {

    @Autowired
    private LogradouroService logradouroService;

    @GetMapping("/api/logradouro")
    public ResponseEntity<List<ResultMap>> logradouro() {
        List<ResultMap> list = logradouroService.getAll();
        return ResponseEntity.ok(list);
    }
}
