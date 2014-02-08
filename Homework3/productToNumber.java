/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		int resultado = 0;
		int c = 1;
		String mensaje = "";
   		int x = Integer.parseInt(args[0].toString());
		while(c<x)
		{
			mensaje=mensaje+" "+c+"x";
			resultado=c*(c+1);
			c++;
			
		}
		mensaje = mensaje + "=" + resultado;
		System.out.println(mensaje);

   		System.out.println("el producto es: "+resultado);
      
   }

}