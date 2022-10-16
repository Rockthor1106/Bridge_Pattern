package ui;

import model.Aguila;
import model.Druida;
import model.LeonMarino;
import model.Oso;
import model.Raza;
import model.Tigre;

public class Main {
	public static void main(String[] args) {
		Druida druidaTigre = new Druida("Lugoss", 157000, 85, Raza.HUARGEN, new Tigre());
		Druida druidaOso = new Druida("Skydots", 157000, 85, Raza.HUARGEN, new Oso());
		Druida druidaLeonMarino = new Druida("Pushbaby", 157000, 85, Raza.HUARGEN, new LeonMarino());
		Druida druidaAguila = new Druida("Badkittylolz", 157000, 85, Raza.HUARGEN, new Aguila());
	
		druidaTigre.transformarse();
		druidaOso.transformarse();
		druidaLeonMarino.transformarse();
		druidaAguila.transformarse();
	}
}
