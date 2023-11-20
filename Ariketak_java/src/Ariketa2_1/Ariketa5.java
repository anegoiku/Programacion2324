package Ariketa2_1;

import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Erabiltzaileari hiru zenbaki eskatu eta hiruren biderketa pantailatik erakutsi.
		
		int zen1, zen2, zen3, totala;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman zenbaki bat");
		zen1= scan.nextInt();
		
		System.out.println("Eman beste zenbaki bat");
		zen2= scan.nextInt();
		
		System.out.println("Eman azken zenbakia");
		zen3= scan.nextInt();
		
		scan.close();
		
		totala=zen1*zen2*zen3;
		System.out.println("Hiru zenbakien biderketa 2 " + totala + " da.");
	}

}
