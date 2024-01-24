package Ariketa3_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimaliakMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa3_3\\info.txt");
		Scanner tek = new Scanner(System.in);
		ArrayList<Animaliak> animalialist = new ArrayList<Animaliak>();
		ArrayList<String> habitat = new ArrayList<String>();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int menu = 0;
		String lerroa;
		String[] zatiak;

		lerroa = br.readLine();

		while (lerroa != null) {
			habitat = new ArrayList<String>();
			Animaliak animaliak = new Animaliak();
			zatiak = lerroa.split("::");
			animaliak.setIzena(zatiak[0]);
			animaliak.setEspeziea(zatiak[1]);
			animaliak.setAdina(Integer.parseInt(zatiak[2]));

			for (int i = 3; i < zatiak.length; i++) {
				habitat.add(zatiak[i]);
			}
			animaliak.setHabitat(habitat);
			lerroa = br.readLine();
			animalialist.add(animaliak);
		}

		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. 2 animalien datuak bistaratu");
			System.out.println("2. Gehien bizi den animalia bistaratu");
			System.out.println("3. Erabiltzaileak aukeratzen duen animalien habitatak bistaratu");
			System.out.println("4. IRTEN");
			System.out.println("---------------");
			menu = tek.nextInt();

			switch (menu) {
			case 1:
				animalienDatuak(animalialist);
				break;

			case 2:
				animaliaBizi(animalialist);
				break;

			case 3:
				habitatBistaratu(animalialist);
				break;

			case 4:
				System.out.println("AMAIERA!!  Laster arte!!");
				break;

			default:
				System.out.println("ERROREA!! Sartu 1 eta 4 arteko zenbaki bat sartu");

			}
		} while (menu != 4);

		tek.close();
		br.close();
	}

	private static void animalienDatuak(ArrayList<Animaliak> animalialist) throws IOException {
		// 1. 2 animalien datuak bistaratu
		String animalia;
		String array[];
		Scanner tek = new Scanner(System.in);
		
		System.out.println("Zeintzuk dira ikusi nahi dituzun animaliak?");
		animalia = tek.nextLine();
		array = animalia.split(" ");

		for (int i = 0; i < animalialist.size(); i++) {
			for (int k = 0; k < array.length; k++) {
				if (array[k].equalsIgnoreCase(animalialist.get(i).getIzena())) {
					System.out.println(animalialist.get(i).toString());
				}
			}
		}

	}

	private static void animaliaBizi(ArrayList<Animaliak> animalialist) {
		// 2. Gehien bizi den animalia bistaratu
		int adinmet = 0;
		int adinani = 0;

		for (int i = 0; i < animalialist.size(); i++) {
			adinani = animalialist.get(i).getAdina();
			if (adinani > adinmet) {
				adinmet = adinani;
			}
		}
		for (int i = 0; i < animalialist.size(); i++) {
			adinani = animalialist.get(i).getAdina();
			if (adinmet == adinani) {
				System.out.println(animalialist.get(i).toString());
			}
		}

	}

	private static void habitatBistaratu(ArrayList<Animaliak> animalialist) {
		// 3. Erabiltzaileak aukeratzen duen animalien habitatak bistaratu
		String animalia;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein animaliren habitatak nahi dituzu bistaratu?");
		animalia = tek.next();

		for (int i = 0; i < animalialist.size(); i++) {
			if (animalia.equalsIgnoreCase(animalialist.get(i).getIzena())) {
				System.out.println(animalialist.get(i).getHabitat());
			}
		}

	}

}
