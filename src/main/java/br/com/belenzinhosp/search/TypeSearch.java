package br.com.belenzinhosp.search;

import br.com.belenzinhosp.model.Result;

import java.util.List;

public interface TypeSearch {

    List<Result> findByType(String term);

}
