package p4_3;
import java.util.Iterator;

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
			for (int y = 0; y < tabla[x].length; y++) {
				if (tabla[x]%2==0) {
					tabla[x]=1;
				} else {
					tabla[x]=0;
					System.out.println("esto es una prueba");
				}
			}
		}
		
	}

}
