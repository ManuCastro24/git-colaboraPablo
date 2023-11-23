package boletin5;

import java.util.Scanner;

public class Boletin5Ejercicio4 {
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Número 3: ");
        int numero3 = scanner.nextInt();
        
        max(numero1,numero2,numero3);
        min(numero1,numero3,numero3);
        
        System.out.println("Número más alto: " + max(numero1,numero2,numero3));
        System.out.println("Número más bajo: "+ min(numero1,numero3,numero3));
		
		scanner.close();
	}

	public static int  max(int n1,int n2,int n3) {
		int max= 0;
		if (n1 > n2 && n1 > n3) {
			max = n1;
		}else if (n2 > n1 && n2 > n3) {
			max = n2;
		}else {
			max = n3;
		}
		return max;
	}
	
	public static int  min(int num1, int num2, int num3) {
		int min = 0;
		if (num1 < num2 && num1 < num3) {
			min = num1;
		}else if (num2 < num1 && num2 < num3) {
			min = num2;
		}else {
			min = num3;
		}
		return min;
	}
}
