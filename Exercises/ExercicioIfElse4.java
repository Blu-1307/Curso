package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse4 {

	public static void main(String[] args) {

		String codigoProduto;
		Scanner entradaCodigo = new Scanner(System.in);

		System.out.print("Digite o c�igo do produto: ");
		codigoProduto = entradaCodigo.next();

		if (codigoProduto.equals("001")) {
			System.out.println("C�digo 001");
			System.out.println("Produto - Arroz");
		} else if (codigoProduto.equals("002")) {
			System.out.println("C�digo 002");
			System.out.println("Produto - Feij�o");
		} else if (codigoProduto.equals("003")) {
			System.out.println("C�digo 003");
			System.out.println("Produto - Farinha");
		} else {
			System.out.println("C�digo " + codigoProduto);
			System.out.println("Diversos");
		}

	}
}
