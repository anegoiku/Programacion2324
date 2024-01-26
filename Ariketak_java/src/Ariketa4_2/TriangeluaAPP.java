package Ariketa4_2;

import java.util.Scanner;

public class TriangeluaAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tek=new Scanner(System.in);
		int menu=0;
		Figura2D figura=new Figura2D();
		Triangelua tri=new Triangelua();
		
		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Dimentsioak bistaratu");
			System.out.println("2. Azalera kalkulatu");
			System.out.println("3. Estiloa kalkulatu");
			System.out.println("4. IRTEN");
			System.out.println("---------------");
			menu=tek.nextInt();
			
			switch(menu) {
			case 1: 
				dimentsioakBistaratu(figura);
				break;
				
			case 2:
				azaleraKalkulatu(tri);
				break;
				
			case 3: 
				estiloaKalkulatu(tri);
				break;
				
			case 4:
				System.out.println("AMAIERAA!! Laster arte!!");
				break;
				
			default: System.out.println("ERROREA!! 1 eta 4 arteko zenbaki bat izan bahar da.");
			}
		}while(menu!=4);
	}

	private static void dimentsioakBistaratu(Figura2D figura) {
		// 1. Dimentsioak bistaratu
		Scanner tek=new Scanner(System.in);
		System.out.println("Zein da triangeluaren zabalera?");
		figura.setZabalera(tek.nextDouble());
		System.out.println("Zein"
				+ " da triangeluaren altuera?");
		figura.setAltuera(tek.nextDouble());
		
		Figura2D.dimIKusi(figura.getZabalera(), figura.getAltuera());
	}

	private static void azaleraKalkulatu(Triangelua tri) {
		// 2. Azalera kalkulatu
		Scanner tek=new Scanner(System.in);
		System.out.println("Zein da triangeluaren zabalera?");
		tri.setZabalera(tek.nextDouble());
		System.out.println("Zein da triangeluaren altuera?");
		tri.setAltuera(tek.nextDouble());
		
		Triangelua.area(tri.getAltuera(), tri.getZabalera());
		
	}

	private static void estiloaKalkulatu(Triangelua tri) {
		// 3. Estiloa kalkulatu
		Scanner tek=new Scanner(System.in);
		double alde1, alde2, alde3;
		
		System.out.println("Zeintzuk dira triangeluaren aldeak?");
		System.out.println("Eman zenbaki bakoitza introekin bereizita");
		alde1=tek.nextDouble();
		alde2=tek.nextDouble();
		alde3=tek.nextDouble();
		
		if(alde1==alde2 && alde2==alde3) {
			tri.setEstiloa("Ekilateroa");
			Triangelua.estiloaIkusi(tri.getEstiloa());
		}else if(alde1==alde2 || alde2==alde3 || alde3==alde1) {
			tri.setEstiloa("Isozelea");
			Triangelua.estiloaIkusi(tri.getEstiloa());
		}else if(!(alde1==alde2 || alde2==alde3 || alde3==alde1)) {
			if(!(alde1==alde2 && alde2==alde3)) {
				tri.setEstiloa("Eskalenoa");
				Triangelua.estiloaIkusi(tri.getEstiloa());
			}
		}else {
			System.out.println("ERROREA!!");
		}
		
	}

}
