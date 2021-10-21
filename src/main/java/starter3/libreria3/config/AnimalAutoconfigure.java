package starter3.libreria3.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import starter3.libreria3.model.Animal;



@Configuration
@ConditionalOnClass(Animal.class)
@EnableConfigurationProperties(AnimalProperties.class)
public class AnimalAutoconfigure {
	
	private final AnimalProperties ap;
	
	public AnimalAutoconfigure(AnimalProperties properties) {
		
		this.ap= properties;
	}
	@Bean
	public Animal animal() {
		
		System.out.println("Nombre: " + ap.getRaza() );
		return new Animal(ap.getRaza());
	}
	

}
