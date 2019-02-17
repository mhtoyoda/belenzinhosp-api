package br.com.belenzinhosp.service;

import br.com.belenzinhosp.model.PrestadorResource;
import br.com.belenzinhosp.model.entity.AtividadePrestador;
import br.com.belenzinhosp.model.entity.Logradouro;
import br.com.belenzinhosp.model.entity.PrestadorServicos;
import br.com.belenzinhosp.repository.AtividadePrestadorRepository;
import br.com.belenzinhosp.repository.LogradouroRepository;
import br.com.belenzinhosp.repository.PrestadorServicosRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Component
public class PrestadorServicoService {

    @Autowired
    private PrestadorServicosRepository prestadorServicosRepository;

    @Autowired
    private AtividadePrestadorRepository atividadePrestadorRepository;

    @Autowired
    private LogradouroRepository logradouroRepository;

    @Autowired
    private EmailService emailService;

    public PrestadorServicos cadastrarPrestador(PrestadorResource prestadorResource) {
        PrestadorServicos prestadorServicos = new PrestadorServicos();
        try{
            prestadorServicos.setAtivacao("Não");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date dateCadastro = dateFormat.parse(prestadorResource.getDataCadastroPrestador());
                prestadorServicos.setDataCadastroPrestador(dateCadastro);
            } catch (ParseException e) {
                prestadorServicos.setDataCadastroPrestador(new Date());
            }

            if(prestadorResource.getAtividadePrestadorId() != null){
                Optional<AtividadePrestador> atividadePrestador = atividadePrestadorRepository.findById(Integer.parseInt(prestadorResource.getAtividadePrestadorId()));
                if(atividadePrestador.isPresent()){
                    prestadorServicos.setAtividadePrestadorId(atividadePrestador.get().getId());
                }
            }

            if(prestadorResource.getLogradouroId() != null){
                Optional<Logradouro> logradouro = logradouroRepository.findById(Integer.parseInt(prestadorResource.getLogradouroId()));
                if(logradouro.isPresent()){
                    prestadorServicos.setNomeLogradouro(String.valueOf(logradouro.get().getId()));
                }
            }

            prestadorServicos.setName(prestadorResource.getName());
            prestadorServicos.setNumero(prestadorResource.getNumero());
            if(StringUtils.isNotBlank(prestadorResource.getTelefone())){
                String telefone = prestadorResource.getTelefone();
                if(StringUtils.length(telefone) == 10){
                    String prefixo = StringUtils.substring(telefone, 0, 2);
                    String inicio = StringUtils.substring(telefone, 2, 6);
                    String fim = StringUtils.substring(telefone, 6, 10);
                    prestadorServicos.setTelefone(String.format("%s-%s-%s", prefixo, inicio, fim));
                }else{
                    prestadorServicos.setTelefone(telefone);
                }
            }
            if(StringUtils.isNotBlank(prestadorResource.getCelular())){
                String celular = prestadorResource.getCelular();
                if(StringUtils.length(celular) == 11){
                    String prefixo = StringUtils.substring(celular, 0, 2);
                    String inicio = StringUtils.substring(celular, 2, 7);
                    String fim = StringUtils.substring(celular, 7, 11);
                    prestadorServicos.setCelular(String.format("%s-%s-%s", prefixo, inicio, fim));
                }else{
                    prestadorServicos.setCelular(celular);
                }
            }
            if(StringUtils.isNotBlank(prestadorResource.getCpf())){
                String cpf = StringUtils.remove(prestadorResource.getCpf(), ".");
                cpf = StringUtils.remove(cpf, "-");
                prestadorServicos.setCpf(cpf);
            }
            prestadorServicos.setFacebookPrestador(prestadorResource.getFacebookPrestador());
            prestadorServicos.setLinkedinPrestador(prestadorResource.getLinkedinPrestador());
            prestadorServicos.setWebsitePrestador(prestadorResource.getWebsitePrestador());
            prestadorServicos.setObservacao(prestadorResource.getObservacao());
            prestadorServicos = prestadorServicosRepository.save(prestadorServicos);
            sendEmailNotification(prestadorServicos);
        }catch (Exception e){
            e.printStackTrace();
        }
        return prestadorServicos;
    }

    private void sendEmailNotification(PrestadorServicos prestadorServicos){
        try {
            emailService.sendEmail("belenzinhosp@terra.com.br", "Cadastro de Prestador de Serviços", prestadorServicos.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
