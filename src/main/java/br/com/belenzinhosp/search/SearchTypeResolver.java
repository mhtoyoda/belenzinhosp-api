package br.com.belenzinhosp.search;

import br.com.belenzinhosp.model.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SearchTypeResolver {

    @Autowired
    @Qualifier("empresaSearchType")
    private TypeSearch empresaTypeSearch;

    @Autowired
    @Qualifier("tipoNegocioSearchType")
    private TypeSearch tipoNegocioTypeSearch;

    @Autowired
    @Qualifier("prestadorServicosSearchType")
    private TypeSearch prestadorServicosSearchType;

    private Map<String, TypeSearch> searchTypeMap = new HashMap<>();

    @PostConstruct
    public void init(){
        searchTypeMap.put("EMPRESA", empresaTypeSearch);
        searchTypeMap.put("TIPONEGOCIO", tipoNegocioTypeSearch);
        searchTypeMap.put("PRESTADORSERVICO", prestadorServicosSearchType);
    }

    public List<Result> getTypeSearch(String type, String term){
        return searchTypeMap.get(StringUtils.upperCase(type)).findByType(term);
    }
}
