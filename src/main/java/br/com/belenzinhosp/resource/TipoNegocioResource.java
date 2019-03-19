package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.ResultMap;
import br.com.belenzinhosp.service.AtividadeProfissionalService;
import br.com.belenzinhosp.service.TipoNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipoNegocioResource {

    @Autowired
    private TipoNegocioService tipoNegocioService;

    @GetMapping("/api/tipo-negocio")
    public ResponseEntity<List<ResultMap>> tipoNEgocio() {
        List<ResultMap> list = tipoNegocioService.getAll();
        return ResponseEntity.ok(list);
    }
}
