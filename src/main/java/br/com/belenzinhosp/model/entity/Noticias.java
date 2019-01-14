package br.com.belenzinhosp.model.entity;

import javax.persistence.*;

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

    @Lob
    @Column(name = "corpo_news", columnDefinition = "LONGTEXT")
    private String corpo;

    @Column(name = "contato_news")
    private String contato;

    @Column(name = "fonte_news")
    private String fonte;

    @Column(name = "obs_news")
    private String observacao;

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
}
