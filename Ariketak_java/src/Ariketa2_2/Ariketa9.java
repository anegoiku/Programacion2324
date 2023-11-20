package Ariketa2_2;

import java.util.Scanner;

public class Ariketa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Erabiltzailea eta pasahitza eskatu eta login-a zuzena den zehaztu (erabiltzailea: ikaslea eta pasahitza: ik23249
		
		String erab;
		String pasa;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Zein da erabiltzailea?");
		erab=scan.nextLine();
		
		if (erab.equals("ikaslea")) {
			System.out.println("Erabiltzailea zuzena da");
			System.out.println("Zein da pasahitza?");
			pasa=scan.nextLine();
			scan.close();
			
			if(pasa.equals("ik23249")) {
				System.out.println("Pasahitza zuzena da");	
			}else {
				System.out.println("Pasahitza ez da zuzena");	
			}
		}else {
			System.out.println("Erabiltzailea ez da zuzena");	
		}
	}

}
