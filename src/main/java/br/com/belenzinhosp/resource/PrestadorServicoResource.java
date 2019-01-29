package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.PrestadorResource;
import br.com.belenzinhosp.model.entity.PrestadorServicos;
import br.com.belenzinhosp.service.PrestadorServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestadorServicoResource {

    @Autowired
    private PrestadorServicoService prestadorServicoService;

    @PostMapping("/api/prestador-servico")
    public ResponseEntity<PrestadorServicos> prestadorServico(PrestadorResource prestadorResource) {
        PrestadorServicos prestadorServico = prestadorServicoService.cadastrarPrestador(prestadorResource);
        return ResponseEntity.ok(prestadorServico);
    }
}
