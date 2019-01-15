package br.com.belenzinhosp.search;

import br.com.belenzinhosp.model.Result;
import br.com.belenzinhosp.model.entity.Empresa;
import br.com.belenzinhosp.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component("tipoNegocioSearchType")
public class TipoNegocioSearchType implements TypeSearch {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Result> findByType(String term) {
        List<Result> results = new ArrayList<>();
        term = term.trim();
        Optional<List<Empresa>> list = empresaRepository.findByTipoNegocio(term);
        if (list.isPresent()) {
            List<Empresa> empresas = list.get();
            empresas.forEach(empresa -> {
                Result result = new Result();
                result.setNome(empresa.getNomeEmpresa());
                result.setNomeFantasia(empresa.getNomeEmpresa());
                result.setEndereco(getEndereco(empresa.getNomeLogradouro(), empresa.getNumero()));
                result.setTelefone(empresa.getTelefone1() != null ? empresa.getTelefone1() : empresa.getTelefone2());
                result.setHorarioAbertura(empresa.getHoraAbertura() != null ? empresa.getHoraAbertura() : "");
                result.setHorarioFechamento(empresa.getHoraFechamento() != null ? empresa.getHoraFechamento() : "");
                result.setUrl(empresa.getWebsiteEmpresa() != null ? empresa.getWebsiteEmpresa() : "");
                results.add(result);
            });
        }
        return results;
    }

    private String getEndereco(String logradouro, String numero) {
        String[] logradouros = logradouro.split(",");
        return String.format("%s %s, %s", logradouros[1], logradouros[0], numero);
    }
}
