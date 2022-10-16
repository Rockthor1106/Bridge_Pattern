package model;

public class Aguila implements Transformacion{

	@Override
	public void transformarse(String nombre) {
		System.out.println("El druida " + nombre +" ha tomado la forma de un Aguila");
		
	}

	@Override
	public void buff() {
		System.out.println("Mejora: Velocidad de vuelo aumentada 70% \n");
		
	}

}
