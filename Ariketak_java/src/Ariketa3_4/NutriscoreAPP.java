package Ariketa3_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NutriscoreAPP {

	public static void main(String[] args) throws IOException {
		// Elikagaien bilatzailea: elikagaia existitzen den egiaztatuko du. Horrela
		// bada, bere nutrizio datuak agertuko dira, bestela, dagokion mezua bistaratuko
		// du.
		// Elikagaiak erakutsi: programak bi zenbaki eskatuko ditu, lehenengoa, erakutsi
		// nahi dugun elikagaiaren kokapena izango da, eta bigarrena, erakutsi nahi
		// dugun erregistro kopurua izango da.
		// Kaloriak kalkulatu: teklatutik elikagaia sartuko da, bere egoera eta pisua
		// gramo kopurua. Elikagai kantitate horrek daukan kaloria kopurua kalkulatuko
		// da. Ez bada aurkitzen, dagokion mezua agertuko da.

		File file = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa2_7\\janariak.txt");
		ArrayList<elikagai> elikagailist = new ArrayList<elikagai>();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Scanner tek = new Scanner(System.in);

		int i = 0, menu = 0;
		String lerroa;
		String[] zatiak;

		lerroa = br.readLine();
		lerroa = br.readLine();

		while (lerroa != null) {
			elikagai elikagaia = new elikagai();
			zatiak = lerroa.split(";");
			elikagaia.setIz(zatiak[0]);
			elikagaia.setEgo(zatiak[1]);
			elikagaia.setKalo(Double.parseDouble(zatiak[2]));
			elikagaia.setKoi(Double.parseDouble(zatiak[3]));
			elikagaia.setPro(Double.parseDouble(zatiak[4]));
			elikagaia.setKar(Double.parseDouble(zatiak[5]));
			elikagaia.setMota(zatiak[6]);

			lerroa = br.readLine();
			elikagailist.add(elikagaia);
		}

		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Elikagaien bilatzailea");
			System.out.println("2. Elikagaiak erakutsi");
			System.out.println("3. Kaloriak kalkulatu");
			System.out.println("4. Gorde");
			System.out.println("5. IRTEN");
			System.out.println("---------------");
			menu = tek.nextInt();

			switch (menu) {
			case 1: // Elikagaien bilatzailea: elikagaia existitzen den egiaztatuko du. Horrela
					// bada, bere nutrizio datuak agertuko dira, bestela, dagokion mezua
					// bistaratuko du.
				elikagaiBilatu(elikagailist);
				break;

			case 2: // Elikagaiak erakutsi: programak bi zenbaki eskatuko ditu, lehenengoa, erakutsi
					// nahi dugun elikagaiaren kokapena izango da, eta bigarrena, erakutsi nahi
					// dugun erregistro kopurua izango da.
				elikagaiErakutsi(elikagailist);
				break;

			case 3: // Kaloriak kalkulatu: teklatutik elikagaia sartuko da, bere egoera eta pisua
					// gramo kopurua. Elikagai kantitate horrek daukan kaloria kopurua kalkulatuko
					// da. Ez bada aurkitzen, dagokion mezua agertuko da.
				kaloriakKalku(elikagailist);
				break;

			case 4:
				elikagaiGorde(elikagailist);
				break;

			case 5:
				System.out.println("AMAIERA!! Laster arte!!");
				break;

			default:
				System.out.println("ERROREA");
			}

		} while (menu != 5);

	}

	private static void elikagaiBilatu(ArrayList<elikagai> elikagailist) {
		// 1. Elikagaien bilatzailea: elikagaia existitzen den egiaztatuko du. Horrela
		// bada, bere nutrizio datuak agertuko dira, bestela, dagokion mezua bistaratuko
		// du.
		String bilajan;
		String izenlist;
		int kont = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein elikagai nahi duzu bilatu?");
		bilajan = tek.next();
		for (int i = 0; i < elikagailist.size(); i++) {
			izenlist = elikagailist.get(i).getIz();
			if (bilajan.equalsIgnoreCase(izenlist)) {
				System.out.println(elikagailist.get(i).toString());
				kont++;
			}
		}
		if (kont == 0) {
			System.out.println("Elikagai hori ez dago zerrendan");
		}
	}

	private static void elikagaiErakutsi(ArrayList<elikagai> elikagailist) {
		// 2. Elikagaiak erakutsi: programak bi zenbaki eskatuko ditu, lehenengoa,
		// erakutsi
		// nahi dugun elikagaiaren kokapena izango da, eta bigarrena, erakutsi nahi
		// dugun erregistro kopurua izango da.
		Scanner tek = new Scanner(System.in);
		int kok = 0, erre = 0, kont = 0;

		System.out.println("Zein da elikagaiaren kokapena?");
		kok = tek.nextInt();
		System.out.println("Zein da nahi duzun erregistro kopurua? 1-7");
		erre = tek.nextInt();

		for (int i = 0; i < elikagailist.size(); i++) {
			if (i == kok) {
				kont++;
				if (erre == 1) {
					System.out.println("|| Izena: " + elikagailist.get(i).getIz() + " ||");
				} else if (erre == 2) {
					System.out.println("|| Izena: " + elikagailist.get(i).getIz() + " || Egoera: "
							+ elikagailist.get(i).getEgo() + " ||");
				} else if (erre == 3) {
					System.out.println("|| Izena: " + elikagailist.get(i).getIz() + " || Egoera: "
							+ elikagailist.get(i).getEgo() + " || Kaloriak: " + elikagailist.get(i).getKalo() + " ||");
				} else if (erre == 4) {
					System.out.println("|| Izena: " + elikagailist.get(i).getIz() + " || Egoera: "
							+ elikagailist.get(i).getEgo() + " || Kaloriak: " + elikagailist.get(i).getKalo()
							+ " || Koipeak: " + elikagailist.get(i).getKoi() + " ||");
				} else if (erre == 5) {
					System.out.println("|| Izena: " + elikagailist.get(i).getIz() + " || Egoera: "
							+ elikagailist.get(i).getEgo() + " || Kaloriak: " + elikagailist.get(i).getKalo()
							+ " || Koipeak: " + elikagailist.get(i).getKoi() + " || Karbohidratoak: "
							+ elikagailist.get(i).getKar() + " ||");
				} else if (erre == 6) {
					System.out.println("|| Izena: " + elikagailist.get(i).getIz() + " || Egoera: "
							+ elikagailist.get(i).getEgo() + " || Kaloriak: " + elikagailist.get(i).getKalo()
							+ " || Koipeak: " + elikagailist.get(i).getKoi() + " || Karbohidratoak: "
							+ elikagailist.get(i).getKar() + " || Proteinak: " + elikagailist.get(i).getPro() + "||");
				} else if (erre == 7) {
					System.out.println("|| Izena: " + elikagailist.get(i).getIz() + " || Egoera: "
							+ elikagailist.get(i).getEgo() + " || Kaloriak: " + elikagailist.get(i).getKalo()
							+ " || Koipeak: " + elikagailist.get(i).getKoi() + " || Karbohidratoak: "
							+ elikagailist.get(i).getKar() + " || Proteinak: " + elikagailist.get(i).getPro()
							+ "|| Mota: " + elikagailist.get(i).getMota() + " ||");
				} else {
					System.out.println("Zenbakia 1 eta 7 artean egon behar da, eman beste bat.");
					erre = tek.nextInt();
				}
			}
		}
		if (kont == 0) {
			System.out.println("Ez dekoagu zenbaki horreri dagokion elikagaia, saiatu barriro");
		}

	}

	private static void kaloriakKalku(ArrayList<elikagai> elikagailist) {
		// 3. Kaloriak kalkulatu: teklatutik elikagaia sartuko da, bere egoera eta pisua
		// gramo kopurua. Elikagai kantitate horrek daukan kaloria kopurua kalkulatuko
		// da. Ez bada aurkitzen, dagokion mezua agertuko da.
		Scanner tek = new Scanner(System.in);
		String sariz, sarego;
		Double pisu, irkalo;
		int kontiz = 0, kontego = 0;

		System.out.println("Zein da elikagaiaren izena?");
		sariz = tek.nextLine();
		System.out.println("Zein da elikagaiaren egoera?");
		sarego = tek.nextLine();
		System.out.println("Zein da elikagaiaren pisua gramoetan?");
		pisu = tek.nextDouble();

		for (int i = 0; i < elikagailist.size(); i++) {
			if (sariz.equalsIgnoreCase(elikagailist.get(i).getIz())) {
				kontiz++;
				if (sarego.equalsIgnoreCase(elikagailist.get(i).getEgo())) {
					kontego++;
					irkalo = (pisu * elikagailist.get(i).getKalo()) / 100;
					System.out.println("|| Elikagai horren kaloriak: " + irkalo + " ||");
				}
			}
		}
		if (kontiz == 0) {
			System.out.println("Ez daukagu elikagai hori");
		}
		if (kontego == 0) {
			System.out.println("Ez dugu elikagai hori egoera horretan");
		}
	}

	private static void elikagaiGorde(ArrayList<elikagai> elikagailist) throws IOException {
		// 4. Gorde
		File file = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa2_7\\janariak.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i < elikagailist.size(); i++) {
			bw.write(elikagailist.get(i).getIz() + ";" + elikagailist.get(i).getEgo() + ";"
					+ elikagailist.get(i).getKalo() + ";" + elikagailist.get(i).getKoi() + ";"
					+ elikagailist.get(i).getKar() + ";" + elikagailist.get(i).getPro() + ";"
					+ elikagailist.get(i).getMota() + "\n");
		}
		bw.flush();
		bw.close();
	}

}
