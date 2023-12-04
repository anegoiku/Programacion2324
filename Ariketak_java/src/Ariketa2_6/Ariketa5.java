package Ariketa2_6;

import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// triangeluAreaKalkulatu funtzioa sortu, oinarria eta altura jasotzen dituena
		// eta area bistaratzen duena.
		
		//Bariableak
		int alt, oin;
		double emaitza;
		Scanner tek=new Scanner(System.in);
		
		//Datuak jaso
		System.out.println("Zein da triangeluaren oinarria?");
		oin=tek.nextInt();
		
		System.out.println("Zein da triangeluaren altuera?");
		alt=tek.nextInt();
		
		emaitza=triangeluAreaKalkulatu(alt, oin);
		
		//Erantzuna
		System.out.println("Trangeluaren azalera: " + emaitza);
		tek.close();
	}

	private static double triangeluAreaKalkulatu(int alt, int oin) {
		
	double area;
	area=(oin*alt)/2;
	
	return area;
	}

}
