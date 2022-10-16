package model;

public class Oso implements Transformacion{


	@Override
	public void transformarse(String nombre) {
		System.out.println("El druida " + nombre + " ha tomado la forma de un Oso");
		
	}

	@Override
	public void buff() {
		System.out.println("Mejora: Daño recibido reducido 50% \n");
		
	}

}
