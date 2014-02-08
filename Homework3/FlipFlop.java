/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   

   public static void main(String[] args) {
   		int numeroActual = 1;
		int residuo;
		int residuo2;
   		int x = Integer.parseInt(args[0].toString());
		while(numeroActual<x)
		{
			residuo = numeroActual%3;
			residuo2 = numeroActual%5;
			if(residuo = 0 && residuo2 = 0)
			{
				System.out.println("FlipFlop ");
			}
			else if(residuo = 0 && residuo2 != 0)
			{
				System.out.println("Flip ");
			}
			else if(residuo != 0 && residuo2=0)
			{
				System.out.println("flop ");
			}
			else
			{
				System.out.println(numeroActual);
			}
			numeroActual ++;
		}
			
   }

}