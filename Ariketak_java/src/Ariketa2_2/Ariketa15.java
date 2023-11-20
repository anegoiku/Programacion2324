package Ariketa2_2;

import java.util.Scanner;

public class Ariketa15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 zenbaki sartu eta ikustarazi zein den handiena eta zein txikiena.
		
	int zen1, zen2, zen3, zen4, zen5;
	int han, txi;
	Scanner scan=new Scanner(System.in);
	
	//zenbakiak eskatu
	System.out.println("Eman zenbaki bat, mesedez");
	zen1= scan.nextInt();
	
	System.out.println("Eman beste zenbaki bat");
	zen2= scan.nextInt();
	
	System.out.println("Eman beste zenbaki bat");
	zen3= scan.nextInt();
	
	System.out.println("Eman beste zenbaki bat");
	zen4= scan.nextInt();
	
	System.out.println("Eman azken zenbaki bat");
	zen5= scan.nextInt();
	scan.close();
	
	han=0;
	txi=1000000000;
	
	//zenbaki handia
	if(zen1>han) {
		han=zen1;
	}if(zen2>han) {
		han=zen2;
	}if(zen3>han) {
		han=zen3;
	}if(zen4>han) {
		han=zen4;
	}if(zen5>han) {
		han=zen5;
		System.out.println("Zenbakirik handiena " + han + " da.");
	}
	
	//zenbaki txikia
	if(zen1<txi) {
		txi=zen1;
	}if(zen2<txi) {
		txi=zen2;
	}if(zen3<txi) {
		txi=zen3;
	}if(zen4<txi) {
		txi=zen4;
	}if(zen5<txi) {
		txi=zen5;
		System.out.println("Zenbakirik txikiena " + txi + " da.");
	}
	

		
		
	}
	}

