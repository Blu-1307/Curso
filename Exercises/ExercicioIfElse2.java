package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse2 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4;
		Scanner entradaValores = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		num1 = entradaValores.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = entradaValores.nextInt();
		System.out.print("Digite o terceiro valor: ");
		num3 = entradaValores.nextInt();
		System.out.print("Digite o quarto valor: ");
		num4 = entradaValores.nextInt();
		
		if(num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("O maior n�mero �: " + num1);
		} else if(num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.println("O maior n�mero �: " + num2);
		} else if(num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.println("O maior n�mero �: " + num3);
		} else {
			System.out.println("O maior n�mero �: " + num4);
		}
	}
}
