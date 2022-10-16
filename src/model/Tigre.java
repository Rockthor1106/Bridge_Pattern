package model;

public class Tigre implements Transformacion {

	@Override
	public void transformarse(String apariencia, String nombre) {
		System.out.println("El druida " + nombre + "\nCon apariencia base de: " + apariencia + "\nHa tomado la forma de un Tigre");
		
	}

	@Override
	public void buff() {
		System.out.println("Mejora: daño físico aumentado 25% \n");
		
	}

}
