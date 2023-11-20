package Ariketa2_2;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hiru zenbaki irakurri eta pantailatik batuketa eta batazbestekoa erakutsi.
		
		int zen1,zen2,zen3;
		int batuketa;
		double batazbestekoa;
		Scanner scan=new Scanner (System.in);
		

		System.out.println("Eman zenbaki bat");
		zen1 = scan.nextInt();
		
		System.out.println("Eman beste zenbaki bat");
		zen2 = scan.nextInt();
		
		System.out.println("Eman azken zenbaki bat");
		zen3 = scan.nextInt();
		scan.close();
		batuketa= zen1+zen2+zen3;
		batazbestekoa=batuketa/3;
		System.out.println("Zenbakien batuketa "+batuketa+" da eta zenbakien batazbestekoa "+ batazbestekoa+ " da");
		
				

	}

}
