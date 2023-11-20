package Ariketa2_2;

import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbaki bat irakurri eta 0 eta 10 artean dagoen zehaztu (biak barne).
		
		int zen;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman zenbaki bat");
		zen = scan.nextInt();
		scan.close();
		if (zen>=0) {
			if (zen<=10) {
				System.out.println(zen+ " zero eta hamar artean dago");
			}else {
				System.out.println(zen+ " ez dago zero eta hamar artean");
			}
		}else {
			System.out.println(zen+ " ez dago zero eta hamar artean");
		}
	}

}
