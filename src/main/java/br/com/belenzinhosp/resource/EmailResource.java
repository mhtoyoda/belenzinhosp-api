package br.com.belenzinhosp.resource;

import br.com.belenzinhosp.model.Email;
import br.com.belenzinhosp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailResource {

    @Autowired
    private EmailService emailService;

    @PostMapping("/api/email")
    public ResponseEntity<Email> email(@RequestBody Email email){
        Email emailResponse = new Email();
        boolean sentEmail = emailService.sendEmail(email.getEmail(), email.getSubject(), email.getMessage());
        if(sentEmail){
            emailResponse.setStatus("OK");
        }else{
            emailResponse.setStatus("NOK");
        }

        return ResponseEntity.ok(emailResponse);
    }
}
