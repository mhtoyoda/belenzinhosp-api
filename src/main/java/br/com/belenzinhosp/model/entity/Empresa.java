package br.com.belenzinhosp.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Identificação")
    private Integer id;

    @Column(name = "nfantasia_empr")
    private String nomeEmpresa;

    @Column(name = "nome_resp")
    private String nomeResponsavel;

    @Column(name = "nome_logr")
    private String nomeLogradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "website_empr")
    private String websiteEmpresa;

    @Column(name = "fb_empr")
    private String fbEmpresa;

    @Column(name = "nome_ativ_com")
    private String nomeAtividadeComercial;

    @Column(name = "tel1_empr")
    private String telefone1;

    @Column(name = "tel2_empr")
    private String telefone2;

    @Column(name = "abre_empr")
    private String horaAbertura;

    @Column(name = "fecha_empr")
    private String horaFechamento;

    @Column(name = "obs_empr")
    private String observacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
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

    public String getWebsiteEmpresa() {
        return websiteEmpresa;
    }

    public void setWebsiteEmpresa(String websiteEmpresa) {
        this.websiteEmpresa = websiteEmpresa;
    }

    public String getFbEmpresa() {
        return fbEmpresa;
    }

    public void setFbEmpresa(String fbEmpresa) {
        this.fbEmpresa = fbEmpresa;
    }

    public String getNomeAtividadeComercial() {
        return nomeAtividadeComercial;
    }

    public void setNomeAtividadeComercial(String nomeAtividadeComercial) {
        this.nomeAtividadeComercial = nomeAtividadeComercial;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
