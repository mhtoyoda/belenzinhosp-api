package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.PrestadorResource;
import br.com.belenzinhosp.model.entity.PrestadorServicos;
import br.com.belenzinhosp.service.EmailService;
import br.com.belenzinhosp.service.PrestadorServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestadorServicoResource {

    @Autowired
    private EmailService emailService;

    @PostMapping("/api/prestador-servico")
    public ResponseEntity<PrestadorResource> prestadorServico(@RequestBody PrestadorResource prestadorResource) {
        String data = prestadorResource.toString();
        emailService.sendEmail("bsp@belenzinhosp.com.br", "Cadastro de Prestador de Serviços", data);
        PrestadorServicos prestadorServico = new PrestadorServicos();
        prestadorResource.setSucess(true);
        return ResponseEntity.ok(prestadorResource);
    }
}
