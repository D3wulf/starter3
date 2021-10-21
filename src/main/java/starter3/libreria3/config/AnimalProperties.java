package starter3.libreria3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("animal.mensaje")
public class AnimalProperties {
	
	private String raza = "Perro";

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}


	

}
