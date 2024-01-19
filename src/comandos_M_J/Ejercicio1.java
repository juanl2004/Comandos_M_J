package comandos_M_J;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int suma;
		
		int resta;

		int resta;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextInt();
		System.out.print("Introduce el segundo número --> ");
		num2 = sc.nextInt();
		suma = num1 + num2;
		if (suma % 2 == 0) {
			System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma + " --> La solución es ¡PAR!");
		} else {
			System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma + " --> La solución es ¡IMPAR!");
		}
		
		resta = num1 - num2;
		
		if (suma % 2 == 0) {
			System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta + " --> La solución es ¡PAR!");
		} else {
			System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta + " --> La solución es ¡IMPAR!");
		}

		resta = num1 - num2;

		if (suma % 2 == 0) {
			System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta + " --> La solución es ¡PAR!");
		} else {
			System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta + " --> La solución es ¡IMPAR!");
		}
		
		System.out.println("Hola soy Juan Luis y esta es mi corrección");
		
		sc.close();
	}
}
