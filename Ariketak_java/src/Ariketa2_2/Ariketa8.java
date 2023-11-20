package Ariketa2_2;

import java.util.Scanner;

public class Ariketa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Letra bat eskatu eta bokala den ala ez zehaztu.

		String letra;
		Scanner scan=new Scanner (System.in);
		 
		System.out.println("Eman letra bat eta bokala den ala ez esango dizut");
		letra= scan.nextLine();
		scan.close();
		
		if (letra.equals("a")|| letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
			System.out.println(letra+ " letra bokala da");
		} else {
			System.out.println(letra+ " letra ez da bokala");
		}
	}

}
