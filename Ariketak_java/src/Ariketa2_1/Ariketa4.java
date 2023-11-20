package Ariketa2_1;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Erabiltzaileari bi zenbaki eskatu eta bien batura pantailatik erakutsi.
		
		int zen1, zen2, totala;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman zenbaki bat");
		zen1= scan.nextInt();
		
		System.out.println("Eman beste zenbaki bat");
		zen2= scan.nextInt();
		
		scan.close();
		
		totala=zen1+zen2;
		System.out.println("Zenbaki bien totala " + totala + " da.");
	}

}
