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

    @PostMapping(path = "/api/email")
    public ResponseEntity<String> email(@RequestBody Email email){
        boolean sentEmail = emailService.sendEmail(email.getEmail(), email.getSubject(), email.getText());
        if(sentEmail){
            return ResponseEntity.ok("OK");
        }
        return ResponseEntity.ok("NOK");
    }
}
