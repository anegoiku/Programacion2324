package Ariketa2_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pokemon {

	public static void main(String[] args) throws IOException {
		// Leer información del fichero “pokemons.csv” fitxategiko informazioa irakurri
		// eta arrai-etan kargatu (izenak, motak, mailak, erasoak, defentsak, abiadurak)
		// 0 pokemon-aren izena aldatu eta "PICACHU" deitu (letra larriz)
		// 3. pokemon-aren eraso maila 5ean gehitu.
		// Arrai-etako informazioa fitxategian gorde.
		// Metodoak, datuakKargatu, datuakModifikatu eta datuakGorde.

		// Bariableak
		File file = new File("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa2_7\\pokemons.csv");
		FileReader reader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(reader);
		Scanner tek = new Scanner(System.in);

		int i = 0;
		int menua = 0;
		String lerroa;
		String[] zatiak;
		String[] iz = new String[20];
		String[] mot = new String[20];
		int[] mail = new int[20];
		int[] eraso = new int[20];
		int[] def = new int[20];
		int[] abi = new int[20];

		// Arraiak bete
		lerroa = buffer.readLine();
		lerroa = buffer.readLine();

		while (lerroa != null) {
			zatiak = lerroa.split(",");
			iz[i] = zatiak[0];
			mot[i] = zatiak[1];
			mail[i] = Integer.parseInt(zatiak[2]);
			eraso[i] = Integer.parseInt(zatiak[3]);
			def[i] = Integer.parseInt(zatiak[4]);
			abi[i] = Integer.parseInt(zatiak[5]);

			lerroa = buffer.readLine();
			i++;
		}

		// Menua
		do {
			System.out.println("------MENUA------");
			System.out.println("0. IRTEN");
			System.out.println("1. Pokemonak zerrendatu");
			System.out.println("2. Gorde");
			System.out.println("3. Pokemonak kontsultatu");
			System.out.println("4. Aldatu");
			System.out.println("5. Izenaren arabera bilatu");
			System.out.println("6. Azkarrenak");
			System.out.println("7. Motaren arabera zerrendatu");
			System.out.println("8. Borroka 1");
			System.out.println("9. Borroka 2");
			System.out.println("-----------------");
			menua = tek.nextInt();

			switch (menua) {

			case 1:// Pokemonak zerrndatu
				zerrendaTu(iz, mot, mail, eraso, def, abi);
				break;

			case 2:// Gorde
				gorde(iz, mot, mail, eraso, def, abi);
				break;

			case 3:// Pokemonak kontsultatu
				kontsultatu(iz, mot, mail, eraso, def, abi);
				break;

			case 4:// Aldatu
				aldatu(iz, mot, mail, eraso, def, abi);
				break;

			case 5:// Izenaren arabera bilatu
				izenaBilatu(iz, mot, mail, eraso, def, abi);
				break;

			case 6:// Azkarrenak
				azkarrenak(iz, mot, mail, eraso, def, abi);
				break;

			case 7:// Motaren arabera bilatu
				motaBilatu(iz, mot, mail, eraso, def, abi);
				break;

			case 8:// Borroka 1
				borrokaBat(iz, mail, eraso, def, abi);
				break;

			case 9:// Borroka 2
				borrokaBi(iz, mail, eraso, def, abi);
				break;

			case 0:// IRTEN
				System.out.println("AMAIERA");
				break;

			default: // Beste zenbaki bat
				System.out.println("ERROREA");
			}
		} while (menua != 0);

	}

	private static void zerrendaTu(String[] iz, String[] mot, int[] mail, int[] eraso, int[] def, int[] abi) {
		// 1. Zerrendatu: POKEMON guztiak zerrendatuko ditu

		for (int i = 0; i < iz.length; i++) {
			System.out.println("|| Izena: " + iz[i] + " || Mota: " + mot[i] + " || Maila: " + mail[i] + " || Erasoa: "
					+ eraso[i] + " || Defentsa: " + def[i] + " || Abiadudra: " + abi[i] + " ||");
		}
	}

	private static void gorde(String[] iz, String[] mot, int[] mail, int[] eraso, int[] def, int[] abi)
			throws IOException {
		// 2. Gorde: Arrai-ak fitxategian gordeko ditu.
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa2_7\\pokemons.csv"));

		for (int i = 0; i < iz.length; i++) {
			bw.write(iz[i] + "," + mot[i] + "," + mail[i] + "," + eraso[i] + "," + def[i] + "," + abi[i] + "\n");
			bw.flush();
		}
		bw.close();
	}

	private static void kontsultatu(String[] iz, String[] mot, int[] mail, int[] eraso, int[] def, int[] abi) {
		// 3. Pokemon_kontsultatu: Pokemon baten izena eskatu eta bere informazio guztia
		// erakutsiko du.

		String poke;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein pokemonen datuak ikusaraztea nahi duzu?");
		poke = tek.next();
		for (int i = 0; i < iz.length; i++) {
			if (poke.equalsIgnoreCase(iz[i])) {
				System.out.println("|| Izena: " + iz[i] + " || Mota: " + mot[i] + " || Maila: " + mail[i]
						+ " || Erasoa: " + eraso[i] + " || Defentsa: " + def[i] + " || Abiadudra: " + abi[i] + " ||");
			}
		}
	}

	private static void aldatu(String[] iz, String[] mot, int[] mail, int[] eraso, int[] def, int[] abi) {
		// 4. Aldatu: Pokemon baten izena eskatu, bere informazioa bistaratu eta maila,
		// eraso, defentsa eta abiadurako datuak aldatzea eskatuko da. Arraietan
		// aldatuko dira datuak.
		String poke;
		int newmail;
		int neweraso;
		int newdef;
		int newabi;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein pokemonen datuak aldatu nahi dituzu?");
		poke = tek.next();
		for (int i = 0; i < iz.length; i++) {
			if (poke.equalsIgnoreCase(iz[i])) {
				System.out.println("|| Izena: " + iz[i] + " || Mota: " + mot[i] + " || Maila: " + mail[i]
						+ " || Erasoa: " + eraso[i] + " || Defentsa: " + def[i] + " || Abiadudra: " + abi[i] + " ||");
				System.out.println("Eman pokemonaren maila berria:");
				newmail = tek.nextInt();
				mail[i] = newmail;
				System.out.println("Eman pokemonaren eraso berria:");
				neweraso = tek.nextInt();
				eraso[i] = neweraso;
				System.out.println("Eman pokemonaren defentsa berria:");
				newdef = tek.nextInt();
				def[i] = newdef;
				System.out.println("Eman pokemonaren abiadura berria:");
				newabi = tek.nextInt();
				abi[i] = newabi;
				System.out.println("<--DATUAK EGUNERATZEKO MENUKO 2º AUKERA EJEKUTATU BEHAR DUZU-->");
			}
		}
	}

	private static void izenaBilatu(String[] iz, String[] mot, int[] mail, int[] eraso, int[] def, int[] abi) {
		// 5. Izenaren arabera bilatu: Programak kate bat eskatu eta kate hori izenean
		// duten Pokemon-en informazioaren zerrenda bistaratuko du.
		String katea;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein da bilatu nahi duzun katea?");
		katea = tek.next();
		katea.toLowerCase();
		for (int i = 0; i < iz.length; i++) {
			if (iz[i].toLowerCase().contains(katea)) {
				System.out.println("|| Izena: " + iz[i] + " || Mota: " + mot[i] + " || Maila: " + mail[i]
						+ " || Erasoa: " + eraso[i] + " || Defentsa: " + def[i] + " || Abiadudra: " + abi[i] + " ||");
			}
		}
	}

	private static void azkarrenak(String[] iz, String[] mot, int[] mail, int[] eraso, int[] def, int[] abi) {
		// 6. Azkarrenak: batazbesteko abiadura baino altuagoa duten Pokemon-en
		// informazioa bistaratuko du.
		double bataz;
		double tot = 0;
		for (int i = 0; i < iz.length; i++) {
			tot = tot + abi[i];
		}
		bataz = tot / abi.length;
		for (int i = 0; i < iz.length; i++) {
			if (abi[i] > bataz) {
				System.out.println("|| Izena: " + iz[i] + " || Mota: " + mot[i] + " || Maila: " + mail[i]
						+ " || Erasoa: " + eraso[i] + " || Defentsa: " + def[i] + " || Abiadudra: " + abi[i] + " ||");
			}
		}
	}

	private static void motaBilatu(String[] iz, String[] mot, int[] mail, int[] eraso, int[] def, int[] abi) {
		// 7. Motaren arabera zerrendatu: Mota bat eskatuko da eta mota horretako
		// Pokemon-ak bistaratuko ditu. Mota ez bada existitzen, mezu bat erakutsiko da.
		String mota;
		int kont = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein motako pokemonak nahi dituzu erakuztea?");
		mota = tek.next().toLowerCase();

		for (int i = 0; i < iz.length; i++) {
			if (mot[i].toLowerCase().contains(mota)) {
				System.out.println("|| Izena: " + iz[i] + " || Mota: " + mot[i] + " || Maila: " + mail[i]
						+ " || Erasoa: " + eraso[i] + " || Defentsa: " + def[i] + " || Abiadudra: " + abi[i] + " ||");
				kont++;
			}
		}
		if (kont == 0) {
			System.out.println("POKEMON MOTA HAU EZ DA EXISTITZEN");
		}
	}

	private static void borrokaBat(String[] iz, int[] mail, int[] eraso, int[] def, int[] abi) {
		// 8. Borroka1: Borroka egingo duten bi Pokemon-ak eskatuko dira. Maila, erasoa,
		// defentsa eta abiaduraren batazbestekoa kalkulatuko da. Batazbesteko hobea
		// izango duenak irabaziko du. Mezua bistaratuko da.
		String pok1, pok2;
		double bataz1 = 0, bataz2 = 0, tot1 = 0, tot2 = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein da borrokatuko duen lehenengo pokemonaren izena?");
		pok1 = tek.next();
		System.out.println("Zein da borrokatuko duen bigarren pokemonaren izena?");
		pok2 = tek.next();

		for (int i = 0; i < iz.length; i++) {
			if (pok1.equalsIgnoreCase(iz[i])) {
				tot1 = mail[i] + eraso[i] + def[i] + abi[i];
			}
			if (pok2.equalsIgnoreCase(iz[i])) {
				tot2 = mail[i] + eraso[i] + def[i] + abi[i];
			}
		}
		bataz1 = tot1 / 4;
		bataz2 = tot2 / 4;
		if (bataz1 > bataz2) {
			System.out.println(pok1 + " pokemonak irabazi du");
		}
		if (bataz1 < bataz2) {
			System.out.println(pok2 + " pokemonak irabazi du");
		}
		if (bataz1 == bataz2) {
			System.out.println("Pokemon hauek enpatatuta daude!!");
		}
	}

	private static void borrokaBi(String[] iz, int[] mail, int[] eraso, int[] def, int[] abi) {
		// 9. Borroka2: Bigarren Pokemon borrokolaria ausaz aukeratuko da. Galtzaileari
		// ausazko baloreak esleituko zaizkio, mailan, erasoan, defentsan eta abiaduran,
		// 0 eta gehiengoaren artean.
		double x;
		String pok1, pok2;
		double bataz1 = 0, bataz2 = 0, tot1 = 0, tot2 = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Zein da borrokatuko duen lehenengo pokemonaren izena?");
		pok1 = tek.next();
		x = Math.random() * 19 + 0;
		pok2 = iz[(int) x];

		for (int i = 0; i < iz.length; i++) {
			if (pok1.equalsIgnoreCase(iz[i])) {
				tot1 = mail[i] + eraso[i] + def[i] + abi[i];
			}
			if (pok2.equalsIgnoreCase(iz[i])) {
				tot2 = mail[i] + eraso[i] + def[i] + abi[i];
			}
		}
		bataz1 = tot1 / 4;
		bataz2 = tot2 / 4;
		if (bataz1 > bataz2) {
			System.out.println(pok1 + " pokemonak irabazi du");
			for (int i = 0; i < iz.length; i++) {
				if (pok2.equalsIgnoreCase(iz[i])) {
					mail[i] = (int) (Math.random() * 130 + 0);
					eraso[i] = (int) (Math.random() * 130 + 0);
					def[i] = (int) (Math.random() * 130 + 0);
					abi[i] = (int) (Math.random() * 130 + 0);
				}
			}
		}
		if (bataz1 < bataz2) {
			System.out.println(pok2 + " pokemonak irabazi du");
			for (int i = 0; i < iz.length; i++) {
				if (pok1.equalsIgnoreCase(iz[i])) {
					mail[i] = (int) (Math.random() * 130 + 0);
					eraso[i] = (int) (Math.random() * 130 + 0);
					def[i] = (int) (Math.random() * 130 + 0);
					abi[i] = (int) (Math.random() * 130 + 0);
				}
			}
		}
		if (bataz1 == bataz2) {
			System.out.println("Pokemon hauek enpatatuta daude!!");
		}
	}

}
