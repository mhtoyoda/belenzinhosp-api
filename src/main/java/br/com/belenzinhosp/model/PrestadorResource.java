package br.com.belenzinhosp.model;

public class PrestadorResource {

    private String name;

    private String logradouroId;

    private String numero;

    private String cpf;

    private String atividadePrestadorId;

    private String telefone;

    private String celular;

    private String dataCadastroPrestador;

    private String linkedinPrestador;

    private String facebookPrestador;

    private String websitePrestador;

    private String observacao;

    private boolean sucess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogradouroId() {
        return logradouroId;
    }

    public void setLogradouroId(String logradouroId) {
        this.logradouroId = logradouroId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAtividadePrestadorId() {
        return atividadePrestadorId;
    }

    public void setAtividadePrestadorId(String atividadePrestadorId) {
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

    public String getDataCadastroPrestador() {
        return dataCadastroPrestador;
    }

    public void setDataCadastroPrestador(String dataCadastroPrestador) {
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

    public boolean isSucess() {
        return sucess;
    }

    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    }
}
