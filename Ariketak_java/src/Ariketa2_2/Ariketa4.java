package Ariketa2_2;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbaki bat irakurri eta bakoitia edo bikoitia den zehaztu.
		
	int zen;
	Scanner scan=new Scanner (System.in);
	
	System.out.println("Eman zenbaki bat");
	zen = scan.nextInt();
	scan.close();
	if (zen % 2==0) {
		System.out.println(zen+" bikoitia da");
	} else {
		System.out.println(zen+" bakoitia da");
	}
	}

}
