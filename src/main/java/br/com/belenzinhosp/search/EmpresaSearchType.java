package br.com.belenzinhosp.search;

import br.com.belenzinhosp.model.Result;
import br.com.belenzinhosp.model.entity.Empresa;
import br.com.belenzinhosp.repository.EmpresaRepository;
import br.com.belenzinhosp.util.LogradouroUtil;
import br.com.belenzinhosp.util.UrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component("empresaSearchType")
public class EmpresaSearchType implements TypeSearch {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private LogradouroUtil logradouroUtil;

    @Override
    public List<Result> findByType(String term) {
        List<Result> results = new ArrayList<>();
        term = term.trim();
        Optional<List<Empresa>> list = empresaRepository.find(term);
        if (list.isPresent()) {
            List<Empresa> empresas = list.get();
            empresas.forEach(empresa -> {
                Result result = new Result();
                result.setNome(empresa.getNomeEmpresa());
                result.setNomeFantasia(empresa.getNomeEmpresa());
                result.setEndereco(logradouroUtil.getEndereco(empresa.getNomeLogradouro(), empresa.getNumero()));
                result.setTelefone(empresa.getTelefone1() != null ? empresa.getTelefone1() : empresa.getTelefone2());
                result.setHorarioAbertura(empresa.getHoraAbertura() != null ? empresa.getHoraAbertura() : "");
                result.setHorarioFechamento(empresa.getHoraFechamento() != null ? empresa.getHoraFechamento() : "");
                result.setUrl(empresa.getWebsiteEmpresa() != null ? UrlUtil.convertUrl(empresa.getWebsiteEmpresa()) : "");
                result.setRedeSocial(empresa.getFbEmpresa() != null ? UrlUtil.convertUrl(empresa.getFbEmpresa()) : "");
                result.setAtividade(empresa.getNomeAtividadeComercial());
                results.add(result);
            });
        }
        return results;
    }
}
