package Ariketa2_4;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hitz bat palindromoa den edo ez esan.
		
		//Bariableak
		String katea;
		Scanner tek=new Scanner (System.in);
		
		//Eraagiketak
		System.out.println("Eman hitz bat eta palindromoa den edo ez esango dizut.");
		katea=tek.nextLine();
		tek.close();
		
		StringBuilder inv=new StringBuilder (katea);
		inv.reverse();
		
		if(katea.equalsIgnoreCase(inv.toString())) {
			System.out.println(katea + " palindromoa da.");
		}else {
			System.out.println(katea + " ez da palindromoa");
		}
		
		
	}

}
