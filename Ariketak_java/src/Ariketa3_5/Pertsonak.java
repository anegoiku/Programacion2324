package Ariketa3_5;

import java.util.Scanner;

public class Pertsonak {

	public static void main(String[] args) {
		// 1. Kalkulatu Mc
		// 2. Adinez nagusi
		
		Scanner tek=new Scanner (System.in);
		pertsona per1=new pertsona("Ane", 21, "79175757M", "E", 65, 1.72);
		int menu=0;
		
		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Kalkulatu MC-a");
			System.out.println("2. Adinez nagusia");
			System.out.println("3. IRTEN");
			System.out.println("---------------");
			menu = tek.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println(pertsona.kalkulatuMC(per1.getPisua(), per1.getAltuera()));
				break;
				
			case 2:
				System.out.println(pertsona.adinezNagusi(per1.getAdina()));
				break;
				
			case 3:
				System.out.println("AMAIERA!! Laster arte!!");
				break;
				
			default: System.out.println("|| ERROREA || sartu 1 eta 3 arteko zenbaki bat");
			}
		}while(menu!=3);
		
	}

}
