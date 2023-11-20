package Ariketa2_4;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Teklatutik esaldi bat sartu eta pantailatik hitz bakoitzeko karaktere bat atera.
		
		//Bariableak
		int i;
		String katea;
		Scanner tek=new Scanner (System.in);
		
		//Eragiketak
		System.out.println("Eman esaldi bat");
		katea=tek.nextLine();
		
		for(i=0; i<katea.length(); i++) {
			System.out.println(katea.charAt(i));
		}
		tek.close();
		
		
	}

}
