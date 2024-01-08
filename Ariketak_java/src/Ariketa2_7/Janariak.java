package Ariketa2_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Janariak {

	public static void main(String[] args) throws IOException {
		// Honako aukerak garatu eta puntu hauek dituen menua bistaratu:
		// Elikagaia emanda, mota horretako elikagaiak bistaratu.
		// Elikagaia emanda, mota horretako elikagaien kalorien batazbestekoa bistaratu.
		// Elikagaia emanda, elakagai mota horren kantitea bistaratu.
		// Elikagaia eta egoera emanda, bere balore nutrizionalak bistaratu.
		// Elikagaia emanda, egoeraren araberako balore nutrizionalak bistaratu.
		System.out.println();
		// Bariableak
		File file = new File("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa2_7\\janariak.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Scanner tek=new Scanner (System.in);
		
		int i=0;
		int menua=0;
		String lerroa;
		String[] zatiak;
		String[] iz=new String[405];
		String[] ego=new String[405];
		double[] kalo=new double[405];
		double[] koi=new double[405];
		double[] pro=new double[405];
		double[] karbo=new double[405];
		String[] mota=new String[405];
		
		//Arraia bete
		lerroa=br.readLine();
		lerroa=br.readLine();
		
		while(lerroa!=null) {
			zatiak=lerroa.split(";");
			iz[i]=zatiak[0];
			ego[i]=zatiak[1];
			kalo[i]=Double.parseDouble(zatiak[2]);
			koi[i]=Double.parseDouble(zatiak[3]);
			pro[i]=Double.parseDouble(zatiak[4]);
			karbo[i]=Double.parseDouble(zatiak[5]);
			mota[i]=zatiak[6];
			
			lerroa=br.readLine();
			i++;
		}
		
		//Menua
		do {
			System.out.println("------MENUA------");
			System.out.println("1. Mota bateko elikagai guztiak bistaratu");
			System.out.println("2. Mota bateko elikagaien kalorien batazbestekoa");
			System.out.println("3. Elikagai baten mota duten elikagai kopurua bistaratu");
			System.out.println("4. Elikagaia eta egoeraren arabera balore nutrizionalak bistaratu");
			System.out.println("5. Elikagai baten egoeraren araberako balore nutrizionalak bistaratu");
			System.out.println("6. IRTEN");
			System.out.println("-----------------");
			menua = tek.nextInt();
			
			switch (menua) {
			case 1:
				elikagaiMota(iz, ego, kalo, koi, pro, karbo, mota);
				break;
				
			case 2:
				kalorienBataz(iz, kalo, mota);
				break;
				
			case 3:
				elikagaiKop(iz, mota);
				break;
				
			case 4:
				eliegoBaloreak(iz, ego, kalo, koi, pro, karbo, mota);
				break;
				
			case 5:
				elikagaiBaloreak(iz, ego, kalo, koi, pro, karbo, mota);
				break;
				
			case 6:
				System.out.println("AMAIERA!");
				break;
				
			default:
				System.out.println("ERROREA");
			}
		}while(menua!=6);

	}

	private static void elikagaiMota(String[] iz, String[] ego, double[] kalo, double[] koi, double[] pro, double[] karbo, String[] mota) {
		// 1. Elikagaia emanda, mota horretako elikagaiak bistaratu.
		String eli, mot="";
		Scanner tek=new Scanner (System.in);
		
		System.out.println("Zein elikagiren motako elikagaiak nahi dituzu bistaratzea?");
		eli=tek.next();
		
		for(int i=0; i<iz.length; i++) {
			if(eli.equalsIgnoreCase(iz[i])) {
				mot=mota[i];
			}
		}
		for(int i=0; i<iz.length; i++) {
			if(mot.equalsIgnoreCase(mota[i])) {
				System.out.println("|| Izena: " + iz[i] + " || Egoera: " + ego[i] + " || Kaloriak: " + kalo[i] + " || Koipeak: " + koi[i] + " || Karbohidratoak: " + karbo[i] + " || Mota: " + mota[i] + " ||");
			}
		}
	}

	private static void kalorienBataz(String[] iz, double[] kalo, String[] mota) {
		// 2. Elikagaia emanda, mota horretako elikagaien kalorien batazbestekoa bistaratu.
		String eli, mot="";
		double tot=0, bataz;
		int kont=0;
		Scanner tek=new Scanner (System.in);
		
		System.out.println("Zein elikagiren motako elikagaien batazbesteko kaloriak nahi dituzu bistaratzea?");
		eli=tek.next();
		
		for(int i=0; i<iz.length; i++) {
			if(eli.equalsIgnoreCase(iz[i])) {
				mot=mota[i];
			}
		}
		for(int i=0; i<iz.length; i++) {
			if(mot.equalsIgnoreCase(mota[i])) {
				tot=tot+kalo[i];
				kont++;
			}
		}
		bataz=tot/kont;
		System.out.println(mot + "-en batazbesteko kaloriak: " + bataz);
	}

	private static void elikagaiKop(String[] iz, String[] mota) {
		// 3. Elikagaia emanda, elakagai mota horren kantitea bistaratu.
		String eli, mot="";
		int kont=0;
		Scanner tek=new Scanner (System.in);
		
		System.out.println("Zein elikagiren motako elikagai kopurua nahi dituzu bistaratzea?");
		eli=tek.next();
		
		for(int i=0; i<iz.length; i++) {
			if(eli.equalsIgnoreCase(iz[i])) {
				mot=mota[i];
			}
		}
		for(int i=0; i<iz.length; i++) {
			if(mot.equalsIgnoreCase(mota[i])) {
				kont++;
			}
		}
		System.out.println(mot + "-en elikagai kopurua: " + kont);
	}

	private static void eliegoBaloreak(String[] iz, String[] ego, double[] kalo, double[] koi, double[] pro, double[] karbo, String[] mota) {
		// 4. Elikagaia eta egoera emanda, bere balore nutrizionalak bistaratu.
		String eli, egoe="";
		Scanner tek=new Scanner (System.in);
		
		System.out.println("Zein elikagiren egoeraren balore nutrizionalak nahi duzu bistaratzea?");
		System.out.println("Eman elikagaia:");
		eli=tek.next();
		System.out.println("Eman egoera:");
		egoe=tek.next();
		
		for(int i=0; i<iz.length; i++) {
			if(eli.equalsIgnoreCase(iz[i]) && egoe.equalsIgnoreCase(ego[i])) {
				System.out.println("|| Izena: " + iz[i] + " || Egoera: " + ego[i] + " || Kaloriak: " + kalo[i] + " || Koipeak: " + koi[i] + " || Karbohidratoak: " + karbo[i] + " || Mota: " + mota[i] + " ||");
			}
		}
	}

	private static void elikagaiBaloreak(String[] iz, String[] ego, double[] kalo, double[] koi, double[] pro, double[] karbo, String[] mota) {
		// 5. Elikagaia emanda, egoeraren araberako balore nutrizionalak bistaratu.
		String eli;
		Scanner tek=new Scanner (System.in);
		
		System.out.println("Zein elikagiren egoerak eta bere balore nutrizionalak nahi dituzu bistaratzea?");
		eli=tek.next();
		
		for(int i=0; i<iz.length; i++) {
			if(eli.equalsIgnoreCase(iz[i])) {
				System.out.println("|| Izena: " + iz[i] + " || Egoera: " + ego[i] + " || Kaloriak: " + kalo[i] + " || Koipeak: " + koi[i] + " || Karbohidratoak: " + karbo[i] + " || Mota: " + mota[i] + " ||");
			}
		}
	}

}
