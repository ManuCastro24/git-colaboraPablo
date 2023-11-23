package boletin5;

import java.util.Scanner;

public class Boletin5Ejercicio5 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Letra: ");
        String letra = scanner.nextLine();
        
        System.out.print("Resultado: " + letra(letra));
		
        letra(letra);
        
		scanner.close();
	}
	
	public static boolean  letra(String letra) {
		
		boolean resultado = false;
		char caracter = letra.charAt(0);
		
		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            resultado = true;
           
        }
		 return resultado;
	}

}