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
				elikagaiMota();
				break;
				
			case 2:
				kalorienBataz();
				break;
				
			case 3:
				elikagaiKop();
				break;
				
			case 4:
				eliegoBaloreak();
				break;
				
			case 5:
				elikagaiBaloreak();
				break;
				
			case 6:
				System.out.println("AMAIERA!");
				break;
				
			default:
				System.out.println("ERROREA");
			}
		}while(menua!=6);

	}

	private static void elikagaiMota() {
		// 1. Elikagaia emanda, mota horretako elikagaiak bistaratu.
		
	}

	private static void kalorienBataz() {
		// 2. Elikagaia emanda, mota horretako elikagaien kalorien batazbestekoa bistaratu.
		
	}

	private static void elikagaiKop() {
		// 3. Elikagaia emanda, elakagai mota horren kantitea bistaratu.
		
	}

	private static void eliegoBaloreak() {
		// 4. Elikagaia eta egoera emanda, bere balore nutrizionalak bistaratu.
		
	}

	private static void elikagaiBaloreak() {
		// 5. Elikagaia emanda, egoeraren araberako balore nutrizionalak bistaratu.
		
	}

}
