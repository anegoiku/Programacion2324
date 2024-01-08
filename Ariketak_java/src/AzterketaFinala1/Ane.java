package AzterketaFinala1;

import java.util.Scanner;

public class Ane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//

		// Bariableak
		String[] hanb = { "Mexikarra", "Alioli", "Cheese Burger", "Barbakoa", "Begetala", "Arrunta" };
		String[] ing = { "okela, tomatea, pikantea, piperra", "okela, letxuga, bacon, alioli",
				"okela, kipula, txedar, letxuga, tomatea, mahonesa",
				"okela, bacon, kipula, txedar, letxuga, tomatea, mahonesa, barbakoa",
				"okela, kipula, letxuga, tomatea, mahonesa", "okela" };
		double[] eur = { 5.5, 5, 5, 5, 4.5, 3.75 };
		int[] stock = { 12, 8, 23, 15, 20, 25 };
		int menua;
		Scanner tek = new Scanner(System.in);

		// Menua
		do {
			System.out.println("Zer nahi duzu?");
			System.out.println("1. Beharrezko dirua");
			System.out.println("2. Hamburgesarik merkeenak");
			System.out.println("3. Hamburgesa");
			System.out.println("4. Laktosarik ez");
			System.out.println("5. Stock-a gutxitu");
			System.out.println("6. IRTEN");
			menua = tek.nextInt();

			switch (menua) {
			case 1:
				double dirua = beharDiru(hanb, eur);
				System.out.println(dirua);
				break;

			case 2:
				merkeHanb(hanb, eur);
				break;

			case 3:
				hanburgesa(hanb, ing, eur);
				break;

			case 4:
				laktosaEz(ing, hanb);
				break;

			case 5:
				stockG(hanb, stock);
				break;

			case 6:
				System.out.println("AMAIERA");
				break;

			default:
				System.out.println("ERROREA");
			}

		} while (!(menua == 6));
		tek.close();
	}

	private static void stockG(String[] hanb, int[] stock) {
		//5. Stock-a gutxitu
		String nahi;
		Scanner tek=new Scanner(System.in);
		
		System.out.println("Zein nahi duzu?");
		nahi=tek.next();
		for(int i=0; i<hanb.length; i++) {
			if(hanb[i].equalsIgnoreCase(nahi)) {
				if(stock[i]>0) {
					stock[i]=stock[i]-1;
				}else if(stock[i]==0) {
					System.out.println("Ez dago stock-ik");
				}
			}
		}
	
	}

	private static void laktosaEz(String[] ing, String[] hanb) {
		//4. Laktosarik ez
		for(int i=0; i<hanb.length; i++) {
			if(!(ing[i].contains("txedar"))) {
				ing[i]=ing[i]+", Laktosarik ez";
			}
		}
		for(int i=0; i<ing.length; i++) {
		if(ing[i].contains("Laktosarik ez")) {
			System.out.println(ing[i]);
		
			}
		}
	}

	private static void hanburgesa(String[] hanb, String[] ing, double[] eur) {
		//3. Hanburgesa
		String nahi;
		Scanner tek=new Scanner(System.in);
		
		System.out.println("Zein nahi duzu?");
		nahi=tek.next();
		
		for(int i=0; i<hanb.length; i++) {
			if(hanb[i].equalsIgnoreCase(nahi)) {
				System.out.println("Ingredienteak: " + ing[i]);
				System.out.println("Prezioa: " + eur[i]);
			}
		}
	
	}

	private static void merkeHanb(String[] hanb, double[] eur) {
		//2. Hanburgesarik merkeenak
		double tot=0, bataz=0;
		for(int i=0; i<hanb.length; i++) {
			tot=tot+eur[i];
		}
		bataz=tot/hanb.length;
		for(int i=0; i<hanb.length; i++) {
			if(eur[i]<bataz) {
				System.out.println(hanb[i]);
			}
		}
		
	}

	private static double beharDiru(String[] hanb, double[] eur) {
		// 1. Beharrezko dirua
		double diruB=0, diruV=0, dirutot = 0;
		for (int i = 0; i < hanb.length; i++) {
			if (hanb[i].equalsIgnoreCase("barbakoa")) {
				diruB = eur[i] * 3;
			}
			if (hanb[i].equalsIgnoreCase("begetal")) {
				diruV = eur[i] * 2;
			}
			dirutot = diruB + diruV;
		}
		
		return dirutot;
	}

}
