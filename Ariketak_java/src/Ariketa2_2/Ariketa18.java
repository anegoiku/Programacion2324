package Ariketa2_2;

import java.util.Scanner;

public class Ariketa18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Menu bat erakutsi eta menuko aukera bat hautatu ezkero, dagokion esaldia erakutsi, bestela ERROREA erakutsi
		
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
		switch(zen) {
		case 1:
			System.out.println("Zerrenda ikusi");
			break;
		case 2:
			System.out.println("Elementua ikusi");
			break;
		case 3:
			System.out.println("Elementua ezabatu");
			break;
		case 4:
			System.out.println("Irten");
			break;
		default:
			System.out.println("ERROREA");
		}
		
	}

}
