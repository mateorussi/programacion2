/**
 * Se captura una matriz de 3 x 3 por teclado. Calcular su determinante.
 */
package practica_4_4;

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

		int[][] d = { {16,3,2}, {5,10,11}, {9,6,7} };
		
		//determinante que se suma
		
		
		
		//determinante que se resta
		
		int suma = (d[0][0] * d[1][1] * d[2][2]) + (d[0][1] * d[1][2] * d[2][0]) + (d[1][0] * d[2][1] * d[0][2]);
		int resta = (d[0][2] * d[1][1] * d[2][0]) + (d[0][1] * d[1][0] * d[2][2]) + (d[1][2] * d[2][1] * d[0][0]);
	
		int det = suma - resta;
		
		System.out.println("El determinante de la matriz es: "+det);
	}

}
