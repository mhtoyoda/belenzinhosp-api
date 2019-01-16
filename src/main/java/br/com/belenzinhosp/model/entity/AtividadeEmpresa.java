package br.com.belenzinhosp.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "atividade_empresa")
public class AtividadeEmpresa {

    @Id
    @Column(name = "nome_ativ_com")
    private String nomeAtividaddeComercial;

    @Column(name = "nfantasia_empr")
    private String nomeFantasiaEmpresa;

    @Column(name = "nome_logr")
    private String nomeLogradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "website_empr")
    private String website;

    @Column(name = "fb_empr")
    private String facebookEmpresa;

    @Column(name = "tel1_empr")
    private String telEmpresa;

    @Column(name = "abre_empr")
    private String abreEmpresa;

    @Column(name = "fecha_empr")
    private String fechaEmpresa;

    public String getNomeAtividaddeComercial() {
        return nomeAtividaddeComercial;
    }

    public void setNomeAtividaddeComercial(String nomeAtividaddeComercial) {
        this.nomeAtividaddeComercial = nomeAtividaddeComercial;
    }

    public String getNomeFantasiaEmpresa() {
        return nomeFantasiaEmpresa;
    }

    public void setNomeFantasiaEmpresa(String nomeFantasiaEmpresa) {
        this.nomeFantasiaEmpresa = nomeFantasiaEmpresa;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebookEmpresa() {
        return facebookEmpresa;
    }

    public void setFacebookEmpresa(String facebookEmpresa) {
        this.facebookEmpresa = facebookEmpresa;
    }

    public String getTelEmpresa() {
        return telEmpresa;
    }

    public void setTelEmpresa(String telEmpresa) {
        this.telEmpresa = telEmpresa;
    }

    public String getAbreEmpresa() {
        return abreEmpresa;
    }

    public void setAbreEmpresa(String abreEmpresa) {
        this.abreEmpresa = abreEmpresa;
    }

    public String getFechaEmpresa() {
        return fechaEmpresa;
    }

    public void setFechaEmpresa(String fechaEmpresa) {
        this.fechaEmpresa = fechaEmpresa;
    }
}
