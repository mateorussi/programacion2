package p4_3;
/**
 * Visualizar la matriz transpuesta de la anterior. Si la matriz es cuadrada (tiene igual
 * numero de filas y de columnas) visualice tambien los elementos de la diagonal
 * principal.
 * 
 * 3 2 5 0 9     
 * 9 10 2 3 1
 * -3 2 3 43 1
 * 
 * 3 9 -3
 * 2 10 2
 * 5 2 3
 * 0 3 43
 * 9 1 1

 */

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diagonal[][]=new int[5][5];
		int[][] transpuesta = new int[diagonal[0].length][diagonal.length];
		
		for (int x = 0; x < diagonal.length; x++) {
			for (int y = 0; y < diagonal[0].length; y++) {
				if (x==y) {
					diagonal[x][y]=1;
				} else {
					diagonal[x][y]=0;
				}
			}
		}
		
		transpuesta(diagonal, transpuesta);
		imprimirArrayBidimensional(transpuesta);
	}

	private static void transpuesta(int[][] diagonal, int[][] transpuesta) {
		for (int x = 0; x < diagonal.length; x++) {
			for (int y = 0; y < diagonal[0].length; y++) {
				transpuesta[y][x]=diagonal[x][y];
			}
		}
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
