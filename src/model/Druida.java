package model;

public class Druida {
	private String nombre;
	private double vida;
	private double nivel;
	private Raza raza;
	private Transformacion transformacion;
	private String apariencia;
	private String racial;
	
	public Druida(String nombre, double vida, double nivel, Raza raza, Transformacion transformacion, String apariencia, String racial) {
		this.nombre = nombre;
		this.vida = vida;
		this.nivel = nivel;
		this.raza = raza;
		this.transformacion = transformacion;
		this.apariencia = apariencia;
		this.racial = racial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getNivel() {
		return nivel;
	}

	public void setNivel(double nivel) {
		this.nivel = nivel;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public Transformacion getTransformacion() {
		return transformacion;
	}

	public void setTransformacion(Transformacion transformacion) {
		this.transformacion = transformacion;
	}

	public String getApariencia() {
		return apariencia;
	}

	public void setApariencia(String apariencia) {
		this.apariencia = apariencia;
	}

	public String getRacial() {
		return racial;
	}

	public void setRacial(String racial) {
		this.racial = racial;
	}
	
	public void transformarse() {
		transformacion.transformarse(apariencia,nombre);
		transformacion.buff();
	}
}
