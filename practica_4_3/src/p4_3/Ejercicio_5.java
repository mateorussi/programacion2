package p4_3;

import java.util.Scanner;

/**
 * Diseñar programa Java, que:
 * a) Crea una tabla bidimensional de longitud 5x5 y nombre 'matriz'.
 * b) Carga la tabla con valores numericos enteros.
 * c) Suma todos los elementos de cada fila y todos los elementos de cada columna
 * visualizando los resultados en pantalla.

 */

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int matriz[][]=new int[5][5];
		int nArray[][]=new int[6][6];
		int total=0;
		
		//cargar elementos
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.println("Ingrese valor de posicion x = "+x+" y= "+y);
				matriz[x][y]=sc.nextInt();
			}
		}
		
		// Sumar filas
		for (int i = 0; i < nArray.length - 1; i++) {
		    int suma = 0;
		    for (int j = 0; j < nArray[i].length - 1; j++) {
		        suma += nArray[i][j];
		    }
		    nArray[i][n[i].length] = suma; // Asignamos en la ultma posicion de j (columnas)
		}

		// Sumar columnas
		for (int i = 0; i < nArray.length; i++) {
		    int suma = 0;
		    for (int j = 0; j < nArray[i].length - 1; j++) {
		        suma += nArray[j][i]; // Invertimos las posiciones para poder sumar de forma horizontal
		    }
		    nArray[n.length][i] = suma;
		}

		// A la ultma posición se agrega el total
		nArray[nArray.length - 1][nArray[0].length - 1] = total;

		// Mostramos la matriz
		for (int i = 0; i < nArray.length; i++) {
		    for (int j = 0; j < nArray[i].length; j++) {
		        System.out.print(nArray[i][j] + ", ");
		        if (nArray.length == j)
		            System.out.println("\n");
		    }
		}
		
	}

}
