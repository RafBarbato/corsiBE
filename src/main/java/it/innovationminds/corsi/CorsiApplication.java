package it.innovationminds.corsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "it.innovationminds.corsi.repository")
public class CorsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorsiApplication.class, args);
	}

}
