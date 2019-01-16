package br.com.belenzinhosp.util;

import org.apache.commons.lang3.StringUtils;

public class UrlUtil {

    public static String convertUrl(String url){
        if(!StringUtils.startsWith(url, "http")){
            url = "http://"+url;
        }
        return url;
    }
}
