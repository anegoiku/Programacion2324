package Ariketa2_2;

import java.util.Scanner;

public class Ariketa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hiru zenbaki eskatu eta behetik gora sartu diren edo ez zehaztu.
		
		int zen1, zen2, zen3;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman zenbaki bat");
		zen1=scan.nextInt();
		System.out.println("Eman beste zenbaki bat");
		zen2=scan.nextInt();
		System.out.println("Eman azken zenbaki bat");
		zen3=scan.nextInt();
		
		if(zen1<zen2) {
		}if(zen2<zen3) {
			System.out.println("Zenbakiak ordenean sartu dituzu");
		}else {
			System.out.println("Zenbakiak ez dituzu ordenean sartu");
		}
	scan.close();
	}

}
