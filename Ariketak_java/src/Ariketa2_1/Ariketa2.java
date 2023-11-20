package Ariketa2_1;

import java.util.Scanner;


public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Erabiltzaileari bere izena eskatu eta pantailatik erakutsi.
		
		String izena;
		Scanner scan=new Scanner (System.in);
		System.out.println("Zein da zure izena?");
		izena= scan.nextLine();
		scan.close();
		System.out.println(izena);
	}

}
