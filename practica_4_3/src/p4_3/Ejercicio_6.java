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

		String tablaNotas[][] = new String[4][16];

//		int numAlumnos = Integer.parseInt(entrada.nextLine());
		
		double[] notasN = new double[tablaNotas];
		String[] notasS = new String[tablaNotas];

		float nMediaAlumno, nMediaAsignatura, nMediaClase;
//		Datos asignaturas en las filas
		tablaNotas[0][0] = "Asignatura";
		tablaNotas[1][0] = "PROG";
		tablaNotas[2][0] = "FOL";
		tablaNotas[3][0] = "BBDD";

//		 Datos alumnos en columnas 
		tablaNotas[0][1] = "Alumno 1";
		tablaNotas[0][2] = "Alumno 2";
		tablaNotas[0][3] = "Alumno 3";
		tablaNotas[0][4] = "Alumno 4";
		tablaNotas[0][5] = "Alumno 5";
		tablaNotas[0][6] = "Alumno 6";
		tablaNotas[0][7] = "Alumno 7";
		tablaNotas[0][8] = "Alumno 8";
		tablaNotas[0][9] = "Alumno 9";
		tablaNotas[0][10] = "Alumno 10";
		tablaNotas[0][11] = "Alumno 11";
		tablaNotas[0][12] = "Alumno 12";
		tablaNotas[0][13] = "Alumno 13";
		tablaNotas[0][14] = "Alumno 14";
		tablaNotas[0][15] = "Alumno 15";
		
		for (int x = 0; x < tablaNotas.length; x++) {
			for (int y = 0; y < tablaNotas.length; y++) {
				do {
					
					tablaNotas[x][y]=String.valueOf(Math.random()*14+1);
			
					if (notasN[i] >= 0 && notasN[i] < 5) {
						notasS[i] = "Suspenso";
					} else if (notasN[i] >= 5 && notasN[i] < 7) {
						notasS[i] = "Bien";
					} else if (notasN[i] >= 7 && notasN[i] < 9) {
						notasS[i] = "Notable";
					} else if (notasN[i] >= 9 && notasN[i] <= 10) {
						notasS[i] = "Sobresaliente";
					} else {
						notasS[i] = "Nota erronea";
					}
				} while (notasN[i] < 0 || notasN[i] > 10);
			}
			
		}
		entrada.close();
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("La nota de " + nombres[i] + " es " + notasN[i] + ", " + notasS[i]);
		}

// 

//		
//		// Asignacion de notas de alumnos
//		for (int x = 0; x < tablaNotas.length; x++) {
//			for (int y = 0; y < tablaNotas.length; y++) {
//				tablaNotas[x][y]= (int) (Math.random()*10+1;
//			}
//		}
//		
//		// Visualizar Array
//		
//		for (int x = 0; x < tablaNotas.length; x++) {
//			System.out.println("");
//			for (int y = 0; y < tablaNotas.length; y++) {
//				System.out.print("\t"+tablaNotas[x][y]);
//			}
//
//		}

	}

}
