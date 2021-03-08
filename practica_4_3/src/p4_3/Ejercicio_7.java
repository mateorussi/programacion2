package p4_3;
/**
 * Realizar un programa Java que:
 * a. Llene un array bidimensional con las notas numericas de cada estudiante en las
 * clases de un profesor, se supone que el profesor tiene 3 clases diferentes y un
 * maximo de 30 alumnos por clase.
 * b. Visualice el array.
 * c. Calcule la nota maxima y minima visualizando a que alumno y grupo pertenece, en
 * caso de que estas notas se repitan se visualizan todas. 
 */

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] clase1 = new int[30][30];
		int[][] clase2 = new int[30][30];
		int[][] clase3 = new int[30][30];

		// llenar valores

		// Clase 1
		for (int x = 0; x < clase1.length; x++) {
			for (int y = 0; y < clase1[x].length; y++) {
				clase1[x][y] = (int) (Math.random() * 10);
			}
		}

		// Clase 2
		for (int x = 0; x < clase2.length; x++) {
			for (int y = 0; y < clase2[x].length; y++) {
				clase2[x][y] = (int) (Math.random() * 10);
			}
		}

		// Clase 3
		for (int x = 0; x < clase3.length; x++) {
			for (int y = 0; y < clase3[x].length; y++) {
				clase3[x][y] = (int) (Math.random() * 10);
			}
		}

		// Visualizar array

		System.out.println("Notas de la Clase 1\n");
		// Clase 1
		for (int x = 0; x < clase1.length; x++) {
			for (int y = 0; y < clase1[x].length; y++) {
				System.out.print(clase1[x][y]+"   ");
			}
			System.out.println("\n");
		}
		System.out.println("\nNotas de la Clase 2\n");
		// Clase 2
		for (int x = 0; x < clase2.length; x++) {
			for (int y = 0; y < clase2[x].length; y++) {
				System.out.print(clase1[x][y]+"   ");
			}
			System.out.println("\n");
		}
		System.out.println("\nNotas de la clase 3\n");
		// Clase 3
		for (int x = 0; x < clase3.length; x++) {
			for (int y = 0; y < clase3[x].length; y++) {
				System.out.print(clase1[x][y]+"   ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		//Calculo 
		
		
		
	}

}
