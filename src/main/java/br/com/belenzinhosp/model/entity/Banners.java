package br.com.belenzinhosp.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "banners")
public class Banners {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_banner")
    private Integer id;

    @Column(name = "local_banner")
    private String localBanner;

    @Column(name = "cliente_banner")
    private String clienteBanner;

    @Column(name = "contato_banner")
    private String contatoBanner;

    @Column(name = "tel_banner")
    private String telefone;

    @Column(name = "imagem_banner")
    private String imagem;

    @Lob
    @Column(name = "link_banner", columnDefinition = "LONGTEXT")
    private String link;

    @Column(name = "obs_banner")
    private String observacao;

    @Column(name = "libera_banner")
    private String liberaBanner;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtentr_banner", columnDefinition = "DATETIME")
    private Date dateEntrada;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtsai_banner", columnDefinition = "DATETIME")
    private Date dateSaida;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cad_banner", columnDefinition = "DATETIME")
    private Date dateCadastro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocalBanner() {
        return localBanner;
    }

    public void setLocalBanner(String localBanner) {
        this.localBanner = localBanner;
    }

    public String getClienteBanner() {
        return clienteBanner;
    }

    public void setClienteBanner(String clienteBanner) {
        this.clienteBanner = clienteBanner;
    }

    public String getContatoBanner() {
        return contatoBanner;
    }

    public void setContatoBanner(String contatoBanner) {
        this.contatoBanner = contatoBanner;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getLiberaBanner() {
        return liberaBanner;
    }

    public void setLiberaBanner(String liberaBanner) {
        this.liberaBanner = liberaBanner;
    }

    public Date getDateEntrada() {
        return dateEntrada;
    }

    public void setDateEntrada(Date dateEntrada) {
        this.dateEntrada = dateEntrada;
    }

    public Date getDateSaida() {
        return dateSaida;
    }

    public void setDateSaida(Date dateSaida) {
        this.dateSaida = dateSaida;
    }

    public Date getDateCadastro() {
        return dateCadastro;
    }

    public void setDateCadastro(Date dateCadastro) {
        this.dateCadastro = dateCadastro;
    }
}
