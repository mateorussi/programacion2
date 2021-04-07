/**
 * Vas a realizar los siguientes ejercicios utilizando clases:
1. Vas a crear la clase RECTANGULO.
Los atributos que tiene son: base y altura, ambos de tipo entero.
Los métodos que contendrá son:
❖ Pintar, sirve para dibujar el rectángulo en la pantalla, utilizando el carácter *.
❖ PintarSigno, igual que el anterior pero pasándole como argumento el signo que
queremos que se utilice para pintar el rectángulo. El carácter habremos pedido
que se introduzca por teclado, antes de invocar al método.
❖ Invertir, invertimos la base por altura y viceversa y lo dibujamos en pantalla
utilizando *.
❖ CentrarHorizontal, lo centramos respecto al ancho de la pantalla (80 puntos).
❖ CentrarPantalla, lo centramos en la pantalla (80 columnas y 24 filas).
Programar una clase controladora que:
• Instancie un objeto Rectángulo.
• Pida sus dimensiones por teclado y le asigne los valores a los atributos
del objeto.
• Muestre un menú de opciones con las diferentes operaciones y pida la
opción a realizar. Incluir la opción Terminar.
2. Dentro de la misma clase Rectangulo, vamos a crear métodos para calcular el área y el
perímetro del mismo y otra opción en la clase principal para ejecutar estos 2 métodos.
 */
package practica_7_1;

/**
 * @author bm10DAM1
 *
 */
public class Rectangulo {

	/**
	 * @param args
	 */
	private int base;
	private int altura;
	private char signo;
	
	
	public Rectangulo(int b, int h) {
		this.base = b;
		this.altura = h;
		this.signo = '\u00d7';
	}
	
	public void Pintar(boolean EstaPintado, char sgn){
		if (sgn == '*') {
			EstaPintado = true;
		}
	}
	
	public void PintarSigno() {
		
	}
	
	public void Invertir() {
		
	}
	
	public void CentrarHorizontal() {
		
	}
	
	public void CentrarPantalla() {
		int inicio, a;
		
		inicio = (24 - altura)/2;
		System.out.println("************************************************************");
	}
	
	
}
