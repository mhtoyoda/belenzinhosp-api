package br.com.belenzinhosp;

import br.com.belenzinhosp.configuration.MvcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BelenzinhospApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelenzinhospApiApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new MvcConfig();
	}
}




