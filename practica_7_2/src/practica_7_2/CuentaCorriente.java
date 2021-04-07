/**
 * Vas a crear la clase CuentaCorriente.
Los atributos que tiene son:
• nombre, apellidos, dni, dirección de tipo String;
• numcuenta de tipo long;
• saldo de tipo double;
Los métodos que contendrá son:
• Ingresar dinero: método que recibirá como parámetro el
dinero a ingresar (double), actualizará el campo saldo
añadiéndole el importe y devolverá el saldo resultante.
• Sacar dinero : igual que el anterior.
• Mostrar saldo: mostrará por pantalla el saldo de la cuenta
• Modificar datos de la cuenta: mostrará todos los datos de la
cuenta corriente y pedirá las posibles modificaciones. Sólo
se podrán modificar nombre, apellidos, dni y dirección.
Programar una clase con el método main(), que haga lo siguiente:
• Instancie un objeto cuenta corriente con los datos de una cuenta
obtenidos al leer la tarjeta insertada en un cajero automático.
• muestre el menú de las opciones que nos ofrecerá el cajero
automático para operar con la cuenta:
o Sacar dinero
o Ingresar dinero
o Consultar saldo
o Modificar datos personales.
o Terminar
• A partir de la opción introducida se realizarán las operaciones
necesarias y se utilizarán los métodos adecuados
 */
package practica_7_2;

/**
 * @author bm10DAM1
 *
 */
public class CuentaCorriente {

	private String nombre; 
	private String apellidos;
	private String dni;
	private String direccion;
	
	private long numcuenta;
	private double saldo;
	private int dinero;

	public CuentaCorriente(String n, String a, String dni, String d, long nc, double s) {
		this.nombre = n;
		this.apellidos = a;
		this.dni = dni;
		this.direccion = d;
		this.numcuenta = nc;
		this.saldo = s;
	}
	
	public void IngresarDinero(int d) {
		this.saldo += d;
	}
	
	public void SacarDinero(int d) {
		saldo -= d;
	}
	
	public void MostrarSaldo() {
		System.out.println("El saldo de tu cuenta es "+this.saldo);
	}
	
	public void ModificarDatos(String n, String a, String dni, String d) {
		
		System.out.println("");
		this.nombre = n;
		this.apellidos = a;
		this.dni = dni;
		this.direccion = d;
	}
}
