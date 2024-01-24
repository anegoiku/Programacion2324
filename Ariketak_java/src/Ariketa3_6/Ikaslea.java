package Ariketa3_6;

import java.util.ArrayList;

public class Ikaslea{
	
private String izena;
private int adina;
private ArrayList <Ikastaroa> ikaslearenIkastaroa;

public String getIzena() {
	return izena;
}
public void setIzena(String izena) {
	this.izena = izena;
}
public int getAdina() {
	return adina;
}
public void setAdina(int adina) {
	this.adina = adina;
}
public ArrayList<Ikastaroa> getIkaslearenIkastaroa() {
	return ikaslearenIkastaroa;
}
public void setIkaslearenIkastaroa(ArrayList<Ikastaroa> ikaslearenIkastaroa) {
	this.ikaslearenIkastaroa = ikaslearenIkastaroa;
}

public Ikaslea() {
	super();
}
public Ikaslea(String izena, int adina, ArrayList<Ikastaroa> ikaslearenIkastaroa) {
	super();
	this.izena = izena;
	this.adina = adina;
	this.ikaslearenIkastaroa = ikaslearenIkastaroa;
}
@Override
public String toString() {
	return "Ikaslea || Izena=" + izena + " || Adina=" + adina + " || Ikaslearen ikastaroa=" + ikaslearenIkastaroa + " ||";
}


}
