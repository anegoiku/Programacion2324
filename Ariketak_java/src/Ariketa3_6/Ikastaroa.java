package Ariketa3_6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ikastaroa {
public String tituloa;
public String descripzioa;
public String irakaslea;
public ArrayList<Ikaslea>  ikasleaList;

@Override
public String toString() {
	return "Ikastaroa || Tituloa=" + tituloa + " || Descripzioa=" + descripzioa + "|| Irakaslea=" + irakaslea
			+ " || Matrikulatutako Ikasleak=" + ikasleaList + "]";
}

public String getTituloa() {
	return tituloa;
}

public void setTituloa(String tituloa) {
	this.tituloa = tituloa;
}

public String getDescripzioa() {
	return descripzioa;
}

public void setDescripzioa(String descripzioa) {
	this.descripzioa = descripzioa;
}

public String getIrakaslea() {
	return irakaslea;
}

public void setIrakaslea(String irakaslea) {
	this.irakaslea = irakaslea;
}

public ArrayList<Ikaslea> getikasleaList() {
	return ikasleaList;
}

public void setikasleaList(ArrayList<Ikaslea> ikasleaList) {
	this.ikasleaList = ikasleaList;
}

public Ikastaroa(String tituloa, String descripzioa, String irakaslea, ArrayList<Ikaslea> ikasleaList) {
	super();
	this.tituloa = tituloa;
	this.descripzioa = descripzioa;
	this.irakaslea = irakaslea;
	this.ikasleaList = ikasleaList;
}
public Ikastaroa() {
	// TODO Auto-generated constructor stub
}

public static void ikasleaGehitu(ArrayList<Ikaslea> ikasleaList) {
//	Scanner tek=new Scanner(System.in);
//	ikaslea ikasleBerria = new ikaslea ();
//	System.out.println("Zein da ikasle berriaren izena?");
//	ikasleBerria.setIzena(tek.nextLine());
//	System.out.println("");
//	ikasleBerria.setAdina(tek.nextInt());
//	System.out.println("");
//	ikasleBerria.setIkaslearenIkastaroa(tek.nextLine());
//	ikasleaList.add(ikaslea);
	
	
	
}
}

