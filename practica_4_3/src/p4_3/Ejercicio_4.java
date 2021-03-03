package p4_3;

import java.util.Scanner;

/**
 * Se captura por teclado los valores de una matriz de 4 x 4. Deseamos saber si es una
 * matriz identidad. Es aquella que en la diagonal posee el valor 1 y en el resto de las
 * posiciones tiene el valor 0.

 */

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int identidad[][] = new int[4][4];
		boolean esIdentidad = false;

		// ingresar valores
		for (int x = 0; x < identidad.length; x++) {
			for (int y = 0; y < identidad[x].length; y++) {
				System.out.println("Ingrese un valor para la posicion x=" + x + " y=" + y);
				identidad[x][y] = sc.nextInt();
			}

		}

		// verificar si es una identidad
		for (int x = 0; x < identidad.length; x++) {
			for (int y = 0; y < identidad[x].length; y++) {
				if ((x == y && identidad[x][y] == 1) || (x != y && identidad[x][y] == 0)) {
					esIdentidad = true;
				} else {
					esIdentidad = false;
				}
			}
		}
		
		if (esIdentidad == true) {
			System.out.println("Es una matriz identidad");
		} else {
			System.out.println("No es una matriz identidad");
		}
		
		// imprimir matriz
		for (int x = 0; x < identidad.length; x++) {
			for (int y = 0; y < identidad[x].length; y++) {
				System.out.print(identidad[x][y]+"  ");
				
			}
			System.out.print("\n");
		}
	}
}
