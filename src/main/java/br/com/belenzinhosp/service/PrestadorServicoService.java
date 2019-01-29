package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.PrestadorResource;
import br.com.belenzinhosp.model.entity.AtividadePrestador;
import br.com.belenzinhosp.model.entity.Logradouro;
import br.com.belenzinhosp.model.entity.PrestadorServicos;
import br.com.belenzinhosp.repository.AtividadePrestadorRepository;
import br.com.belenzinhosp.repository.LogradouroRepository;
import br.com.belenzinhosp.repository.PrestadorServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Component
public class PrestadorServicoService {

    @Autowired
    private PrestadorServicosRepository prestadorServicosRepository;

    @Autowired
    private AtividadePrestadorRepository atividadePrestadorRepository;

    @Autowired
    private LogradouroRepository logradouroRepository;

    public PrestadorServicos cadastrarPrestador(PrestadorResource prestadorResource) {
        PrestadorServicos prestadorServicos = new PrestadorServicos();
        prestadorServicos.setAtivacao("Não");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateCadastro = dateFormat.parse(prestadorResource.getDataCadastroPrestador());
            prestadorServicos.setDataCadastroPrestador(dateCadastro);
        } catch (ParseException e) {
            prestadorServicos.setDataCadastroPrestador(new Date());
        }

        if(prestadorResource.getAtividadePrestadorId() != null){
            Optional<AtividadePrestador> atividadePrestador = atividadePrestadorRepository.findById(Integer.parseInt(prestadorResource.getAtividadePrestadorId()));
            if(atividadePrestador.isPresent()){
                prestadorServicos.setAtividadePrestadorId(atividadePrestador.get().getId());
            }
        }

        if(prestadorResource.getLogradouroId() != null){
            Optional<Logradouro> logradouro = logradouroRepository.findById(Integer.parseInt(prestadorResource.getLogradouroId()));
            if(logradouro.isPresent()){
                prestadorServicos.setNomeLogradouro(logradouro.get().getName());
            }
        }
        prestadorServicos.setNumero(prestadorResource.getNumero());
//        prestadorServicos.setBairro();
//        prestadorServicos.setCep();
        prestadorServicos.setTelefone(prestadorResource.getTelefone());
        prestadorServicos.setCelular(prestadorResource.getCelular());
        prestadorServicos.setCpf(prestadorResource.getCpf());
        prestadorServicos.setFacebookPrestador(prestadorResource.getFacebookPrestador());
        prestadorServicos.setLinkedinPrestador(prestadorResource.getLinkedinPrestador());
        prestadorServicos.setWebsitePrestador(prestadorResource.getWebsitePrestador());
        prestadorServicos.setObservacao(prestadorResource.getObservacao());
        prestadorServicos = prestadorServicosRepository.save(prestadorServicos);
        return prestadorServicos;
    }
}
