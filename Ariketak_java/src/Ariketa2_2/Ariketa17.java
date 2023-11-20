package Ariketa2_2;

import java.util.Scanner;

public class Ariketa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Menu bat erakutsi eta menuko aukera bat hautatu ezkero, OK erakutsi, bestela ERROREA
		
		int zen;
		Scanner scan=new Scanner(System.in);
		
	
		//Menua
		System.out.println("Menua: ");
		System.out.println("1.Zerrenda ikusi");
		System.out.println("2.Elementua sartu");
		System.out.println("3.Elementua ezabatu");
		System.out.println("4.Irten");
		zen=scan.nextInt();
		scan.close();
		
		//Erantzuna
		if (zen==1 || zen==2 || zen==3 || zen==4) {
		System.out.println("OK");
		}else {
			System.out.println("ERROREA");
		}
		
		
		
	}

}
