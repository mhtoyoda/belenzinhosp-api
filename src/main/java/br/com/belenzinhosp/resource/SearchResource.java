package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.Result;
import br.com.belenzinhosp.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchResource {

    @Autowired
    private SearchService searchService;

    @GetMapping("/api/search")
    public ResponseEntity<List<Result>> email(@RequestParam("type") String type, @RequestParam("term") String term){
        List<Result> results = searchService.search(type, term);
        return ResponseEntity.ok(results);
    }
}
