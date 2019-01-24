package br.com.belenzinhosp.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "noticias")
public class Noticias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_news")
    private Integer id;

    @Column(name = "titulo_news")
    private String titulo;

    @Column(name = "manchete_news")
    private String machete;

    @Column(name = "website_news")
    private String website;

    @Column(name = "telefone_news")
    private String telefone;

    @Lob
    @Column(name = "corpo_news", columnDefinition = "LONGTEXT")
    private String corpo;

    @Column(name = "contato_news")
    private String contato;

    @Column(name = "fonte_news")
    private String fonte;

    @Column(name = "obs_news")
    private String observacao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_entrada", columnDefinition = "DATETIME")
    private Date dateEntrada;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_bloqueio", columnDefinition = "DATETIME")
    private Date dateBloqueio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMachete() {
        return machete;
    }

    public void setMachete(String machete) {
        this.machete = machete;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDateEntrada() {
        return dateEntrada;
    }

    public void setDateEntrada(Date dateEntrada) {
        this.dateEntrada = dateEntrada;
    }

    public Date getDateBloqueio() {
        return dateBloqueio;
    }

    public void setDateBloqueio(Date dateBloqueio) {
        this.dateBloqueio = dateBloqueio;
    }
}
