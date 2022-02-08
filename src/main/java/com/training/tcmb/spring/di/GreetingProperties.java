package com.training.tcmb.spring.di;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "greeting")
public class GreetingProperties {
    private String abc;
    private Integer xyz;
    private String startWith;
    private String caniminIstediginiYazarim = "test me";

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public Integer getXyz() {
        return xyz;
    }

    public void setXyz(Integer xyz) {
        this.xyz = xyz;
    }

    public String getStartWith() {
        return startWith;
    }

    public void setStartWith(String startWith) {
        this.startWith = startWith;
    }

    public String getCaniminIstediginiYazarim() {
        return caniminIstediginiYazarim;
    }

    public void setCaniminIstediginiYazarim(String caniminIstediginiYazarim) {
        this.caniminIstediginiYazarim = caniminIstediginiYazarim;
    }
}
