package ui;

import model.Aguila;
import model.Druida;
import model.LeonMarino;
import model.Oso;
import model.Raza;
import model.Tigre;

public class Main {
	public static void main(String[] args) {
		Druida elfoNocheDruidaTigre = new Druida("Lugoss", 157000, 85, Raza.ELFO_DE_LA_NOCHE, new Tigre(), "Elfo de la noche", "Fusión de las sombras");
		Druida taurenDruidaOso = new Druida("Skydots", 157000, 85, Raza.TAUREN, new Oso(), "Tauren", "Pisotón de guerra");
		Druida huargenDruidaLeonMarino = new Druida("Pushbaby", 157000, 85, Raza.HUARGEN, new LeonMarino(), "Huargen", "Forma alterada");
		Druida elfoSangreDruidaAguila = new Druida("Badkittylolz", 157000, 85, Raza.ELFO_DE_SANGRE, new Aguila(), "Elfo de sangre", "Torrente arcano");
	
		elfoNocheDruidaTigre.transformarse();
		taurenDruidaOso.transformarse();
		huargenDruidaLeonMarino.transformarse();
		elfoSangreDruidaAguila.transformarse();
	}
}
