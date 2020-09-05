package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ExerciciosWhile {

	public static void exerciciosWhile() throws InterruptedException {
		Scanner escolhaExercicio = new Scanner(System.in);
		System.out.println("1 -> N�meros �mpares entre 1 e 100");
		System.out.println("2 -> N�meros pares entre 1 e 100");
		System.out.println("3 -> Pares e �mpares entre 1 e um n�mero definido pelo usu�rio");
		System.out.println("4 -> Calcular m�dia das notas de uma turma");
		System.out.println("5 -> N�meros de 1 a 20 (primeiro um em baixo do outro e depois um do lado do outro)");
		System.out.println("6 -> N�meros de 1000 a 1999 de resto 5 quando dividido por 11");
		System.out.println("7 -> Acertar n�mero");

		int escolha = escolhaExercicio.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exerc�cio...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolha) {
		case 1:
			exercicioWhile1();
			break;
		case 2:
			exercicioWhile2();
			break;
		case 3:
			exercicioWhile3();
			break;
		case 4:
			exercicioWhile4();
			break;
		case 5:
			exercicioWhile5();
			break;
		case 6:
			exercicioWhile6();
			break;
		case 7:
			exercicioWhile7();
			break;
		default:
			System.out.println("Exerc�cio n�o encontrado!");
			break;
		}
	}

	// -----===[|> <!!!> <|]===---- \\
	public static void exercicioWhile1() {
		int numero = 1;

		System.out.println("N�meros �mpares:");
		while (numero <= 100) {
			if (numero % 2 == 1) {
				System.out.println(numero);
			}
			numero++;
		}
	}

	public static void exercicioWhile2() {
		int numero = 1;

		System.out.println("N�meros pares:");
		while (numero <= 100) {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}

	public static void exercicioWhile3() throws InterruptedException{
		Scanner informaMaximo = new Scanner(System.in);
		int numero = 1;
		
		System.out.print("Informe o intervalo m�ximo: ");
		int maximo = informaMaximo.nextInt();
		
		System.out.println("N�meros �mpares:");
		while(numero <= maximo) {
			if(numero % 2 == 1) {
				System.out.println(numero);
			}
			numero++;
		}
		
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.println("N�meros pares:");
		numero = 1;
		while(numero <= maximo) {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}

	public static void exercicioWhile4() {
		Scanner informarInteiros = new Scanner(System.in);
		Double[] notasAlunos;
		Double somaTotal = 0.0;
		Double mediaTurma;
		int repete = 0;
		
		System.out.print("Informe a quantidade de alunos na sala: ");
		notasAlunos = new Double[informarInteiros.nextInt()];
		
		while (repete < notasAlunos.length) {
			System.out.println("Informe a nota do " + (repete + 1) + "� aluno!");
			notasAlunos[repete] = informarInteiros.nextDouble();
			repete++;
		}
		
		repete = 0;
		while(repete < notasAlunos.length) {
			somaTotal += notasAlunos[repete];
		}
		
		mediaTurma = somaTotal / notasAlunos.length;
		System.out.println("M�dia aritm�tica da turma: " + mediaTurma);
	}

	public static void exercicioWhile5() {
		int repete = 1;
		
		while(repete <= 20) {
			System.out.println(repete);
			repete++;
		}
		System.out.println("");
		repete = 1;
		while(repete <= 20) {
			System.out.print(repete + " ");
			repete++;
		}
	}

	public static void exercicioWhile6() {
		int minimo = 1000;
		
		while(minimo < 2000) {
			if(minimo % 11 == 5) {
				System.out.println(minimo);
			}
			minimo++;
		}
	}

	public static void exercicioWhile7() {
		Scanner tentativaAcerto = new Scanner(System.in);
		int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 20);
		int tentativas = 1;
		int numeroTentativaUsuario;
		System.out.println(numeroAleatorio);
		while(tentativas <= 3) {
			System.out.println("Escreva um n�mero (" + tentativas + "� tentaviva)");
			numeroTentativaUsuario = tentativaAcerto.nextInt();
			if(numeroTentativaUsuario == numeroAleatorio) {
				System.out.println("Parab�ns, voc� acertou!");
				tentativas = 5;
			} else {
				System.out.println("Que pena, voc� errou ;(");
				tentativas++;
			}
		}
		
		if(tentativas == 5) {
		} else {
			System.out.println("Suas 3 tentativas acabaram ;(");
			System.out.println("O n�mero era: " + numeroAleatorio);
		}
	}

}