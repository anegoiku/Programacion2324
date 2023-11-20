package Ariketa2_4;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hitz bat sartuta, atzetik aurrera atera pantailatik.
		
		//Bariableak
		String katea;
		Scanner  tek=new Scanner (System.in);

		//Eragiketak
		System.out.println("Eman esaldi bat");
		katea=tek.nextLine();
		
		StringBuilder inv=new StringBuilder (katea);
		inv.reverse();
		
		System.out.println(inv);
		
		tek.close();
		
	}

}
