package Curso;

import java.util.Scanner;

public class CalculadoraEntradaDados {
	
	public static void main(String[] args) {
		
		double n1;
		double n2;
		double soma;
		double subtracao;
		double multiplicacao;
		double divisao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor");
		n2 = sc.nextDouble();
		
		soma = n1 + n2;
		subtracao = n1 - n2;
		multiplicacao = n1 * n2;
		divisao = n1 / n2;
		
		System.out.println("O resultado da soma �: " + soma);
		System.out.println("O resultado da subtra��o �: " + subtracao);
		System.out.println("O resultado da multiplica��o �: " + multiplicacao);
		System.out.println("O resultado da divis�o �: " + divisao);
		
	}

}
