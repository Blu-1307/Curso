package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse7 {

	public static void main(String[] args) {

		double macas, precoTotal;
		Scanner totalMacas = new Scanner(System.in);

		System.out.print("Digite o n�mero de ma��s compradas: ");
		macas = totalMacas.nextDouble();

		if (macas < 12) {
			precoTotal = macas * 0.30;
			System.out.println("Pre�o a ser pago: R$" + precoTotal);
		} else {
			precoTotal = macas * 0.25;
			System.out.println("Pre�o a ser pago: R$" + precoTotal);
		}

	}
}
