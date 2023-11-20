package Ariketa2_2;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbaki bat irakurri eta positiboa, negatiboa edo zero den zehaztu.
		
		int zen;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman zenbaki bat");
		zen = scan.nextInt();
		scan.close();
		
		if (zen>0) {
			System.out.println(zen+ " positiboa da");
		} else { if (zen==0) {
			System.out.println("Zenbakia 0 da");
		} else {
			System.out.println(zen+ " negatiboa da");
		}
			
		}
	}

}
