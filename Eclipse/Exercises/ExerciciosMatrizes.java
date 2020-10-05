package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ExerciciosMatrizes {

	public static void listaExerciciosMatrizes() throws InterruptedException {
		int escolhaExercicio;
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("");
		System.out.println("1 -> Localizar maior valor");
		System.out.println("2 -> Diagonal com 1");
		System.out.println("3 -> Maiores elementros entre duas matrizes");
		System.out.println("4 -> Contagem de quantos valores maiores que 10 uma matriz possue");
		System.out.println("5 -> Procurar um valor dentro de uma matriz");
		System.out.println("6 -> Gabarito de 100 alunos");
		System.out.println("");
		System.out.println("0 -> Sair...");
		escolhaExercicio = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exerc�cio...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolhaExercicio) {
		case 0:
			System.out.println("Saindo...");
			break;
		case 1:
			exercicioMatriz1();
			break;
		case 2:
			exercicioMatriz2();
			break;
		case 3:
			exercicioMatriz3();
			break;
		case 4:
			exercicioMatriz4();
			break;
		case 5:
			exercicioMatriz5();
			break;
		case 6:
			exercicioMatriz6();
			break;
		default:
			System.out.println("Exerc�cio n�o encontrado...");
			break;
		}
		entradaValores.close();
	}

	public static void exercicioMatriz1() {
//		Leia uma matriz 10 x 10 e escreva a localiza��o (linha e a coluna) do maior valor
		
		int[][] matrizValores = new int[10][10];
		int maior = 0;
		int linha = 0;
		int coluna = 0;

		System.out.println("-------------------------------------");
		System.out.println("Matriz gerada: ");
		System.out.print("| ");
		for (int i = 0; i < matrizValores.length; i++) {
			for (int j = 0; j < matrizValores.length; j++) {
				matrizValores[j][i] = ThreadLocalRandom.current().nextInt(1, 999);
				System.out.print(String.format("%3d | ", matrizValores[j][i]));
			}
			System.out.println("");
			System.out.print("| ");
		}
		System.out.println("-------------------------------------");

		for (int i = 0; i < matrizValores.length; i++) {
			for (int j = 0; j < matrizValores.length; j++) {
				if (matrizValores[j][i] > maior) {
					maior = matrizValores[j][i];
					coluna = j + 1;
					linha = i + 1;
				}
			}
		}

		System.out.println("");
		System.out.println("O maior n�mero na Matriz � o " + maior);
		System.out.println("Coluna: " + coluna);
		System.out.println("Linha: " + linha);
	}

	public static void exercicioMatriz2() {
//		Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal 
//		e com 0 os demais elementos. Escreva ao final a matriz obtida. 
//		(Diagonal principal, os �ndices s�o iguais: array[1][1], array[2][2], array[3][3], etc...)
		
		int[][] matriz = new int[5][5];

		System.out.println("Matriz obtida: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][i] = 1;
				System.out.print(String.format(" %1d |", matriz[i][j]));
			}
			System.out.println();
		}
	}

	public static void exercicioMatriz3() {
//		Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores elementos entre as primeiras
		
		int[][] matrizUm = new int[4][4];
		int[][] matrizDois = new int[4][4];
		int[][] matrizTres = new int[4][4];
		int[] maior = new int[8];

		System.out.println("N�meros da primeira matriz: ");
		for (int i = 0; i < matrizTres.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrizTres.length; j++) {
				matrizUm[i][j] = ThreadLocalRandom.current().nextInt(1, 30);
				System.out.print(String.format(" %2d |", matrizUm[i][j]));
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("N�meros da segunda matriz: ");
		for (int i = 0; i < matrizTres.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrizTres.length; j++) {
				matrizDois[i][j] = ThreadLocalRandom.current().nextInt(1, 30);
				System.out.print(String.format(" %2d |", matrizDois[i][j]));
			}
			System.out.println("");
		}

		System.out.println("");
		for (int k = 0; k < maior.length; k++) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (matrizUm[i][j] > maior[k]) {
						maior[k] = matrizUm[i][j];
					}
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (matrizUm[i][j] == maior[k]) {
						matrizUm[i][j] = 0;
						j = 4;
						i = 4;
					}
				}
			}
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 4; j++) {
				matrizTres[i][j] = maior[j];
				maior[j] = 0;
			}
			for (int j = 0; j < 4; j++) {
				matrizTres[i + 1][j] = maior[j + 4];
				maior[j] = 0;
			}
		}

		for (int k = 0; k < maior.length; k++) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (matrizDois[i][j] > maior[k]) {
						maior[k] = matrizDois[i][j];
					}
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (matrizDois[i][j] == maior[k]) {
						matrizDois[i][j] = 0;
						i = 4;
						j = 4;

					}
				}
			}
		}

		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matrizTres[i][j] = maior[j];
				maior[j] = 0;
			}
			for (int j = 0; j < 4; j++) {
				matrizTres[i + 1][j] = maior[j + 4];
				maior[j] = 0;
			}
		}
		
		System.out.println("Terceira matriz obtida com os maiores valores:");
		for (int i = 0; i < 4; i++) {
			System.out.print("|");
			for (int j = 0; j < matrizTres.length; j++) {
				System.out.print(String.format(" %2d |", matrizTres[i][j]));
			}
			System.out.println("");
		}
	}
	
	public static void exercicioMatriz4() {
//		Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui
		
		int[][] matriz = new int[6][6];
		int contagem = 0;

		System.out.println("Matriz obtida: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 20);
				System.out.print(String.format(" %2d |", matriz[i][j]));
			}
			System.out.println("");
		}

		System.out.println("\nN�meros maiores que 10:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > 10) {
					System.out.print(String.format(" %2d |", matriz[i][j]));
					contagem++;
				} else {
					System.out.print(String.format(" %2s |", ""));
				}
			}
			System.out.println("");
		}

		System.out.println("No total s�o " + contagem + " n�meros maiores que 10!");
	}

	public static void exercicioMatriz5() {
//		Leia uma matriz 20 x 20. Leia tamb�m um valor X. O programa dever� 
//		fazer uma busca desse valor na matriz e, ao final escrever a localiza��o 
//		(linha e coluna) ou uma mensagem de �n�o encontrado�
		
		Scanner entradaDados = new Scanner(System.in);
		boolean numeroEncontrado = false;
		int valorAchar;
		int[][] matriz = new int[20][20];

		System.out.println("Matriz obtida: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 200);
				System.out.print(String.format(" %3d |", matriz[i][j]));
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("Informe o valor que voc� deseja achar: ");
		valorAchar = entradaDados.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == valorAchar) {
					System.out.println("----------");
					System.out.println("Linha: " + (i + 1));
					System.out.println("Coluna: " + (j + 1));
					numeroEncontrado = true;
				}
			}
		}
		System.out.println("----------");
		if (!numeroEncontrado) {
			System.out.println("N�mero n�o encontrado!");
			System.out.println("----------");
		}
		entradaDados.close();
	}

	public static void exercicioMatriz6() throws InterruptedException {
//		Leia uma matriz 100 x 10 que se refere respostas de 10 quest�es de m�ltipla escolha, 
//		referentes a 100 alunos. Leia tamb�m um vetor de 10 posi��es contendo o gabarito de 
//		respostas que podem ser a, b, c ou d. Seu programa dever� comparar as respostas de 
//		cada candidato com o gabarito e emitir um vetor Resultado, contendo a pontua��o correspondente
		
		Scanner entradaDados = new Scanner(System.in);
		int[] acertosDosAlunos = new int[100];
		String[][] matriz = new String[acertosDosAlunos.length][10];
		int acertos = 0;
		String[] gabaritoRespostas = new String[10];

		System.out.println("Digite o gabarito de respostas: (a, b, c ou d)");
		for (int i = 0; i < gabaritoRespostas.length; i++) {
			System.out.print("Quest�o " + (i + 1) + ": ");
			gabaritoRespostas[i] = entradaDados.next();
		}

		for (int i = 0; i < acertosDosAlunos.length; i++) {
			System.out.println("--------------------------------------");
			System.out.println("Referente ao " + (i + 1) + "� aluno: ");
			for (int j = 0; j < 10; j++) {
				System.out.print("Digite a " + (j + 1) + "� resposta: ");
				matriz[i][j] = entradaDados.next();
			}
		}

		System.out.println("\n");
		for (int i = 0; i < acertosDosAlunos.length; i++) {
			acertos = 0;
			for (int j = 0; j < gabaritoRespostas.length; j++) {
				if (matriz[i][j].equalsIgnoreCase(gabaritoRespostas[j])) {
					acertos++;
				}
			}
			acertosDosAlunos[i] = acertos;
		}

		System.out.println("Calculando resultados...");
		TimeUnit.SECONDS.sleep(3);

		System.out.println("");
		System.out.println("Resultados:");
		for (int i = 0; i < acertosDosAlunos.length; i++) {
			System.out.println("O aluno n�" + (i + 1) + ", acertou " + acertosDosAlunos[i] + " quest�es!");
		}
		entradaDados.close();
	}

}
