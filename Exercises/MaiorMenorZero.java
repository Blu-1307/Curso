package Curso.Exercises;

import java.util.Scanner;

public class MaiorMenorZero {

	public static void main(String[] args) {

		int iNumero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		iNumero = sc.nextInt();

		if (iNumero < 0) {
			System.out.println("O n�mero � negativo!");
		} else if (iNumero > 0) {
			System.out.println("O n�mero � positivo!");
		} else {
			System.out.println("O n�mero � igual a zero");
		}

	}
}
