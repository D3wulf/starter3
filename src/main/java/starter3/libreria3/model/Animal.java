package starter3.libreria3.model;

public class Animal {
	
	private String raza;

	public Animal(String raza) {
		this.raza = raza;
	}
	
	public String mensajeSaludo() {
		String mensaje= "";
		switch (raza) {
		
			case "Gato":
				mensaje="Bienvenida Monis";
				break;
				
			
			case "Perro":
				mensaje="Hola Trufo";
				break;
			
			
			
			
			default:
				mensaje="Hola Gala";
				break;
			
			}
		
		return mensaje;
		
		
		
	}

}
