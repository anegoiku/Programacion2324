package Ariketa3_3;

import java.util.ArrayList;

public class Animaliak {
	private String izena;
	private String espeziea;
	private int adina;
	private ArrayList<String> habitat;
	
	public Animaliak(String izena, String espeziea, int adina, ArrayList<String> habitat) {
		super();
		this.izena = izena;
		this.espeziea = espeziea;
		this.adina = adina;
		this.habitat = habitat;
	}
	public Animaliak() {}
	
	@Override
	public String toString() {
		return "Animaliak [izena=" + izena + ", espeziea=" + espeziea + ", adina=" + adina + ", habitat=" + habitat
				+ "]";
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getEspeziea() {
		return espeziea;
	}

	public void setEspeziea(String espeziea) {
		this.espeziea = espeziea;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public ArrayList<String> getHabitat() {
		return habitat;
	}

	public void setHabitat(ArrayList<String> habitat) {
		this.habitat = habitat;
	}

	
}
