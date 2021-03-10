package p4_3;
/**
 * Una vez cargado un array numerico de dos dimensiones (10X15), obtener un array
 * unidimensional o vector cuyo primer elemento contenga la suma de los elementos de
 * la primera fila del array bidimensional, el segundo la suma de los elementos de la
 * segunda fila del array bidimensional, y asi sucesivamente.
 */

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz=new int[10][15];
		int[] vectorSuma=new int[10];
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y]=(int) (Math.random()*9);
			}
		}
		
		//Visualizar array
		System.out.println("Array bidimensional\n");
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y]+"   ");
			}
			System.out.println("\n");
		}
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				vectorSuma[x] +=  matriz[x][y];
			}
		}
		
		//Visualizar Array
		System.out.println("\nVector suma\n");
		for (int i = 0; i < vectorSuma.length; i++) {
			System.out.print("\t"+vectorSuma[i]);
		}
	
	}

}
