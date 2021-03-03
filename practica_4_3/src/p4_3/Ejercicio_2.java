package p4_3;
/**
 * Diseñar programa Java, que:
 * a) Crea una tabla bidimensional de longitud 5x5 y nombre 'diagonal'.
 * b) Carga la tabla de forma que los componentes pertenecientes a la diagonal
 * 	  principal de la matriz tomen el valor 1 y el resto el valor 0.
 * c) Muestra el contenido de la tabla en pantalla.
 */

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
		
		int diagonal[][]=new int[5][5];
		
		for (int x = 0; x < diagonal.length; x++) {
			for (int y = 0; y < diagonal[0].length; y++) {
				if (x==y) {
					diagonal[x][y]=1;
				} else {
					diagonal[x][y]=0;
				}
				
			}
		}
		
		imprimirArrayBidimensional(diagonal);
	}

	private static void imprimirArrayBidimensional(int[][] diagonal) {
		for (int x = 0; x < diagonal.length; x++) {
			for (int y = 0; y < diagonal[0].length; y++) {
				System.out.print(diagonal[x][y]+"  ");
				
			}
			System.out.print("\n");
		}
	}

}
