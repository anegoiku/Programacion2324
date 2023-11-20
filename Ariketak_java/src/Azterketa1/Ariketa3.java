package Azterketa1;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java-ko programa bat idatzi, komentzio bateko ordutegia zehaztuko duena
		// asteko egunaren arabera. Komertzioak ordutegi hau dauka:
		// Astelehenetik ostiralera, 9:00 AM-tik 8:00 PM-ra.
		// Larunbatetan, 10:00 AM-tik 6:00 PM-ra.
		// Igandeetan itxita egongo da.

		// Bariableak
		String egu;
		Scanner scan = new Scanner(System.in);

		// Datuak
		System.out.println("Eman asteko egun bat");
		egu = scan.nextLine();
		scan.close();

		// Eragiketa
		if (egu.equals("astelehena")) {
			System.out.println("9:00AM-tik 8:00PM-ra");
		} else {
			if (egu.equals("asteartea")) {
				System.out.println("9:00AM-tik 8:00PM-ra");
			} else {
				if (egu.equals("asteazkena")) {
					System.out.println("9:00AM-tik 8:00PM-ra");
				} else {
					if (egu.equals("osteguna")) {
						System.out.println("9:00AM-tik 8:00PM-ra");
					} else {
						if (egu.equals("ostirala")) {
							System.out.println("9:00AM-tik 8:00PM-ra");
						} else {
							if (egu.equals("larunbata")) {
								System.out.println("10:00 AM-tik 6:00 PM-ra");
							} else {
								if (egu.equals("igandea")) {
									System.out.println("ITXITA");
								} else {
									System.out.println("ERROREA");
								}
							}
						}
					}
				}
			}
		}

	}

}
