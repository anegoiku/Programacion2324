package Ariketa2_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//5 bezeroen datuak 4 arrai ezberdinetan kargatu eta honako aukerak dituen menua erakutsi eta garatu (arazo bakoitzerako metodoak erabili
		//Dirua atera: Erabiltzaileari zenbat diru atera nahi duen galdetu eta saldoaren informazioa eguneratzen du.
		//Dirua sartu: Erabiltzaileari zenbat diru sartu nahi duen galdetu eta saldoaren informazioa eguneratzen du.
		//Erabiltzailearen datuak eguneratu. Erabiltzailearen izena eta abizena eskatu eta erabiltzailearen informazioa eguneratzen du.
		//Gorde, arrai-etako informazioa fitxategian gordetzen du.
		//IRTEN
		//ALDAERA: Programak aldaketarik egon den kontrolatzen du, eta ez badira gorde, gorde, gordetzeko aukera eskaintzen da.
		
		//Bariableak
		File file = new File("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa2_7\\bezeroak.txt");
		FileReader reader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(reader);
		Scanner tek=new Scanner(System.in);
		
		int i=0;
		int menu=0;
		String lerroa;
		String[] zatiak;
		String[]NAN=new String[5];
		String[]iz=new String[5];
		String[]ab=new String[5];
		double[]sal=new double[5];
		
		//Arraiak bete
		lerroa=buffer.readLine();
		
		while(lerroa!=null) {
			zatiak=lerroa.split(":");
			NAN[i]=zatiak[0];
			iz[i]=zatiak[1];
			ab[i]=zatiak[2];
			sal[i]=Double.parseDouble(zatiak[3]);
			
			lerroa=buffer.readLine();
			i++;
		}
		
		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Dirua atera");
			System.out.println("2. Dirua sartu");
			System.out.println("3. Datuak eguneratu");
			System.out.println("4. Gorde");
			System.out.println("5. IRTEN");
			System.out.println("---------------");
			menu=tek.nextInt();
			
			switch(menu) {
			
			case 1:
				diruaAtera(NAN, sal);
				break;
			
			case 2:
				diruaSartu(NAN, sal);
				break;
				
			case 3:
				datuakEguneratu(NAN, iz, ab, sal);
				break;
			
			case 4:
				gorde(NAN, iz, ab, sal);
				break;
				
			default: System.out.println("ERROREA");
			
			}
		}while(menu!=5);
		
	}

	private static void gorde(String[] NAN, String[] iz, String[] ab, double[] sal)throws IOException {
		// 4. Gorde, arrai-etako informazioa fitxategian gordetzen du.
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa2_7\\bezeroak.txt"));
		
		for(int i=0; i<iz.length; i++) {
		bw.write(NAN[i] + ":" + iz[i] + ":" + ab[i] + ":" + sal[i] + "\n");
		bw.flush();	
		}
		bw.close();
	}

	private static void datuakEguneratu(String[] NAN, String[] iz, String[] ab, double[] sal)throws IOException {
		// 3. Erabiltzailearen datuak eguneratu. Erabiltzailearen izena eta abizena eskatu eta erabiltzailearen informazioa eguneratzen du.
		String dni, izeg, abeg;
		Scanner tek=new Scanner(System.in);
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa2_7\\bezeroak.txt"));
		
		System.out.println("Eman zure NAN zenbakia");
		dni=tek.next();
		for(int i=0; i<iz.length; i++) {
			if(dni.equalsIgnoreCase(NAN[i])) {
				System.out.println("Zein da izen berria?");
				izeg=tek.next();
				System.out.println("Zein da abizen berria?");
				abeg=tek.next();
				iz[i]=izeg;
				ab[i]=abeg;
			}
		}
	}

	private static void diruaSartu(String[] NAN, double[] sal) {
		// 2. Dirua sartu: Erabiltzaileari zenbat diru sartu nahi duen galdetu eta saldoaren informazioa eguneratzen du.
		double sartu=0;
		String dni;
		Scanner tek=new Scanner(System.in);
		
		System.out.println("Eman zure NAN zenbakia");
		dni=tek.next();
		for (int i=0; i<sal.length; i++) {
			if(dni.equalsIgnoreCase(NAN[i])) {
				do {
					System.out.println("Zenbat diru sartu nahi duzu?");
					sartu=tek.nextDouble();
					sal[i]=sal[i]+sartu;
				}while(!(sartu==0));
				System.out.println("Zure saldo berria: " + sal[i]);
			}
		}
	}

	private static void diruaAtera(String[] NAN, double[] sal) {
		// 1. Dirua atera: Erabiltzaileari zenbat diru atera nahi duen galdetu eta saldoaren informazioa eguneratzen du.
		double atera=0;
		String dni;
		Scanner tek=new Scanner(System.in);
		
		System.out.println("Eman zure NAN zenbakia");
		dni=tek.next();
		for(int i=0; i<sal.length; i++) {
			if(dni.equalsIgnoreCase(NAN[i])) {
				do {
					System.out.println("Zenbat diru atera nahi duzu?");
					atera=tek.nextDouble();
					sal[i]=sal[i]-atera;
				}while(sal[i]<atera||!(atera==0) );
				System.out.println("Zure saldo berria: " + sal[i]);
			}
		}
	}

}
