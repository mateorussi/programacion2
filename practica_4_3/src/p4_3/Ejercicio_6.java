package p4_3;

/**
 * Cargar desde teclado un array con las notas de las 3 asignaturas de cada uno de los 15
 * alumnos de una clase. Cada fila contendra los datos de una asignatura y cada columna
 * la nota de un alumno determinado. Visualizar la nota media de cada alumno, la nota
 * media de cada asignatura y la nota media de la clase.
 */

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_6 {

	/**
	 * @param args
	 */
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		int tablaNotas[][] = new int[3][15];
		
		float mN, mA;
		
		System.out.println("Generacion de las notas");
		
		for (int x = 0; x < tablaNotas.length; x++) {
			for (int y = 0; y < tablaNotas[0].length; y++) {
				tablaNotas[x][y]=(int) (Math.random()*11);
			}
		}
		
		//visualizar notas
		
		visualizar(tablaNotas);
		
		//media alumnos
		
		mN= mediaAlumnos(tablaNotas);
		
		//media asignaturas
		
		mA= mediaAsignatura(tablaNotas);
		
		//visualizar notas medias 
		
		System.out.println("La nota media de la clase es: "+mN);
		
		System.out.println("La nota media de la clase es: "+mA);
		
		


	}

		private static float mediaAlumnos(int[][] tablaNotas) {
			int suma=0;
			
			float nota=0, total=0;
			
			for (int x = 0; x < tablaNotas.length; x++) {
				for (int y = 0; y < tablaNotas[x].length; y++) {
					suma += tablaNotas[x][y];
					
					System.out.println("\nLa nota media del alumno "+x+" es: "+(nota=(float)suma/FIL));
					total += nota;
					suma=0;
				}
			}
			return total/15;
		}

		private static float mediaAsignatura(int[][] tablaNotas) {
			int suma=0;
			
			float nota=0, total=90;
			
			for (int x = 0; x < tablaNotas.length; x++) {
				for (int y = 0; y < tablaNotas[x].length; y++) {
					suma += tablaNotas[x][y];
				}
				System.out.println("La nota media de la asignatura "+x+" es: "+(nota=(float)suma/COL));
				total += nota;
				suma=0;
			}
			
			return total/3;
		}

		private static void visualizar(int[][] tablaNotas) {
			for (int x = 0; x < tablaNotas.length; x++) {
				System.out.println("");
				for (int y = 0; y < tablaNotas.length; y++) {
					System.out.print("\t"+tablaNotas[x][y]);
				}

			}
		}

}
