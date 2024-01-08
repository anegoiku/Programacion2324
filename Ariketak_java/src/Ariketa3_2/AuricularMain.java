package Ariketa3_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AuricularMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa3_2\\auriculares.txt");
		Scanner tek = new Scanner(System.in);
		ArrayList<Auricular> auricularlist = new ArrayList<Auricular>();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String lerroa;
		String[] zatiak;

		lerroa = br.readLine();

		while (lerroa != null) {
			Auricular auricular = new Auricular();
			zatiak = lerroa.split(";");
			auricular.setModeloa(zatiak[0]);
			auricular.setMarka(zatiak[1]);
			auricular.setPrezioa(Double.parseDouble(zatiak[2]));
			auricular.setStock(Integer.parseInt(zatiak[3]));
			auricularlist.add(auricular);
			lerroa = br.readLine();
		}
		int menu = 0;
		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Datuak bistaratu");
			System.out.println("2. Elementua gehitu");
			System.out.println("3. Gorde");
			System.out.println("4. IRTEN");
			System.out.println("---------------");
			menu = tek.nextInt();

			switch (menu) {
			case 1:
				datuakBistaratu(auricularlist);
				break;

			case 2:
				elementuaGehitu(auricularlist);
				break;

			case 3:
				gorde(auricularlist);
				break;

			case 4:
				System.out.println("AMAIERA!!  Laster arte!!");
				break;

			default:
				System.out.println("ERROREA");
			}
		} while (menu != 4);
		
		br.close();
		tek.close();
	}

	private static void gorde(ArrayList<Auricular> auricularlist) throws IOException {
		// 3. Gorde
		File file = new File("src\\ariketak_3_2_OOP\\auriculares.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i < auricularlist.size(); i++) {
			bw.write(auricularlist.get(i).getModeloa() + ";" + auricularlist.get(i).getMarka() + ";"
					+ auricularlist.get(i).getPrezioa() + ";" + auricularlist.get(i).getStock() + "\n");
		}
		bw.flush();
		bw.close();

	}

	private static void elementuaGehitu(ArrayList<Auricular> auricularlist) {
		// 2. Elementua gehitu
		Scanner tek = new Scanner(System.in);
		String datua = "";

		Auricular auricular = new Auricular();

		System.out.println("Zein da aurikular berriaren modeloa?");
		datua = tek.next();
		auricular.setModeloa(datua);

		System.out.println("Zein da aurikular berriaren marka?");
		datua = tek.next();
		auricular.setMarka(datua);

		System.out.println("Zein da aurikular berriaren prezioa?");
		datua = tek.next();
		auricular.setPrezioa(Double.parseDouble(datua));

		System.out.println("Zein da aurikular berriaren stock-a?");
		datua = tek.next();
		auricular.setStock(Integer.parseInt(datua));

		auricularlist.add(auricular);
		System.out.println("Aurikular berria zuzenki gehitu da");
		System.out.println(auricular.toString());
	}

	private static void datuakBistaratu(ArrayList<Auricular> auricularlist) {
		// 1. Datuak bistaratu
		for (int i = 0; i < auricularlist.size(); i++) {
			System.out.println(auricularlist.get(i).toString());
		}

	}
}
