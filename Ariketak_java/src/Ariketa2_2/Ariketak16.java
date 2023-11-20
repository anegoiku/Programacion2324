package Ariketa2_2;

import java.util.Scanner;

public class Ariketak16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 zenbaki eskatu eta adierazi hirugarrena aurreko bien batuketa den edo ez.
		
		int zen1, zen2, zen3;
		Scanner scan=new Scanner (System.in);

		
		//zenbakiak eskatu
		System.out.println("Eman zenbaki bat");
		zen1=scan.nextInt();
		System.out.println("Eman beste zenbaki bat");
		zen2=scan.nextInt();
		System.out.println("Eman azken zenbaki bat");
		zen3=scan.nextInt();
		scan.close();
		
		if(zen3==zen1+zen2) {
			System.out.println("Hirugarren zenbakia beste bien batuketa da");
		}else {
			System.out.println("Hirugarren zenbakia ez da beste bien batuketa");
		}
		
		
		
	}

}
