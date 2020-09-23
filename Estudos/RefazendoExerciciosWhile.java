package Curso.Estudos;

import java.util.Scanner;

public class RefazendoExerciciosWhile {

	public static void exercicio1() {
		int numeros = 1;

		System.out.println("N�meros �mpares entre 1 a 100");
		while (numeros <= 100) {
			if (numeros % 2 != 0) {
				System.out.println("[" + numeros + "]");
			}
			numeros++;
		}
	}

	public static void exercicio2() {
		int numeros = 0;

		while (numeros <= 100) {
			if (numeros % 2 == 0) {
				System.out.println("[" + numeros + "]");
			}
			numeros++;
		}
	}
	
	public static void exercicio3() {
		Scanner entradaDados = new Scanner(System.in);
		String numerosPares = "", numerosImpares = "";
		int numeros = 0, ateNumero;

		System.out.print("Digite at� que n�mero voc� deseja ver os pares e �mpares: ");
		ateNumero = entradaDados.nextInt();

		while (numeros <= ateNumero) {
			if (numeros % 2 == 0) {
				numerosPares += "[" + numeros + "] ";
			} else {
				numerosImpares += "[" + numeros + "] ";
			}
			numeros++;
		}

		System.out.println("N�meros pares --------\n" + numerosPares);
		System.out.println("N�meros �mpares --------\n" + numerosImpares);

		entradaDados.close();
	}
	
	public static void exercicio4() {
		Scanner entradaDados = new Scanner(System.in);
		int qntdAlunos, soma = 0, media, repeticao = 1;
		
		System.out.print("Digite a quantidade de alunos na sala: ");
		qntdAlunos = entradaDados.nextInt();
		
		while(repeticao <= qntdAlunos ) {
			System.out.println("Digite a nota do " + repeticao + " aluno");
			soma += entradaDados.nextInt();
			repeticao++;
		}
		
		media = soma / qntdAlunos;
		
		System.out.println("A m�dia da turma �: " + media);
		
		entradaDados.close();
	}
	
}
