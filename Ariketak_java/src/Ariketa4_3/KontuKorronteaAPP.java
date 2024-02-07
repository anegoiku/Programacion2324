package Ariketa4_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class KontuKorronteaAPP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner tek = new Scanner(System.in);

		File file1 = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa4_3\\kontuKorronteak.txt");
		FileReader fr1 = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr1);
		ArrayList<KontuKorrontea> korrontekontualist = new ArrayList<KontuKorrontea>();

		String lerroa1;
		String lehenlerro1;
		String[] zatiak1;

		lehenlerro1 = br.readLine();
		lerroa1 = br.readLine();

		while (lerroa1 != null) {
			KontuKorrontea korronte = new KontuKorrontea();
			zatiak1 = lerroa1.split(";");
			korronte.setIban(zatiak1[0]);
			korronte.setSaldoa(Float.parseFloat(zatiak1[1]));
			korronte.setSarreraKont(Integer.parseInt(zatiak1[2]));
			korronte.setKomisioPorz((float) 0.04);
			lerroa1 = br.readLine();
			korrontekontualist.add(korronte);

		}

		File file2 = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa4_3\\epeKontuak.txt");
		FileReader fr2 = new FileReader(file2);
		BufferedReader br2 = new BufferedReader(fr2);
		ArrayList<KontuEpea> kontuepealist = new ArrayList<KontuEpea>();

		String lerroa2;
		String lehenlerro2;
		String[] zatiak2;

		lehenlerro2 = br2.readLine();
		lerroa2 = br2.readLine();

		while (lerroa2 != null) {
			KontuEpea epea = new KontuEpea();
			zatiak2 = lerroa2.split(";");
			epea.setIban(zatiak2[0]);
			epea.setSaldoa(Float.parseFloat(zatiak2[1]));
			epea.setSarreraKont(Integer.parseInt(zatiak2[2]));
			epea.setSortzeData(zatiak2[3]);
			epea.setKomisioPorz((float) 0.04);
			lerroa2 = br2.readLine();
			kontuepealist.add(epea);

		}

		int menu = 0;
		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Kontu berria sortu");
			System.out.println("2. Dirua sartu");
			System.out.println("3. Dirua atera");
			System.out.println("4. Datuak bistaratu");
			System.out.println("5. Gorde");
			System.out.println("6. IRTEN");
			System.out.println("---------------");
			menu = tek.nextInt();

			switch (menu) {
			case 1:
				kontuaSortu(kontuepealist, korrontekontualist);
				break;

			case 2:
				diruaSartuu(kontuepealist, korrontekontualist);

				break;

			case 3:
				diruaAteraa(kontuepealist, korrontekontualist);
				break;

			case 4:
				datuakBistaratu(kontuepealist, korrontekontualist);
				break;

			case 5:
				gorde(kontuepealist, korrontekontualist, lehenlerro2, lehenlerro1);
				break;

			case 6:
				System.out.println("AMAIERA!! Laster arte!!");
				break;

			default:
				System.out.println("ERROREA");
			}
		} while (menu != 6);
	}

	private static void kontuaSortu(ArrayList<KontuEpea> kontuepealist, ArrayList<KontuKorrontea> korrontekontualist) {
		// 1. Kontu berria sortu

		Scanner tek = new Scanner(System.in);
		System.out.println("Zein kontu mota nahi duzu? Kontu korrontea edo Epe Kontua");
		String kontumota = tek.nextLine();
		if (kontumota.equalsIgnoreCase("Kontu korrontea")) {
			KontuKorrontea korronte = new KontuKorrontea();
			System.out.println("Zein da kontuaren iban-a?"); // cambiar esto
			korronte.setIban(tek.nextLine());
			korrontekontualist.add(korronte);
		} else if (kontumota.equalsIgnoreCase("Epe Kontua")) {
			KontuEpea epea = new KontuEpea();
			System.out.println("Zein da kontuaren iban-a?"); // esto tambien
			epea.setIban(tek.nextLine());
			System.out.println("Zein da gaurko data? UUUU/HH/EE"); // y esto
			epea.setSortzeData(tek.nextLine());
			kontuepealist.add(epea);
		} else {
			System.out.println("KONTU MOTA HORI EZ DA EXISTITZEN");
		}
	}

	private static void diruaSartuu(ArrayList<KontuEpea> kontuepealist, ArrayList<KontuKorrontea> korrontekontualist) {
		// 2. Dirua Sartu
		int kont = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein da zure kontu mota? Kontu korrontea edo Epe Kontua");
		String kontumota = tek.nextLine();
		if (kontumota.equalsIgnoreCase("Kontu Korrontea")) {
			System.out.println("Zein da zure kontu zenbakia?");
			String ibanbilaketa = tek.nextLine();
			for (int i = 0; i < korrontekontualist.size(); i++) {
				if (ibanbilaketa.equalsIgnoreCase(korrontekontualist.get(i).getIban())) {
					kont++;
					System.out.println("Zein da gehitu nahi duzun diru kopurua?");
					float kopurua = tek.nextFloat();
					korrontekontualist.get(i).diruaSartu(kopurua);
				}
				if (kont == 0) {
					System.out.println("Iban hori ez dago gure datu basean");
				}
			}
		} else if (kontumota.equalsIgnoreCase("Epe Kontua")) {
			System.out.println("Zein da zure kontu zenbakia?");
			String ibanbilaketa = tek.nextLine();
			for (int i = 0; i < kontuepealist.size(); i++) {
				if (ibanbilaketa.equalsIgnoreCase(kontuepealist.get(i).getIban())) {
					kont++;
					System.out.println("Zein da gehitu nahi duzun diru kopurua?");
					float kopurua = tek.nextFloat();
					kontuepealist.get(i).diruaSartu(kopurua);
				}
				if (kont == 0) {
					System.out.println("Iban hori ez dago gure datu basean");
				}
			}
		}else {
			System.out.println("KONTU MOTA HORI EZ DA EXISTITZEN");
		}
	}

	private static void diruaAteraa(ArrayList<KontuEpea> kontuepealist, ArrayList<KontuKorrontea> korrontekontualist) {
		// 3. Dirua atera
		int kont = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein da zure kontu mota? Kontu korrontea edo Epe Kontua");
		String kontumota = tek.nextLine();
		if (kontumota.equalsIgnoreCase("Kontu Korrontea")) {
			System.out.println("Zein da zure kontu zenbakia?");
			String ibanbilaketa = tek.nextLine();
			for (int i = 0; i < korrontekontualist.size(); i++) {
				if (ibanbilaketa.equalsIgnoreCase(korrontekontualist.get(i).getIban())) {
					kont++;
					System.out.println("Zein da atera nahi duzun diru kopurua?");
					float kopurua = tek.nextFloat();
					korrontekontualist.get(i).diruaAtera(kopurua);
				}
				if (kont == 0) {
					System.out.println("Iban hori ez dago gure datu basean");
				}
			}
		} else if (kontumota.equalsIgnoreCase("Epe Kontua")) {
			System.out.println("Zein da zure kontu zenbakia?");
			String ibanbilaketa = tek.nextLine();
			for (int i = 0; i < kontuepealist.size(); i++) {
				if (ibanbilaketa.equalsIgnoreCase(kontuepealist.get(i).getIban())) {
					kont++;
					System.out.println("Zein da atera nahi duzun diru kopurua?");
					float kopurua = tek.nextFloat();
					kontuepealist.get(i).diruaAtera(kopurua, kontuepealist.get(i).getSaldoa(),
							kontuepealist.get(i).getSarreraKont());
				}
				if (kont == 0) {
					System.out.println("Iban hori ez dago gure datu basean");
				}
			}
		}else {
			System.out.println("KONTU MOTA HORI EZ DA EXISTITZEN");
		}
	}

	private static void datuakBistaratu(ArrayList<KontuEpea> kontuepealist,
			ArrayList<KontuKorrontea> korrontekontualist) {
		// 4. Datuak bistaratu
		int kont = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein da zure kontu mota? Kontu korrontea edo Epe Kontua");
		String kontumota = tek.nextLine();
		if (kontumota.equalsIgnoreCase("Kontu Korrontea")) {
			System.out.println("Zein da zure kontu zenbakia?");
			String ibanbilaketa = tek.nextLine();
			for (int i = 0; i < korrontekontualist.size(); i++) {
				if (ibanbilaketa.equalsIgnoreCase(korrontekontualist.get(i).getIban())) {
					kont++;
					System.out.println(korrontekontualist.get(i).toString());
				}
				if (kont == 0) {
					System.out.println("Iban hori ez dago gure datu basean");
				}
			}
		} else if (kontumota.equalsIgnoreCase("Epe Kontua")) {
			System.out.println("Zein da zure kontu zenbakia?");
			String ibanbilaketa = tek.nextLine();
			for (int i = 0; i < kontuepealist.size(); i++) {
				if (ibanbilaketa.equalsIgnoreCase(kontuepealist.get(i).getIban())) {
					kont++;
					System.out.println(kontuepealist.get(i).toString());
				}
				if (kont == 0) {
					System.out.println("Iban hori ez dago gure datu basean");
				}
			}
		}else {
			System.out.println("KONTU MOTA HORI EZ DA EXISTITZEN");
		}
	}

	private static void gorde(ArrayList<KontuEpea> kontuepealist, ArrayList<KontuKorrontea> korrontekontualist,
			String lehenlerro2, String lehenlerro1) throws IOException {
		// 5. Gorde

		// Kontu Korrontea
		File file1 = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa4_3\\kontuKorronteak.txt");
		FileWriter fw1 = new FileWriter(file1);
		BufferedWriter bw1 = new BufferedWriter(fw1);

		bw1.write(lehenlerro1 + "\n");
		for (int i = 0; i < korrontekontualist.size(); i++) {
			bw1.write(korrontekontualist.get(i).getIban() + ";" + korrontekontualist.get(i).getSaldoa() + ";"
					+ korrontekontualist.get(i).getSarreraKont() + "\n");
		}
		bw1.flush();
		bw1.close();

		// EpeKontua
		File file2 = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa4_3\\epeKontuak.txt");
		FileWriter fw2 = new FileWriter(file2);
		BufferedWriter bw2 = new BufferedWriter(fw2);

		bw2.write(lehenlerro2 + "\n");
		for (int i = 0; i < kontuepealist.size(); i++) {
			bw2.write(kontuepealist.get(i).getIban() + ";" + kontuepealist.get(i).getSaldoa() + ";"
					+ kontuepealist.get(i).getSarreraKont() + ";" + kontuepealist.get(i).getSortzeData() + "\n");
		}
		bw2.flush();
		bw2.close();

	}

}
