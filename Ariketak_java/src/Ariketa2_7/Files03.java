package Ariketa2_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


// Arrai asko egin beharrean, Langilea klasea erabili daiteke 

class Langilea{
	int id;
	String izena;
	String abizena;
	String email;
	String email2;
	String lanbidea;
	int adina;
	double soldata;
}


public class Files03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// fitxategia irakurtzeko kodea
		
		Scanner tek=new Scanner(System.in);
		File fitxategia = new File("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\fitxategiak\\pertsonak-koma.txt");
		String testulerroa;
		String[] data;

		int zenbat = 100;
		
		/*
		int[] id = new int[zenbat];
		String[] firstname = new String[zenbat];
		String[] lastname = new String[zenbat];
		String[] email = new String[zenbat];
		String[] email2 = new String[zenbat];
		String[] profession = new String[zenbat];
		int[] age = new int[zenbat];
		double[] salary = new double[zenbat];
		 */

		// Erregistro motako Array bakarra lerro bakoitzeko informazio guztia biltzeko
		Langilea[] langileak = new Langilea[zenbat];

		// BEGIN :: FILEREADER ERABILIZ
		
		FileReader reader = new FileReader(fitxategia);
		BufferedReader buffer = new BufferedReader(reader);
				
		
		testulerroa = buffer.readLine();
		
		// lehen lerroa kentzeko, ez dira pertsonen datuak eta.
		if(testulerroa!=null){
			testulerroa = buffer.readLine();
		}
		
		int i = 0;
		Langilea langilea;
		
		while(testulerroa!=null) {
			
			data = testulerroa.split(",");
			langilea = new Langilea();
			
			langilea.id = Integer.parseInt(data[0]);
			langilea.izena = data[1];
			langilea.abizena = data[2];
			langilea.email = data[3];
			langilea.email2 = data[4];
			langilea.lanbidea = data[5];
			langilea.adina = Integer.parseInt(data[6]);
			langilea.soldata = Double.parseDouble(data[7]);
			
			langileak[i] = langilea;
			
			testulerroa = buffer.readLine();
			i++;
		}
		
		buffer.close();
		System.out.println("Sartu langilearen zenbakia");

		int norena = tek.nextInt();
		Langilea e = langileak[norena];
		
		
		System.out.println(e.abizena +" "+ e.izena+" kidearen soldata $"+e.soldata+" da hilean");
		
		// END :: FILEREADER ERABILIZ



		
	}

}