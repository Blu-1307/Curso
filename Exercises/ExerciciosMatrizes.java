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
		System.out.println("3 -> Maiores elementros entre duas matrizes (n�o feito)");
		System.out.println("4 -> Contagem de quantos valores maiores que 10 uma matriz possue");
		System.out.println("5 -> Procurar um valor dentro de uma matriz");
		System.out.println("6 -> Gabarito de 100 alunos");
		escolhaExercicio = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exerc�cio...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolhaExercicio) {
		case 1:
			exercicioMatriz1();
			break;
		case 2:
			exercicioMatriz2();
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
		int[][] matrizValores = new int[10][10];
		int maior = 0;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < matrizValores.length; i++) {
			for (int j = 0; j < matrizValores.length; j++) {
				matrizValores[j][i] = ThreadLocalRandom.current().nextInt(1, 999);
			}
		}

		System.out.println("-------------------------------------");
		System.out.println("Matriz gerada: ");
		System.out.print("| ");
		for (int i = 0; i < matrizValores.length; i++) {
			for (int j = 0; j < matrizValores.length; j++) {
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
		int[][] matriz = new int[5][5];

		for (int i = 0; i < matriz.length; i++) {
			matriz[i][i] = 1;
		}

		System.out.println("Matriz obtida: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(String.format(" %1d |", matriz[i][j]));
			}
			System.out.println();
		}
	}

	public static void exercicioMatriz3() {
		int[][] matrizUm = new int[4][4];
		int[][] matrizDois = new int[4][4];
		int[][] matrizTres = new int[4][4];
		int[] maior = new int[8];

		for (int i = 0; i < matrizUm.length; i++) {
			for (int j = 0; j < matrizUm.length; j++) {
				matrizUm[i][j] = ThreadLocalRandom.current().nextInt(1, 30);
				matrizDois[i][j] = ThreadLocalRandom.current().nextInt(1, 30);
			}
		}

		System.out.println("N�meros da primeira matriz: ");
		for (int i = 0; i < matrizTres.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrizTres.length; j++) {
				System.out.print(String.format(" %2d |", matrizUm[i][j]));
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("N�meros da segunda matriz: ");
		for (int i = 0; i < matrizTres.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrizTres.length; j++) {
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
		int[][] matriz = new int[6][6];
		int contagem = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 20);
			}
		}

		System.out.println("Matriz obtida: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(String.format(" %2d |", matriz[i][j]));
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("N�meros maiores que 10:");
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
		Scanner entradaDados = new Scanner(System.in);
		boolean numeroEncontrado = false;
		int valorAchar;
		int[][] matriz = new int[20][20];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 200);
			}
		}

		System.out.println("Matriz obtida: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz.length; j++) {
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
		}
		entradaDados.close();
	}

	public static void exercicioMatriz6() throws InterruptedException {
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

		System.out.println("");
		System.out.println("");
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
