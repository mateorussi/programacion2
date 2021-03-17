/**
 * Programa que dibuje un cuadrado mágico de orden impar introducido por el usuario.
 * Un cuadrado mágico es aquel en el que sin repetir ningún número, todas las filas,
 * columnas y las dos diagonales suman lo mismo
 * 
 * * un cuadro magico son que todas las sumas sean iguales entre ellas.
 */
package practica_4_4;

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

		int filas;
		int columnas;
		
	
		int[][] cuadrado= { {16,3,2,13}, {5,10,11,8}, {9,6,7,12}, {4,15,14,1} };
		
		//Suma filas
		
		int suma[] = new int[cuadrado.length];
		
		//sumas filas
		for (int x = 0; x < cuadrado.length; x++) {
			for (int y = 0; y < cuadrado[x].length; y++) {
				suma[x] = cuadrado[x][y];
			}
		}
		
		//comprobar sumas iguales
		
		for (int i = 0; i < suma.length; i++) {
			int j = suma[i];
			
		}
		
		//Suma columnas
		
		//Suma diagonal principal
		
		//suma diagonal secundaria
	}

}
