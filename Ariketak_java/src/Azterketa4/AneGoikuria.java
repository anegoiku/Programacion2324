package Azterketa4;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.*;

public class AneGoikuria {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Kalkulatu marka baten batez bestekoa: metodo honek marken arrai-a eta
		// prezioen arrai-a jasotzen ditu eta teklatuz sartzen den edozein markaren
		// batez bestekoa itzultzen du.
		// BEHERAPENAK: teklatuz marka bat sartzean, teklatuz sartutako markaren prezio
		// guztiak jaitsi beharko ditu. Teklatuz sartutako zenbakia ez dela negatiboa
		// eta eragiketaren emaitza ez dela negatiboa kontrolatu behar da.
		// INFORMAZIOA IKUSI: Metodo honek produktu zehatz baten informazioa erakusteko
		// behar diren arrai guztiak jasotzen ditu. Produktuaren datu guztiak
		// informatzen dituen esaldi bat ikusiko du (Adibidea: “id” identifikatzailea
		// duen produktua “marka” markakoa da…).
		// INFORMAZIOA GORDE: .csv fitxategia hasieran zegoen bezalako egiturarekin
		// utziko du, baina aldaketarik egin bada, fitxategian islatu beharko da.
		// IRTEERA: Agurra esaten duen mezu bat sortuko du eta programa amaituko da.

		// Bariableak
		File file = new File(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Azterketa4\\ropa1.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
//		FileWriter fw = new FileWriter(file);
//		BufferedWriter bw = new BufferedWriter(fw);
		Scanner tek = new Scanner(System.in);

		int i = 0, menua = 0;
		String lerroa;
		String[] zatiak;
		int[] id = new int[1000];
		String[] marka = new String[1000];
		double[] prezioa = new double[1000];
		String[] tam = new String[1000];
		String[] kol = new String[1000];
		int[] argurt = new int[1000];

		// Arraiak bete
		lerroa = br.readLine();
		lerroa = br.readLine();

		while (lerroa != null) {
			zatiak = lerroa.split(",");

			id[i] = Integer.parseInt(zatiak[0]);
			marka[i] = zatiak[1];
			prezioa[i] = Double.parseDouble(zatiak[2]);
			tam[i] = zatiak[3];
			kol[i] = zatiak[4];
			argurt[i] = Integer.parseInt(zatiak[5]);

			lerroa = br.readLine();
			i++;
		}

		// Menua
		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Kalkulatu batazbestekoa");
			System.out.println("2. Behereapenak");
			System.out.println("3. Informazioa ikusi");
			System.out.println("4. Informazioa gorde");
			System.out.println("5. IRTEN");
			System.out.println("---------------");
			menua = tek.nextInt();

			switch (menua) {
			case 1:
				kalBataz(marka, prezioa);
				break;

			case 2:
				beheraPen(marka, prezioa);
				break;

			case 3:
				inforIkusi(id, marka, prezioa, tam, kol, argurt);
				break;

			case 4:
				inforGorde(id, marka, prezioa, tam, kol, argurt);
				break;

			case 5:
				System.out.println("AMAIERA!!");
				break;

			default:
				System.out.println("ERROREA");
				System.out.println("Sartu 1 eta 5 arteko zenbaki bat!!");
			}
		} while (menua != 5);

	}

	private static void kalBataz(String[] marka, double[] prezioa) {
		// 1. Kalkulatu marka baten batez bestekoa: metodo honek marken arrai-a eta
		// prezioen arrai-a jasotzen ditu eta teklatuz sartzen den edozein markaren
		// batez bestekoa itzultzen du.
		String mark;
		int kont = 0;
		double tot = 0, bataz = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein markaren prezioen batazbestekoa kalkulatu nahi duzu?");
		mark = tek.next();

		for (int i = 0; i < marka.length; i++) {
			if (mark.equalsIgnoreCase(marka[i])) {
				tot = tot + prezioa[i];
				kont++;
			}
		}
		bataz = tot / kont;
		System.out.println("Marka horren prezioen bataz bestekoa: " + bataz);

	}

	private static void beheraPen(String[] marka, double[] prezioa) {
		// 2. BEHERAPENAK: teklatuz marka bat sartzean, teklatuz sartutako markaren
		// prezio guztiak jaitsi beharko ditu. Teklatuz sartutako zenbakia ez dela
		// negatiboa eta eragiketaren emaitza ez dela negatiboa kontrolatu behar da.
		String mark;
		double beher;
		Scanner tek = new Scanner(System.in);

		do {
			System.out.println("Zein da beherapena duen marka?");
			mark = tek.next();
			System.out.println("Zenbat eurokoa da beherapena?");
			beher = tek.nextDouble();
			if (beher == 0 || beher < 0) {
				System.out.println("Beherapena 0 baino handiagoa izan behar da");
			}
		} while (beher == 0 || beher < 0);

		for (int i = 0; i < marka.length; i++) {
			if (mark.equalsIgnoreCase(marka[i])) {
				if (prezioa[i] - beher != 0 || !((prezioa[i] - beher) < 0)) {
					prezioa[i] = prezioa[i] - beher;
				}
			}
		}

	}

	private static void inforIkusi(int[] id, String[] marka, double[] prezioa, String[] tam, String[] kol,
			int[] argurt) {
		// 3. Informazioa ikusi: Metodo honek produktu zehatz baten informazioa
		// erakusteko behar diren arrai guztiak jasotzen ditu. Produktuaren datu guztiak
		// informatzen dituen esaldi bat ikusiko du (Adibidea: “id” identifikatzailea
		// duen produktua “marka” markakoa da…).
		int ide;
		Scanner tek=new Scanner(System.in);
		
		System.out.println("Zein da ikustarazi nahi duzun produktuaren id-a?");
		ide=tek.nextInt();
		
		for(int i=0; i<id.length;i++) {
			if(ide==id[i]) {
				System.out.println("|| ID: " + id[i] + " || MARKA: " + marka[i] + " || PREZIOA: " + prezioa[i] + " || TAMAÑA: " + tam[i] + " || KOLOREA: " + kol[i] + " || ARGITARATZE URTEA: " + argurt[i]  + " ||");
			}
		}
	}

	private static void inforGorde(int[] id, String[] marka, double[] prezioa, String[] tam, String[] kol,
			int[] argurt) {
		// 4. Informazioa gorde: .csv fitxategia hasieran zegoen bezalako egiturarekin
		// utziko du, baina aldaketarik egin bada, fitxategian islatu beharko da.
		System.out.println("NO ME FUNTXIONA DANI :(");
		System.out.println("P.D: Fuimos el sabado a ver la ultima de los juegos del hambre y nos gusto mucho a todos, 100% recomendado");
	}

}
