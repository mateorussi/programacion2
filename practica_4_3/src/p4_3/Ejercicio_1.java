package p4_3;

/**
 * Hacer un programa Java, que:
 * a) Crea una matriz de 10x10 (filas x columnas) y nombre 'tabla'.
 * b) Carga la matriz de manera que las filas pares se rellenan con 1 y las filas impares
 * con 0.
 * c) Una vez inicializada la matriz muestra su contenido en pantalla.

 */

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tabla=new int[10][10];
		
		for (int x = 0; x < tabla.length; x++) {
			for (int y = 0; y < tabla[0].length; y++) {
				if (x%2==0) {
					tabla[x][y]=1;
				} else {
					tabla[x][y]=0;
				}
			}
		}
		
		for (int x = 0; x < tabla.length; x++) {
			for (int y = 0; y < tabla[0].length; y++) {
				System.out.print(tabla[x][y]+"  ");
				
			}
			System.out.print("\n");
		}
		
	}

}
