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

		int[][] clase = new int[3][30];

		// llenar valores

		// Clase
		for (int x = 0; x < clase.length; x++) {
			for (int y = 0; y < clase[x].length; y++) {
				clase[x][y] = (int) (Math.random() * 10 + 1);
			}
		}

		// Visualizar array de la clase

		System.out.println("Notas de la Clase 1\n");

		for (int x = 0; x < clase.length; x++) {
			for (int y = 0; y < clase[x].length; y++) {
				System.out.print(clase[x][y] + "   ");
			}
			System.out.println("\n");
		}

		// Calculo notas minimas y maximas

		int min = clase[0][0];
		int max = clase[0][0];

		for (int x = 0; x < clase.length; x++) {
			for (int y = 0; y < clase[x].length; y++) {

				if (clase[x][y] < min) {
					min = clase[x][y];
				}
				if (clase[x][y] > max) {
					max = clase[x][y];
				}
			}
		}
	
		//Visualizar notas minimas y maximas
		for (int x = 0; x < clase.length; x++) {
			for (int y = 0; y < clase[x].length; y++) {
				if (min==clase[x][y]) {
					System.out.println("Nota minima: " +clase[x][y]+ " alumno: "+ x +" y= "+ y +" clase: "+(x+1));
				}
				if (max==clase[x][y]) {
					System.out.println("Nota maxima: " +clase[x][y]+ " alumno: x= "+ x +" y= "+ y +" clase: "+(x+1));
				}
			}
		}
	}

}
