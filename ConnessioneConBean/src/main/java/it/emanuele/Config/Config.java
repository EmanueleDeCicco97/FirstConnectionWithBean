package it.emanuele.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ConnessioneConBean.Connessione;
import ConnessioneConBean.Effettua;

@Configuration
@ComponentScan(basePackageClasses = Effettua.class)
public class Config {

	@Bean
	public  Connessione getConnessione() {
		return new Connessione("com.mysql.jdbc.Driver","jdbc:mysql://localhost/gestione_guasti","manuel","manuel2");
	}
}
