package Ariketa2_2;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbaki bi irakurri eta handiena zein den zehaztu. Zer gertatzen da zenbaki biek balore bera badaukate?
		
		int zen1, zen2;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman zenbaki bat");
		zen1 = scan.nextInt();
		
		System.out.println("Eman beste zenbaki bat");
		zen2 = scan.nextInt();
		scan.close();
		
		if (zen1>zen2) {
			System.out.println(zen1 + " handiagoa da");
		}
		else { if(zen2>zen1)
			System.out.println(zen2 + " handiagoa da");
		else {
			System.out.println(zen1+" eta "+zen2+" berdinak dira");
		}
		}
	}
	
}