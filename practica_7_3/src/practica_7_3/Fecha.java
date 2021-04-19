/**
 * Crea una clase Fecha.
Los atributos que debes tener son: día, mes y año, numéricos enteros.
Crea dos constructores:
• El constructor por defecto
• Otro en el que asignaremos a cada atributo los valores de día, mes y
año que pasemos al instanciar el objeto.
Programa los siguientes métodos:
• Método para saber si un año es bisiesto.
A partir del año que tenemos en el atributo anno del objeto que
hayamos creado, comprobar si este es bisiesto o no.
Nos devolverá TRUE o FALSE según el caso.
Te recuerdo que un año para ser bisiesto debe ser múltiplo de 4, no
múltiplo de 100 pero si de 400 (tenemos un ejercicio hecho en las
primeras prácticas que lo calcula).
• Método para que dadas dos fechas nos devuelva el tiempo
transcurrido entre ellas.
En este caso trabajaremos con la fecha del objeto que utilicemos y
otra nueva introducida por teclado. Los parámetros que enviaremos al
invocar el método serán el día, mes y año de esta última.
Debéis validar la fecha en el método principal y tener en cuenta que
tenemos meses de 30 días.
El método nos devolverá los días transcurridos entre ellas.
• Método que nos devuelva la fecha como una cadena con el formato
DD/MM/AAAA
En el programa principal (clase con el método main) instanciaremos dos
objetos uno con nuestra fecha de nacimiento (miFechaNacimiento) y otro con
el día, mes, y año que se haya introducido por teclado fechaReferencia).
En este último caso validar los datos introducidos antes de crear el objeto, de
tal manera que trabajemos con fechas válidas.
(*)Simplificar el ejercicio considerando que todos los meses tienen 30 días.
 */
package practica_7_3;

/**
 * @author bm10DAM1
 *
 */
public class Fecha {

	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	
	/*
	 * Metodos
	 */
	
	public void bisiesto(int anyo) {
		if (anyo % 4 && anyo )
	}
}
