package Ariketa2_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import java.io.IOException;

public class IrakurketaFitxategiak {
////Lehenengo adibidea
//	public static void main(String[] args) throws IOException {
//		BufferedReader br= new BufferedReader(new FileReader("‪C:\Users\1AW3-14\Documents\Copia de seguridad\Ariketak_java\src\fitxategiak\kaixo-fitxategiak.txt"));
//		String lerroa=br.readLine();
//		while (lerroa!=null) {
//			System.out.println(lerroa);
//			lerroa=br.readLine();
//		}
//		br.close();
//	}

	
//Bigarren adibidea
	public static void main(String[] args) throws IOException {
		File fitxategia=new File("‪C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\fitxategiak\\kaixo-fitxategiak.txt");
		FileReader fr= new FileReader(fitxategia);
		BufferedReader br=new BufferedReader(fr);
		String lerroa=br.readLine();
		while (lerroa!=null) {
			System.out.println(lerroa);
			lerroa=br.readLine();
		}
		br.close();
	}
}
