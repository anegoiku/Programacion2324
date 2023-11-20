package Ariketa2_1;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gelako tenperatura (C) datu bezala sartu eta bere balorea Gradu F-etara pasatu (ºF=ºC*1,8 + 32).
		
		double tenC, tenF;
		Scanner scan=new Scanner (System.in);
		System.out.println("Zenbat gradukoa(Cº) da tenperatura?");
		tenC= scan.nextDouble();
		scan.close();
		
		tenF=tenC*1.38+32;
		System.out.println(Double.toString(tenF)+" Fº dira.");
		
	}

}
