package Ariketa5_1;

import java.util.Scanner;

public class FutbolAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tek=new Scanner(System.in);
		
		int menu = 0;
		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Jokalariak ikusi");
			System.out.println("2. Taldeak ikusi");
			System.out.println("3. Jokalari bat gehitu");
			System.out.println("4. Talde bat gehitu");
			System.out.println("5. Jokalaria erakutsi ID-a emanda");
			System.out.println("6. Taldea erakutsi ID-a emanda");
			System.out.println("7. IRTEN");
			System.out.println("---------------");
			menu = tek.nextInt();

			switch (menu) {
			case 1:
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
				
			case 7:
				System.out.println("AMAIERA!! Laster arte!!");
				break;
				
			default:
				System.out.println("ERROREA");
			}
		}while(menu!=7);

	}
}
	
