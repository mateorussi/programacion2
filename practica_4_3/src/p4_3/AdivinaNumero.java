/**
 * 
 */
package p4_3;

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class AdivinaNumero {

	/**
	 * @param args
	 */
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		int x,opcion=0;
	      int v[]=new int[4];
	      
	      //Creacion del menu
	      
	      while(opcion!=3){
	       System.out.println("\nElija una opcion por favor:");
	       System.out.println("\n1.Instrucciones");
	       System.out.println("\n2.Jugar");
	       System.out.println("\n3.Salir\n");
	       opcion=teclado.nextInt();
	       switch (opcion){
	           //Instrucciones del juego
	       	   case 1:
	              System.out.println ("\nEl juego consiste en adivinar el numero generado por el ordenador\n (un numero entre 1000 y 9999 y cuyas cifras son todas diferentes)\n se dispone de 10 intentos, y en cada uno de ellos, el ordenador informara de los numeros acertados \nel numero coincide tambien en la posicion, o 1 herido si el numero existe pero no en esa posicion.");
	              break;
	           //Juego
	           case 2:
	               //Generacion del numero se almacena en la variable el x el numero a adivinar
	        	   x=generarNumero(v);
	               //LLamada al metodo comparar 
	        	   comparar(v);
	               break;
	           case 3:
	               System.out.println("adios");
	       }        
	     }
	   }
	    
	    //Metodo generarNumero que recibe como parametro el array v
	   public static int generarNumero(int v[]){
	     int x=0,aux,cont,n,sw=1,i,e;
	     
	     //La variable servira como variable de comprobacion si en el numero que se ha generado hay alguna cifra repetida
	     while (sw==1){
	       
	       //se pone la variable de comprobacion a cero 
	       sw=0;
	       //generamos el numero
	       x=(int)(Math.random()*8999+1000);
	       //se muestra por pantalla el numero generado
	       System.out.println("\n numero generado="+x);

	       //en aux se almacena el numero generado
	       aux=x;
	       //bucle para recorrer v donde almacenaremos el numero por cifras
	       for (i=0;i<4;i++){
	        v[i]=aux % 10;
	        aux=aux/10;
	       }
	       
	       //bucle para comprobar cuantas veces esta repetida una cifra
	      for (i=0;i<4;i++)
	      {
	       //se asigna a n el valor v[i]
	       n=v[i];
	       //inicializamos el contador que almacenara el numero de veces que una cifra esta repetida a cero
	       cont=0;
	       
	       //bucle que recorre v comprobando cuantas veces aparece la cifra almacenada en n
	       for (e=0;e<4 && sw==0;e++)
	       {
	    	//si coincide la cifra almacenada en n con una posicion del vector v incrementa en uno el contador  
	        if (n==v[e]){
	          cont=cont+1;
	        }
	       }//fin for
	       //si el contador es mayor que uno, pone la variable de comprobacion a 1 es decir se debe repetir la generacion
	       //del numero ya que tiene cifras repetidas.
	       if (cont>1){
	          sw=1;
	         // i=5;
	       }//fin if
	    }//fin for
	  }//fin while
	    return(x);
	}
	   
	public static void comparar(int v[]){
	   int v2[]=new int[4];
	   int v3[]=new int[4];
	   int aux,heridos,muertos,i,e,num,cont;
	   for (cont=0;cont<10;cont++){
	    System.out.println("\nIntroduzca un numero a comparar (Ninguna de sus cifras debe repetirse): ");
	    num=teclado.nextInt();
	    aux=num;
	    muertos=0;
	    heridos=0;
	   for (i=0;i<4;i++){
	     v2[i]=aux % 10;
	     aux=aux/10;
	     v3[i]=aux;
	  }
	  if (aux % 10 >=1){
	    System.out.println("No se pueden introducir valores de mas de 4 cifras!");
	    break;
	  }
	  if (v3[0]==0||v3[1]==0||v3[2]==0){
	    System.out.println("No se pueden introducir numeros de menos de 4 cifras!");
	    break;
	  }
	for (i=0;i<4;i++)
	 {
	 for (e=0;e<4;e++)
	 {
	  if (v[i]==v2[e])
	   {
	   if (i==e)
	    {
	    muertos=muertos+1;
	    }
	   else
	    {
	    heridos=heridos+1;
	    }
	   }
	 }
	 }
	 if (muertos==4)
	  {
	  System.out.println("\nEnhorabuena,ha acertado!");
	  cont=cont+10;
	  }
	 System.out.println("\nMuertos ="+muertos+" Heridos ="+heridos);
	}
	}

}
