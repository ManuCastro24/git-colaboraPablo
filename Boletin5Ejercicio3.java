package boletin5;

import java.util.Scanner;

public class Boletin5Ejercicio3 {
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		double pi = 3.14;
		
		System.out.print("Radio: ");
        int radio = scanner.nextInt();
        
        System.out.print("Altura: ");
        int altura = scanner.nextInt();
        
        System.out.print("Respuesta (1) Área    |      (2) Volumen: ");
        int respuesta = scanner.nextInt();
        
        switch(respuesta) {
        case 1: area(radio,altura,pi);break;
        case 2:volumen(radio,altura,pi);break;
        }
        scanner.close();
	}
	
	public static void  area(int radio, int altura, double pi) {
		
		double area = (2*pi)*radio*(altura+radio);
		System.out.print("Área: " +area);
		
	}
	
	public static void  volumen(int radio, int altura, double pi) {
		
		double volumen = pi * (radio*radio)*altura;
		System.out.print("Volumen: " +volumen);
	}
	

}