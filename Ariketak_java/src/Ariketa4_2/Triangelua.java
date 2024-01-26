package Ariketa4_2;

import java.util.Arrays;

public class Triangelua extends Figura2D{
	private String estiloa;

	
	@Override
	public String toString() {
		return "Triangelua [estiloa=" + estiloa + "]";
	}

	
	
	public String getEstiloa() {
		return estiloa;
	}

	public void setEstiloa(String string) {
		this.estiloa = string;
	}


	public Triangelua(String estiloa, double altuera, double zabalera) {
		super(altuera, zabalera);
		this.estiloa = estiloa;
	}


	public Triangelua(String estiloa) {
		super();
		this.estiloa = estiloa;
	}

	public Triangelua() {
	}
	
	public static void area(double altuera, double zabalera) {
		double area=(altuera*zabalera)/2;
		System.out.println(area);
	}
	
	public static void estiloaIkusi(String estiloa) {
		System.out.println(estiloa);
	}
	
	

}
