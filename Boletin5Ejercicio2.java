package boletin5;

import java.util.Scanner;

public class Boletin5Ejercicio2 {
	
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		System.out.print("Primer Número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Segundo Número: ");
        int numero2 = scanner.nextInt();
        
        
        comprendido(numero1,numero2);
        scanner.close();
	}
	
	public static void  comprendido(int numero1, int numero2) {
		
		for(int i = numero1; i <= numero2; i++) {
			System.out.println(i);
		}
	}
}
