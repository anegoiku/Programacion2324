package Ariketa2_1;

import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Karratu baten azalera kalkulatu.
		
		double total, al;
		Scanner scan=new Scanner (System.in);
		System.out.println("Zenbatekoa da karratuaren aldea cm-tan?");
		al= scan.nextDouble();
		scan.close();
		
		total=al*al;
		System.out.println("Karratuaren azalera " + total + "cm-koa da.");
	}

}
