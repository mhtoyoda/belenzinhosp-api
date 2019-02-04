package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.entity.Banners;
import br.com.belenzinhosp.repository.BannersRepository;
import org.glassfish.jersey.internal.guava.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BannersService {

    @Autowired
    private BannersRepository bannersRepository;

    public List<Banners> findBannerLeftActives(){
        List<Banners> list = new ArrayList<>();
        Optional<List<Banners>> bannerLeftActives = bannersRepository.findBannerLeftActives();
        if(bannerLeftActives.isPresent()){
            list = Lists.newArrayList(bannerLeftActives.get());
        }
        return list;
    }

    public List<Banners> findBannerRightActives(){
        List<Banners> list = new ArrayList<>();
        Optional<List<Banners>> bannerRightActives = bannersRepository.findBannerRightActives();
        if(bannerRightActives.isPresent()){
            list = Lists.newArrayList(bannerRightActives.get());
        }
        return list;
    }
}
