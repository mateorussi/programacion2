/**
 * Realizar un programa Java que permita cargar un vector numérico
 * TB_NUM[100] con números aleatorios, ordenarlo e intercalar en la
 * posición correcta dentro del vector un valor introducido por teclado.
 * Visualice finalmente el vector con el dato intercalado. El valor antiguo
 * que estaba en la posición en la que se inserta se pierde.
 */
package practica_8_1;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @author mateorussi
 *
 */
public class Actividad_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] TB_NUM = new int[100];
		
		for (int i = 0; i < TB_NUM.length; i++) {
			TB_NUM[i] = (int) (Math.random()*100+1);
		}
		
		Arrays.sort(TB_NUM);
		
		//Pedir al usuario numero que desea sobreponer e intercalarlo al vector
		

		for (int i = 0; i < TB_NUM.length; i++) {
			System.out.print("\t"+TB_NUM[i]);
		}
		
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para sobreponerlo en el vector"));

		for (int i = 0; i < TB_NUM.length; i++) {
			if (numUsuario > TB_NUM[i]) { //Aqui se debe poner que es menor? mayor?, para intercalar en un punto intermedio y eliminar las posiciones
				TB_NUM[i] = numUsuario;
			}
			
		}
		System.out.println("\n");
		for (int i = 0; i < TB_NUM.length; i++) {
			System.out.print("\t"+TB_NUM[i]);
		
	}

}
