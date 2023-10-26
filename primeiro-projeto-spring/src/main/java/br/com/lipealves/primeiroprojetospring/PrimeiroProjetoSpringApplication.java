package br.com.lipealves.primeiroprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.lipealves") // gerenciar pacotes fora do escopo do pacote principal do projeto
public class PrimeiroProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
	}

}
/**
 * execultar a aplicação
 * mvn spring-boot:run
 * mvn clean install ->
 * java -jar target/primeiro-projeto-springboot-0.0.1.jar
 */
