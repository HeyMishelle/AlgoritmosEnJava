/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {

		int contador = 0;
		int x = Integer.parseInt(args[0].toString());
		int y = Integer.parseInt(args[1].toString());
		
		if(x<y)
		{
			for(x=contador;contador<=x;contador++)
			{	
				System.out.println(contador);
			}
		}
		else if(y<x)
		{
			for(y=contador;contador<=y;contador++)
			{	
				System.out.println(contador);
			}
		}

      
         System.out.println("numero actual es:" +contador);
      
   }

}