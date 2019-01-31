package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.PrestadorResource;
import br.com.belenzinhosp.model.entity.PrestadorServicos;
import br.com.belenzinhosp.service.PrestadorServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestadorServicoResource {

    @Autowired
    private PrestadorServicoService prestadorServicoService;

    @PostMapping("/api/prestador-servico")
    public ResponseEntity<PrestadorResource> prestadorServico(@RequestBody PrestadorResource prestadorResource) {
        PrestadorServicos prestadorServico = prestadorServicoService.cadastrarPrestador(prestadorResource);
        if(prestadorServico.getId() != null){
            prestadorResource.setSucess(true);
        }else{
            prestadorResource.setSucess(false);
        }
        return ResponseEntity.ok(prestadorResource);
    }
}
