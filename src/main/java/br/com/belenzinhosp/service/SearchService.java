package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.Result;
import br.com.belenzinhosp.model.entity.Empresa;
import br.com.belenzinhosp.repository.EmpresaRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SearchService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Result> search(String type, String term){
        List<Result> results = new ArrayList<>();
        if(type.equalsIgnoreCase("EMPRESA")){
            term = term.trim();
            Optional<List<Empresa>> list = empresaRepository.find(term);
            if(list.isPresent()){
                List<Empresa> empresas = list.get();
                empresas.forEach(empresa -> {
                    Result result = new Result();
                    result.setNome(empresa.getNomeEmpresa());
                    result.setNomeFantasia(empresa.getNomeResponsavel() != null ? empresa.getNomeResponsavel() : empresa.getNomeEmpresa());
                    result.setEndereco(empresa.getEnderecoEmpresa());
                    result.setTelefone(empresa.getTelefone1() != null ? empresa.getTelefone1() : empresa.getTelefone2());
                    result.setHorarioAbertura(getDateTime(empresa.getHoraAbertura()));
                    result.setHorarioFechamento(empresa.getHoraFechamento() != null ? empresa.getHoraFechamento() : "");
                    result.setUrl(empresa.getWebsiteEmpresa() != null ? empresa.getWebsiteEmpresa() : "");
                    results.add(result);
                });
            }
        }
        return results;
    }

    private String getDateTime(Date date){
        if(date != null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(dateFormat.format(date), formatter);
            return String.format("%s:%s", StringUtils.leftPad(String.valueOf(localDateTime.getHour()), 2, "0"),
                    StringUtils.rightPad(String.valueOf(localDateTime.getMinute()), 2, "0"));
        }
        return "";
    }
}
