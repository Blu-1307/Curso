package Curso;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		String gen;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu genero (M,F,B...)");
		gen = sc.next();

		switch (gen.toUpperCase()) { // Pega o que est� escrito na var "gen" e coloca para o maiusculo
		case "M": // Caso for "M" vai executar o que est� at� o "break;"
			System.out.println("Bem-Vindo"); // Imprime uma linha escrito "Bem-Vindo"
			break; // Para a execu��o do case

		case "F": // Caso for "F" vai executar o que est� at� o "break;"
			System.out.println("Bem-Vinda"); // Imprime uma linha escrito "Bem-Vinda"
			break; // Para a execu��o do case

		default: // Caso n�o for nenhum dos anteriores vai executar o que est� at� o "break;"
			System.out.println("Bem-Vindx"); // Imprime uma linha escrito "Bem-Vindx"
			break; // Para a execu��o do default
		}
	}

}
