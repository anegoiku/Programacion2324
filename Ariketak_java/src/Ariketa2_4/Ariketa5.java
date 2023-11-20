package Ariketa2_4;

import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Idatzitako esaldia zuriunerik gabe idatzi.
		
		//Datuak
		String katea;
		Scanner tek=new Scanner (System.in);
		
		//Eragiketak
		System.out.println("Eman esaldi bat eta zuriuneak ezabatuko ditut");
		katea=tek.nextLine();
		tek.close();
		
		System.out.println(katea.replace(" ", ""));
		
		
		
		
		
		
	}

}
