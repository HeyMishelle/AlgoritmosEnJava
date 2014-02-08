/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      
      	

   		int x = Integer.parseInt(args[0].toString());
		int residuo = 0;
		residuo = x%2;
		if(residuo = 0)
		{
			System.out.println("numero par");
		}
		else
		{
			System.out.println("numero impar");
			

  		}

   }
}