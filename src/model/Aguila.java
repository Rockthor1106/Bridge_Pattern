package model;

public class Aguila implements Transformacion{

	@Override
	public void transformarse(String apariencia, String nombre) {
		System.out.println("El druida " + nombre + "\nCon apariencia base de: " + apariencia + "\nHa tomado la forma de un Aguila");
		
	}

	@Override
	public void buff() {
		System.out.println("Mejora: Velocidad de vuelo aumentada 70% \n");
		
	}

}
