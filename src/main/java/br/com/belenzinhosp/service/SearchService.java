package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.Result;
import br.com.belenzinhosp.search.SearchTypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchTypeResolver searchTypeResolver;

    public List<Result> search(String type, String term){
        List<Result> results = searchTypeResolver.getTypeSearch(type, term);
        return results;
    }
}
