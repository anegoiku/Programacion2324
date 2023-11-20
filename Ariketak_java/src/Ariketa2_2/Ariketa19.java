package Ariketa2_2;

import java.util.Scanner;

public class Ariketa19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbaki bat sartu eta dagokion nota esleitu:
		
		//Bariableak
		double zen;
		Scanner scan=new Scanner(System.in);
		
		//Nota eskatu
		System.out.println("Eman atera duzun nota zenbakia eta zer nota atera duzun esango dizut");
		zen=scan.nextDouble();
		scan.close();
		
		//Eragiketak eta erantzuna
		
		if(zen>=1 && zen<=4.9) {
			System.out.println("GUTXI");
		}else {
			if(zen>=5 && zen<=5.9) {
				System.out.println("NAHIKO");
			}else {
				if(zen>=6 && zen<=6.9) {
					System.out.println("ONDO");
				}else {
					if(zen>=7 && zen<=8.9) {
						System.out.println("OSO ONDO");
					}else {
						if(zen>=9 && zen<=10) {
							System.out.println("BIKAIN");
						}else {
							System.out.println("ERROREA");
						}
					}
				}
			}
		}
		
		
		
		
		
	}

}
