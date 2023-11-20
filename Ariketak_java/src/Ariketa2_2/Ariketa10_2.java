package Ariketa2_2;

import java.util.Scanner;

public class Ariketa10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hiru zenbaki eskatu, bata aurrekoa baino handiagoa. Horrela ez bada, ERROREA mezua atera.
		
		
		int zen1, zen2, zen3;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Eman zenbaki bat, mesedez");
		zen1= scan.nextInt();
		
		System.out.println("Eman beste zenbaki bat");
		zen2= scan.nextInt();
		
		System.out.println("Eman azken zenbaki bat");
		zen3= scan.nextInt();
		scan.close();
		
		if (zen1<zen2) {
			if(zen2<zen3) {
				System.out.println("Zenbaki bakoitza hurrengoa baino txikiagoa da");
			}
			}else {
				System.out.println("ERROREA");
				
		}
	}

}
