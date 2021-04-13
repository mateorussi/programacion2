/*
 * Vas a realizar un programa que realice cálculos estadísticos sobre una colección
de datos.
Se recomienda que realices la práctica incluyendo poco a poco en el programa
los procesos de los distintos apartados, para finalmente obtener un resultado que
incluya todo.
Queremos cargar un array de 40 valores numéricos, cuyos valores estén
comprendidos entre 0 y 200 y visualizarlo.
Ambas tareas deben ser realizadas por métodos.
Vamos a tener un método llamado CARGAR que se encarga de almacenar en
el array los datos generados aleatoriamente y otro método llamado VISUALIZAR
que es el encargado de mostrarlos en pantalla.
Para todo ello, crearemos dos ficheros .java:
• Practica 7_4 (contiene el método main) : Se encarga de controla el
funcionamiento del programa y de invocar a los métodos de la clase
Vector.
• OperacionesVector: clase con el mismo nombre que alberga los
métodos que resuelven los procesos y operaciones descritas más
adelante.
En el programa principal (Practica 7_4):
- Declarar un array unidimensional de enteros de tamaño 40
- Instanciar un objeto de la clase OperacionesVector:.
- Invocar el método cargar, que programaremos en el clase
OperacionesVector y al que pasaremos como parámetro el array
declarado anteriormente.
- Invocar el método visualizar, que programaremos en el clase
OperacionesVector y al que pasaremos como parámetro el array
cargado en el paso anterior.
En la clase OperacionesVector::
- No tendremos atributos, ni constructores.
- Contendrá los siguientes métodos:
o Cargar : método que recibe como parámetro un vector de
enteros y que lo rellena con números aleatorios con valores
comprendidos entre 0 y 100. No devuelve ningún valor.
o Visualizar: método que recibe como parámetro un vector
de enteros y muestra su contenido en pantalla. No
devuelve ningún valor.
o Máximo: método que recibe como parámetro un vector de
enteros y devuelve al programa principal el valor máximo
contenido en el vector.
o Mínimo: método que recibe como parámetro un vector de
enteros y devuelve al programa principal el valor mínimo
contenido en el vector.
- Añadimos nuevos métodos para obtener la media, la mediana y la
suma total de los valores, que serán devueltos como resultado del
método. Debemos ver sus resultados en el main.
- Para el cálculo de la mediana:
o Ordenar el array (mediante el método sort de la clase Arrays
que pertenece a la librería java.util).
o Tener en cuenta que, si el número de elementos del array es
par :
▪ Mediana = suma de los dos valores centrales/2;
o Si el número de elementos es impar
▪ Mediana = valor central
- Ejecutar los diferentes métodos desde el método main para probar su
funcionamiento.
- Por último, modificar el programa para que funcione para un número
de valores que el usuario introducirá por teclado.
 */
package practica_7_4;

public class OperacionesVector {

}
