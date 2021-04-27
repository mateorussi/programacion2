/**
 * Generar 200 números aleatorios entre el 1 y el 49. Debes calcular el
 * número de veces que se repite cada uno, de forma óptima. Mostrar
 * finalmente cuáles son los cinco valores más repetidos.
 */
package practica_8_1;

/**
 * @author mateorussi
 *
 */
public class Actividad_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos un vector de capacidad 200 elementos
		int[] vector = new int[200];
		
		//Cargamos valores aleatorios entre 1 y 49
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(Math.random()*49+1);
		}
		
		//Declarar una tabla y prepararla para el conteo de las repeticiones
		int[][] tablaRepeticiones = new int[2][49];
		
		for (int i = 0; i < tablaRepeticiones.length; i++) {
			tablaRepeticiones[0][i] = i+1;
		}
		
		//Contar las repeticiones de elementos del vector
		int contenido = 0;
		for (int i = 0; i < tablaRepeticiones.length; i++) {
			contenido = vector[i];
			tablaRepeticiones[1][contenido-1]++;
		}
		
		System.out.println("Tabla de repeticiones antes de ordenar");
		for (int i = 0; i < tablaRepeticiones.length; i++) {
			for (int j = 0; j < tablaRepeticiones[i].length; j++) {
				System.out.printf("%2d-", tablaRepeticiones[i][j]);
			}
			System.out.println();
		}
		
		//Ordenar tablaRepeticiones
		
		int aux, cont = 0;
		
		boolean ordenado = false;
		
		for (int i = 0; i < tablaRepeticiones[0].length; i++) {
			ordenado = true;
			for (int j = 0; j < tablaRepeticiones.length; j++) {
				cont++;
				if (tablaRepeticiones[1][i]<tablaRepeticiones[1][i+1]) {
					ordenado = false;
					aux = tablaRepeticiones[1][i];
					tablaRepeticiones[1][i] = tablaRepeticiones[1][i+1];
					tablaRepeticiones[1][i+1] = i;
					aux = tablaRepeticiones[0][i];
					tablaRepeticiones[0][i] = tablaRepeticiones[0][i];
				}
			}
		}
		
	}

}
