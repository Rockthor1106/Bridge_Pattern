package model;

public class LeonMarino implements Transformacion{

	@Override
	public void transformarse(String apariencia, String nombre) {
		System.out.println("El druida " + nombre + "\nCon apariencia base de: " + apariencia + "\nHa tomado la forma de un León Marino");
		
	}

	@Override
	public void buff() {
		System.out.println("Mejora: velocidad al nadar aumentada 50% \n");
		
	}

}
