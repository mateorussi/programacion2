/**
 * 
 */
package practica_7_6;

import java.util.Vector;

/**
 * @author bm10DAM1
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Define un array con cinco empleados
		Empleado empleados[] = new Empleado[5];
		
		//Crea los cinco objetos empleado
		Empleado empleado1 = new Empleado("Maria","Contabilidad",35,1500);
		Empleado empleado2 = new Empleado("Juan","Recursos",47,1450);
		Empleado empleado3 = new Empleado("Luis","Tecnologias",35,1800.8989);
		Empleado empleado4 = new Empleado("Susana","Atención",28,1500.568);
		Empleado empleado5 = new Empleado("Lucía","Tecnologías",27,1800.355);
		
		//Asigna los empleados al vector
		empleados[0] = empleado1;
		empleados[1] = empleado2;
		empleados[2] = empleado3;
		empleados[3] = empleado4;
		empleados[4] = empleado5;
		
		double total = 0;
		
		System.out.println("DEPARTAMENTO \t \t EMPLEADO \t SALARIO");
		System.out.println("-----------------------------------------------------");
	
		//Recorre el array de empleados
		
		for (int i = 0; i < empleados.length; i++) {
			Empleado empleado = empleados[i];
			
			//Muestra por pantalla el departamento y el nombre
			System.out.println(empleados[i].departamento + " \t \t "+ empleados[i].nombre + "\t \t");
			//Muestra el salario 
			System.out.printf("%.2f", empleados[i].salario);
			//Imprimimos un entorno de carro
			System.out.println();
			//En total se va acumulando el total del salario de los empleados
			total = total + empleados[i].salario;
			
		}
	
		//Imprime el total de los empleados
		System.out.println("El total pagado: ");
		System.out.printf("%.2f", total);
		
		System.out.println();
		System.out.println();
		
		System.out.println("------------------------------------------------------------------------------------");
		
		Vector<Empleado> vectorEmpleados = new Vector<Empleado>(5);
		
		//Crear siete objetos empleado
		Empleado emple1 = new Empleado ( "Lucia", "Contabilidad", 23, 1400);
		Empleado emple2 = new Empleado ("Sen", "Recursos", 24, 1450);
		Empleado emple3 = new Empleado ("Miguel", "Tecnologias", 58, 1250.8989);
		Empleado emple4 = new Empleado ("Eduardo", "Atención", 34, 1200.568);
		Empleado emple5 = new Empleado ("Ruben", "Tecnologías", 46, 2000.355);
		Empleado emple6 = new Empleado ("Manuel", "Tecnologías", 51, 2000.355);
		Empleado emple7 = new Empleado ("Juan", "Tecnologías", 42, 2000);
		
	
		//Aqui añadimos los elementos con el metodo de la clase vector addElement
		
		vectorEmpleados.addElement(emple1);
		vectorEmpleados.addElement(emple2);
		vectorEmpleados.addElement(emple3);
		vectorEmpleados.addElement(emple4);
		vectorEmpleados.addElement(emple5);
		vectorEmpleados.addElement(emple6);
		vectorEmpleados.addElement(emple7);
		
		//Aqui se añade al empleado numero 4 en la cuarta posicion
		
		vectorEmpleados.insertElementAt(emple4, 3);
		
		//Eliminar el empleado numero 6
		
		//vectorEmpleados.removeElement(emple6);
		
		//Eliminar todos los empleados
		
		//vectorEmpleados.removeAllElements();
		
		//Acceder a una determinada posicion
		
		System.out.println("El empleado 2: "+ vectorEmpleados.elementAt(1) + "\n");
		total = 0;
		
		System.out.println("DEPARTAMENTO\t\t EMPLEADO \t\t SALARIO");
		System.out.println("--------------------------------------------------------");
		
		//Recorre el array, utilizando el metodo size que nos devuelve el tamaño del vector
		
		for (int i = 0; i < vectorEmpleados.size(); i++) {
			//Muestra por pantalla el departamento y el nombre con el metodo elementAt que nos devuelve el objeto que esta en la posicion que le pasamos en i
			System.out.println(vectorEmpleados.elementAt(i) + "\t\t" + vectorEmpleados.elementAt(i).nombre + "\t\t");
			//Muestra por pantalla el salario
			System.out.printf("%.2f", vectorEmpleados.elementAt(i).salario);
			System.out.println();
			//Acumula el total del salrio de los empleados 
			total += vectorEmpleados.elementAt(i).salario;
			
		}
		
		System.out.println("El total pagado: ");
		System.out.printf("%.2f", total);
		System.out.println();
	}

}
