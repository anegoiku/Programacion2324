package Ariketa2_2;

import java.util.Scanner;

public class Ariketa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Letra bat eskatu, B edo E den egiaztatu. B edo E bada, ONDO atera, bestela ERROREA.
		
		String letra;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman letra bat");
		letra = scan.nextLine();
		scan.close();
		
		if(letra.equals("B")) {
			System.out.println("ONDO");
		}else {
			if(letra.equals("E"))
			System.out.println("ONDO");
		else {
			System.out.println("ERRORA");
		}
		
	}

}}
