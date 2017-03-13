package repositoGH;

import java.util.Scanner;

public class Prueba01 {
	// subida de prueba a GitHub
	
	public static void main(String args[]) {
		int i;
		int premCon;
		int premNum;
		String prem;
		int ultimo = 0;
		Scanner in = new Scanner(System.in);

		do {
			premCon = in.nextInt();
			if (premCon >= 1 && premCon <= 10000) {
				int[] termin = new int[10];
				int mayorRepe = 0;
				int cantidad = 0;
				int varias = 0;
				for (i = 1; i <= premCon; i++) {
					prem = in.next();
					premNum = Integer.parseInt(prem);
					ultimo = premNum % 10;
					termin[ultimo]++;
				}
				if (premCon != 0) {
					for (i = 0; i < 10; i++) {
						if (termin[i] != 0) {
							if (termin[i] > cantidad) {
								mayorRepe = i;
								varias = 0;
								cantidad = termin[i];
							}
							if (termin[i] == cantidad && mayorRepe != i) {
								varias = 1;
							}
						}
					}
					if (varias == 1) {
						System.out.println("VARIAS");
					} else {
						System.out.println(mayorRepe);
					}
				}
			}
		} while (premCon != 0);
		in.close();
	}

}
