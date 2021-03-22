/**
 * Programa que cargue desde teclado una tabla de enteros de dimensión 3x4. El
 * programa mostrará la fila en la que la suma de sus elementos sea mayor.
 */
package practica_4_4;

import javax.swing.JOptionPane;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tabla = new int[3][4];
		
		int[] suma = new int[3];
		
		int suma_mayor = 0;
		int indice_mayor = 0;
		
		for (int x = 0; x < tabla.length; x++) {
			for (int y = 0; y < tabla[x].length; y++) {
				tabla[x][y]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero para x = "+x+" y = "+y));
			}
		}
		
		for (int x = 0; x < tabla.length; x++) {
			for (int y = 0; y < tabla[x].length; y++) {
				suma[x] += tabla[x][y];
			}
		}
		
		for (int i = 0; i < suma.length; i++) {
			if (suma[i] > suma_mayor) {
				suma_mayor = suma[i];
				indice_mayor = i;
			}
		}
		
		System.out.println("La fila de mayor valor es la "+indice_mayor+" con valor de: "+suma_mayor);
	}

}
