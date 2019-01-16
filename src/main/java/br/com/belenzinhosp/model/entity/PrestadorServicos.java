package br.com.belenzinhosp.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prest_servicos")
public class PrestadorServicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestador")
    private Integer id;

    @Column(name = "nome_prestador")
    private String name;

    @Column(name = "lograd_prestador",  columnDefinition = "LONGTEXT")
    private String nomeLogradouro;

    @Column(name = "num_prestador")
    private String numero;

    @Column(name = "cep_prestador")
    private String cep;

    @Column(name = "bairro_prestador")
    private String bairro;

    @Column(name = "cpf_prestador")
    private String cpf;

    @Column(name = "ativ_prestador")
    private Integer atividadePrestadorId;

    @Column(name = "tel_prestador")
    private String telefone;

    @Column(name = "celular_prestador")
    private String celular;

    @Column(name = "avalia_prestador")
    private String avaliaPrestador;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cad_prestador", columnDefinition = "DATETIME")
    private Date dataCadastroPrestador;

    @Column(name = "linkedin_prestador")
    private String linkedinPrestador;

    @Column(name = "fb_prestador")
    private String facebookPrestador;

    @Column(name = "website_prestador")
    private String websitePrestador;

    @Column(name = "obs_prestador")
    private String observacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getAtividadePrestadorId() {
        return atividadePrestadorId;
    }

    public void setAtividadePrestadorId(Integer atividadePrestadorId) {
        this.atividadePrestadorId = atividadePrestadorId;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAvaliaPrestador() {
        return avaliaPrestador;
    }

    public void setAvaliaPrestador(String avaliaPrestador) {
        this.avaliaPrestador = avaliaPrestador;
    }

    public Date getDataCadastroPrestador() {
        return dataCadastroPrestador;
    }

    public void setDataCadastroPrestador(Date dataCadastroPrestador) {
        this.dataCadastroPrestador = dataCadastroPrestador;
    }

    public String getLinkedinPrestador() {
        return linkedinPrestador;
    }

    public void setLinkedinPrestador(String linkedinPrestador) {
        this.linkedinPrestador = linkedinPrestador;
    }

    public String getFacebookPrestador() {
        return facebookPrestador;
    }

    public void setFacebookPrestador(String facebookPrestador) {
        this.facebookPrestador = facebookPrestador;
    }

    public String getWebsitePrestador() {
        return websitePrestador;
    }

    public void setWebsitePrestador(String websitePrestador) {
        this.websitePrestador = websitePrestador;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
