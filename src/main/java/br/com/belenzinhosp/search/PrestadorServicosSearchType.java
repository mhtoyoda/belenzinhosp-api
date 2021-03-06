package br.com.belenzinhosp.search;

import br.com.belenzinhosp.model.Result;
import br.com.belenzinhosp.model.entity.AtividadePrestador;
import br.com.belenzinhosp.model.entity.Logradouro;
import br.com.belenzinhosp.model.entity.PrestadorServicos;
import br.com.belenzinhosp.repository.AtividadePrestadorRepository;
import br.com.belenzinhosp.repository.LogradouroRepository;
import br.com.belenzinhosp.repository.PrestadorServicosRepository;
import br.com.belenzinhosp.util.LogradouroUtil;
import br.com.belenzinhosp.util.UrlUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component("prestadorServicosSearchType")
public class PrestadorServicosSearchType implements TypeSearch {

    @Autowired
    private PrestadorServicosRepository prestadorServicosRepository;

    @Autowired
    private LogradouroRepository logradouroRepository;

    @Autowired
    private AtividadePrestadorRepository atividadePrestadorRepository;

    @Autowired
    private LogradouroUtil logradouroUtil;

    @Override
    public List<Result> findByType(String term) {
        List<Result> results = new ArrayList<>();
        term = term.trim();
        Optional<List<PrestadorServicos>> list = prestadorServicosRepository.findPrestadorServicos(term);
        if (list.isPresent()) {
            List<PrestadorServicos> prestadorServicos = list.get();
            prestadorServicos.forEach(prestadorServico -> {
                Result result = new Result();
                result.setNome(prestadorServico.getName());
                Optional<AtividadePrestador> atividadePrestador = atividadePrestadorRepository.findById(prestadorServico.getAtividadePrestadorId());
                result.setAtividade(atividadePrestador.isPresent() ? atividadePrestador.get().getName() : "");
                if(prestadorServico.getNomeLogradouro() != null){
                    Optional<Logradouro> logradouro = logradouroRepository.findById(prestadorServico.getNomeLogradouro());
                    result.setEndereco(logradouroUtil.getEndereco(logradouro.isPresent() ? logradouro.get().getName() : "", prestadorServico.getNumero()));
                }
                result.setTelefone(prestadorServico.getTelefone() != null ? prestadorServico.getTelefone() : "");
                result.setCelular(prestadorServico.getCelular() != null ? prestadorServico.getCelular() : "");
                result.setCep(prestadorServico.getCep() != null ? prestadorServico.getCep() : "");
                result.setBairro(prestadorServico.getBairro() != null ? prestadorServico.getBairro() : "");
                result.setCpf(prestadorServico.getCpf() != null ? prestadorServico.getCpf() : "");
                result.setRedeSocial(prestadorServico.getFacebookPrestador() != null ? UrlUtil.convertUrl(prestadorServico.getFacebookPrestador()) : "");
                result.setWebsite(prestadorServico.getWebsitePrestador() != null ? UrlUtil.convertUrl(prestadorServico.getWebsitePrestador()) : "");
                results.add(result);
            });
        }
        return results;
    }
}
