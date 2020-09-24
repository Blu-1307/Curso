package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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

	public static void exercicio5() {
		int numeros = 1;
		String numerosLadoLado = "| ";
		
		System.out.println("N�meros um em baixo do outro");
		while(numeros <= 20) {
			System.out.println("| " + numeros + " |");
			numerosLadoLado += numeros + " | ";
			numeros++;
		}
		
		System.out.println("\nN�meros lado a lado: ");
		System.out.println(numerosLadoLado);
	}

	public static void exercicio6() {
		int numeros = 1000;
		
		System.out.println("Os n�meros de 1000 a 1999 divisiveis por 11 s�o:");
		while(numeros < 2000) {
			if(numeros % 11 == 0) {
				System.out.println("| " + numeros + " |");
			}
			numeros++;
		}
	}

	public static void exercicio7() {
		Scanner scTentativa = new Scanner(System.in);
		boolean repetirJogo = false;
		int numeroAleatorio, numeroTentativaUsuario, chancesUsuario = 1, pontuacao = 0;

		System.out.println("Bem-Vindo ao Jogo de Acertos");
		System.out.println("");
		System.out.println("O jogo consiste no seguinte:");
		System.out.println("- O computador ir� gerar um n�mero de 1 a 20");
		System.out.println("- Voc� ter� 3 chances para acertar o n�mero");
		System.out.println("- Caso voc� acertar ganha 1 ponto");
		System.out.println("");
		System.out.println("                                 Boa sorte!");

		do {
			chancesUsuario = 1;
			numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 21);
			System.out.println(numeroAleatorio);
			System.out.println("N�mero gerado!");
			
			if(chancesUsuario <= 3) {
				do {
					System.out.print("\nDigite sua tentativa: ");
					numeroTentativaUsuario = scTentativa.nextInt();

					if (!(numeroTentativaUsuario <= 20 && numeroTentativaUsuario >= 1)) {
						System.out.println("\nVoc� digitou um n�mero acima/abaixo do permitido! \nTente novamente");
						System.out.println("A tentativa n�o ser� contada!");
					} else if (numeroTentativaUsuario == numeroAleatorio) {
						pontuacao++;
						System.out.println("\nParab�ns, voc� acertou o n�mero!");
						System.out.println("+1 Ponto! Total: " + pontuacao);
						chancesUsuario = 5;
					} else {
						System.out.println("\nVoc� errou ;(");
						System.out.println("Total de tentavias: " + chancesUsuario);
						chancesUsuario++;
					}
				} while (chancesUsuario <= 3);
			}
			if (chancesUsuario == 4) {
				System.out.println("");
				System.out.println("Suas tentativas acabaram! ;(");
				System.out.println("O n�mero era: " + numeroAleatorio);
			}

			System.out.println("");
			System.out.println("Deseja executar o jogo novamente? S/N");
			repetirJogo = scTentativa.next().equalsIgnoreCase("S") ? true : false;
			System.out.println("");
		} while (repetirJogo);

		scTentativa.close();
	}

}
