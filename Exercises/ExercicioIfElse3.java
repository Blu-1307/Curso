package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse3 {

	public static void main(String[] args) {
		
		int num, parImpar;
		Scanner entradaValor = new Scanner(System.in);
		
		System.out.print("Digite o n�mero: ");
		num = entradaValor.nextInt();
		
		parImpar = num - num / 2 * 2;

		if(parImpar == 0) {
			System.out.println("N�mero " + num + " � par");
		} else {
			System.out.println("N�mero " + num + " � �mpar");
		}
	}
}
