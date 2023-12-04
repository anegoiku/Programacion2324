package Extra;

import java.util.Scanner;

public class Errepaso_eb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Menua osatu
		
		//Bariableak
		int menu;
		int[]zen= {2, 23, 43, 12, 6, 77, 80, 111, 56, 5, 80, 235, 55, 69, 9, 0, 71, 24, 124, 88, 67};
		Scanner tek=new Scanner (System.in);
		
		//Menua erakutsi
		do {
		System.out.println("Zer egin nahi duzu?");
		System.out.println("1. Arraian dauden zenbaki guztien batuketa kalkulatu.");
		System.out.println("2. Arraian dauden zenbaki bakoiti guztien batuketa kalkulatu.");
		System.out.println("3. Arraian dauden zenbaki bikoiti guztien batuketa kalkulatu.");
		System.out.println("4. Arraian dauden zenbaki guztien batazbestekoa kalkulatu.");
		System.out.println("5. Arraian dauden zenbaki bakoiti guztien batazbestekoa kalkulatu.");
		System.out.println("6. Arraian dauden zenbaki bikoiti guztien batazbestekoa kalkulatu.");
		System.out.println("7. Bistaratu 45 eta 60 artean dauden zenbakiak.");
		System.out.println("8. Kalkulatu azken 10 zenbakien biderketa.");
		System.out.println("9. Kalkulatu 10 eta 20 posizioen artean dauden zenbakien biderketa.");
		System.out.println("10. IRTEN");
		menu= tek.nextInt();
		
		switch (menu) {
		//1. Arraian dauden zenbaki guztien batuketa kalkulatu.
		case 1:
			int batutot= batukZen(zen);
			System.out.println(batutot);
			break;
			
		//2. Arraian dauden zenbaki bakoiti guztien batuketa kalkulatu.
		case 2:
			int batuba= batuBa(zen);
			System.out.println(batuba);
			break;
		
		//3. Arraian dauden zenbaki bikoiti guztien batuketa kalkulatu.
		case 3:
			int batubi= batuBi(zen);
			System.out.println(batubi);
			break;
		
		//4. Arraian dauden zenbaki guztien batazbestekoa kalkulatu.
		case 4:
			int bataztot= batazTot(zen);
			System.out.println(bataztot);
			break;
			
		//5. Arraian dauden zenbaki bakoiti guztien batazbestekoa kalkulatu.
		case 5:
			int batazba=batazBa(zen);
			System.out.println(batazba);
			break;
			
		//6. Arraian dauden zenbaki bikoiti guztien batazbestekoa kalkulatu.
		case 6:
			int batazbi=batazBi(zen);
			System.out.println(batazbi);
			break;
			
		//7. Bistaratu 45 eta 60 artean dauden zenbakiak.
		case 7:
			bistaR(zen);
			break;
			
		//8. Kalkulatu azken 10 zenbakien biderketa.
		case 8:
			int bider=biderK(zen);
			System.out.println(bider);
			break;
			
		//9. Kalkulatu 10 eta 20 posizioen artean dauden zenbakien biderketa.
		case 9:
			int arte=arteAn(zen);
			System.out.println(arte);
			break;
			
		//10. IRTEN
		case 10:
			System.out.println("Amaiera");
			break;
		default:
			System.out.println("ERROREA");
		}
		}while(!(menu==10));
		
		tek.close();
		
		
	}

	private static int arteAn(int[] zen) {
		// 9. Kalkulatu 10 eta 20 posizioen artean dauden zenbakien biderketa.
		int bider=1;
		for(int i=10; i<=20; i++) {
			bider=bider*zen[i];
		}
		return bider;
	}

	private static int biderK(int[] zen) {
		// 8. Kalkulatu azken 10 zenbakien biderketa.
		int bider=1;
		for(int i=zen.length-1; i>=zen.length-11; i--) {
			bider=bider*zen[i];
		}
		return bider;
	}

	private static void bistaR(int[] zen) {
		// 7. Bistaratu 45 eta 60 artean dauden zenbakiak.
		for(int i=0; i<zen.length; i++) {
			if(zen[i]>=45 && zen[i]<=60) {
				System.out.println(zen[i]);
			}
		}
	}

	private static int batazBi(int[] zen) {
		// 6. Arraian dauden zenbaki bikoiti guztien batazbestekoa kalkulatu.
		int batu=0, bataz=0;
		for(int i=0; i<zen.length; i++) {
			if(zen[i]%2==0) {
				batu=batu+zen[i];
			}
		}
		bataz=batu/zen.length;
		return bataz;
	}

	private static int batazBa(int[] zen) {
		// 5. Arraian dauden zenbaki bakoiti guztien batazbestekoa kalkulatu.
		int batu=0, bataz=0;
		for(int i=0; i<zen.length; i++) {
			if(!(zen[i]%2==0)) {
				batu=batu+zen[i];
			}
		}
		bataz=batu/zen.length;
		return bataz;
	}

	private static int batazTot(int[] zen) {
		// 4. Arraian dauden zenbaki guztien batazbestekoa kalkulatu.
		int batu=0, bataz=0;
		for(int i=0; i<zen.length; i++) {
			batu=batu+zen[i];
		}
		bataz=batu/zen.length;
		return bataz;
	}

	private static int batuBi(int[] zen) {
		// 3. Arraian dauden zenbaki bikoiti guztien batuketa kalkulatu.
		int batu=0;
		for(int i=0; i<zen.length; i++) {
			if(zen[i]%2==0) {
				batu=batu+zen[i];
			}
		}
		return batu;
	}

	private static int batuBa(int[] zen) {
		// 2. Arraian dauden zenbaki bakoiti guztien batuketa kalkulatu.
		int batu=0;
		for(int i=0; i<zen.length; i++) {
			if(!(zen[i]%2==0)) {
				batu=batu+zen[i];
			}
		}
		return batu;
	}

	private static int batukZen(int[] zen) {
		//1. Arraian dauden zenbaki guztien batuketa kalkulatu.
		int batu=0;
		for(int i=0; i<zen.length; i++) {
			batu=batu+zen[i];
		}
		return batu;
	}

}
