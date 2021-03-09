package p4_3;

import javax.swing.JOptionPane;

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
		
		int matriz[][]=new int[5][5];
		int sumaFila[]=new int[5];
		int sumaColumna[]=new int[5];
		
		//cargar elementos
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y]= Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de posicion x = "+x+" y = "+y));
			}
		}
		
		// Sumar filas y Columnas
		for (int x = 0; x < matriz.length; x++) {
		 
		    for (int y = 0; y < matriz[x].length; y++) {
		        sumaFila[y] += matriz[y][x];
		        sumaColumna[y] += matriz[x][y];
		    }
		}
		
		for (int x = 0; x < sumaColumna.length; x++) {
			System.out.println("");
			for (int y = 0; y < sumaColumna.length; y++) {
				System.out.print("\t"+matriz[x][y]);
			}
			
		}

		// Mostramos la matriz suma
		System.out.println("\n\nVector suma de Filas\n");
		for (int i = 0; i < sumaFila.length; i++) {
			System.out.print("\t"+sumaFila[i]);
		}
		System.out.println("\n\nVector suma de Columnas\n");
		for (int i = 0; i < sumaColumna.length; i++) {
			System.out.print("\t"+sumaColumna[i]);
		}
		
	}

}
