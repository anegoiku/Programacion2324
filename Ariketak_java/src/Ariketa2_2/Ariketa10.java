package Ariketa2_2;

import java.util.Scanner;

public class Ariketa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hiru zenbaki eskatu, bata aurrekoa baino handiagoa. Horrela ez bada, ERROREA mezua atera.
		
		int zen1,zen2,zen3;
		Scanner scan=new Scanner (System.in);
		

		System.out.println("Eman zenbaki bat");
		zen1 = scan.nextInt();
		
		System.out.println("Eman beste zenbaki bat");
		zen2 = scan.nextInt();

		if(zen1>zen2) {
			System.out.println("Eman azken zenbaki bat");
			zen3 = scan.nextInt();
			scan.close();
			if (zen2>zen3) {
				System.out.println("Lehenengo zenbakia besteak baino handiagoa da");
			}else {
				System.out.println("ERROREA");
			}
		}else {
			System.out.println("ERROREA");
		}

	}

}
