package Ariketa4_2;

public class Figura2D {
private double zabalera;
private double altuera;

@Override
public String toString() {
	return "Figura2D [zabalera=" + zabalera + ", altuera=" + altuera + "]";
}


public double getZabalera() {
	return zabalera;
}

public void setZabalera(double zabalera) {
	this.zabalera = zabalera;
}

public double getAltuera() {
	return altuera;
}

public void setAltuera(double altuera) {
	this.altuera = altuera;
}



public Figura2D() {
}


public Figura2D(double zabalera, double altuera) {
	this.zabalera = zabalera;
	this.altuera = altuera;
}

public static void dimIKusi(double zabalera, double altuera) {
	System.out.println("Altuera: " + altuera + " || Zabalera: " + zabalera);
}

}
