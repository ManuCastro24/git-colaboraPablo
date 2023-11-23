package boletin5;

import java.util.Scanner;

public class Boletin5Ejercicio1 {

	//Este ejercicio muestra correctamente el numero de veces que queria que se imprimiera mi mensaje 
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		System.out.print("Número: ");
        int numero = scanner.nextInt();
        
        eco(numero);
		
		scanner.close();
			
	}
	
	public static void eco(int numero) {
				
		for (int i = 0; i < numero; i++) {
			System.out.println("Eco");
		}
         
	}
}
