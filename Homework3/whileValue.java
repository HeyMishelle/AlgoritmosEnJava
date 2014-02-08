/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
   		int x = Integer.parseInt(args[0].toString());
		if (x>0)
		{
			while(valorActual<=x)
			{
   				System.out.println("el valor actual es: "+valorActual);
				valorActual ++;
			}
		}
		else{
			System.out.println("Error. Debe ser un numero positivo");
		}
      
   }

}