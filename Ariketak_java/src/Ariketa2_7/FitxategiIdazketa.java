package Ariketa2_7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FitxategiIdazketa {
	
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("src/proba.txt"));
		bw.write("Hau da proba bat.");
		bw.flush();
		bw.close();
	}
	
	
}
