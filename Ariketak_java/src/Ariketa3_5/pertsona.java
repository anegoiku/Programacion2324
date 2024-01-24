package Ariketa3_5;

public class pertsona {
private String izena;
private int adina;
private String nan;
private String sexua;
private double pisua;
private double altuera;

public pertsona() {
	super();
}

public pertsona(String izena, int adina, String sexua) {
	super();
	this.izena = izena;
	this.adina = adina;
	this.sexua = sexua;
}

public pertsona(String izena, int adina, String nan, String sexua, double pisua, double altuera) {
	super();
	this.izena = izena;
	this.adina = adina;
	this.nan = nan;
	this.sexua = sexua;
	this.pisua = pisua;
	this.altuera = altuera;
}

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

public String getNan() {
	return nan;
}

public void setNan(String nan) {
	this.nan = nan;
}

public String getSexua() {
	return sexua;
}

public void setSexua(String sexua) {
	this.sexua = sexua;
}

public double getPisua() {
	return pisua;
}

public void setPisua(double pisua) {
	this.pisua = pisua;
}

public double getAltuera() {
	return altuera;
}

public void setAltuera(double altuera) {
	this.altuera = altuera;
}

@Override
public String toString() {
	return "pertsona [izena=" + izena + ", adina=" + adina + ", nan=" + nan + ", sexua=" + sexua + ", pisua=" + pisua
			+ ", altuera=" + altuera + "]";
}
public static int kalkulatuMC(double pisua, double altuera) {
	double mc= pisua / (altuera * altuera);
	int mct=0;
	if(mc<20) {
		mct=-1;
	}else if(20<=mc && mc<=25) {
		mct=0;
	}else if(mc<25) {
		mct=1;
	}
	return mct;
}
public static boolean adinezNagusi(int adina) {
	boolean nagusi=false;
	if(adina>=18) {
		nagusi=true;
	}
	return nagusi;
}
}
