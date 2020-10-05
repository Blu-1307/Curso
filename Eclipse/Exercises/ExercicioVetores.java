package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ExercicioVetores {

	public static void exerciciosVetores() throws InterruptedException {
		int escolhaExercicio;
		Scanner entradaValores = new Scanner(System.in);

		escolhaExercicio = -1;
		System.out.println("");
		System.out.println("1 -> Ler 12 vetores, X e Y e somar.");
		System.out.println("2 -> Dez primeiros n�meros �mpares");
		System.out.println("3 -> Trocar 8 primeiros valores pelos 8 �ltimos e vice versa");
		System.out.println("4 -> Busca de valor em um vetor de 20 posi��es");
		System.out.println("5 -> Contar quantos valores espa�os tem no vetor");
		System.out.println("6 -> Atribui��o de valor 0 para valores negativos");
		System.out.println("7 -> Posi��es pares valor de um vetor e �mpares de outro vetor");
		System.out.println("8 -> Passar todos os valores 1 posi��o a frente");
		System.out.println("9 -> Retirar espa�os em branco de uma frase");
		System.out.println("10 -> Escrever n�mero por extenso");
		System.out.println("11 -> Verificar anagrama (n�o feito)");
		System.out.println("12 -> Vetor com ter�os de outros vetores");
		System.out.println("13 -> Verificar se existem valores iguais no vetor");
		System.out.println("14 -> Deixar zeros nas posi��es finais do vetor");
		System.out.println("15 -> Ler trajet�ria de um vetor");
		System.out.println("");
		System.out.println("0 -> Sair");

		escolhaExercicio = entradaValores.nextInt();

		if (escolhaExercicio != 0) {
			System.out.println("");
			System.out.println("Iniciando Exerc�cio...\n");
			TimeUnit.SECONDS.sleep(1);
		}

		switch (escolhaExercicio) {
		case 0:
			System.out.println("Saindo...");
			break;
		case 1:
			exercicioVetor1();
			break;
		case 2:
			exercicioVetor2();
			break;
		case 3:
			exercicioVetor3();
			break;
		case 4:
			exercicioVetor4();
			break;
		case 5:
			exercicioVetor5();
			break;
		case 6:
			exercicioVetor6();
			break;
		case 7:
			exercicioVetor7();
			break;
		case 8:
			exercicioVetor8();
			break;
		case 9:
			exercicioVetor9();
			break;
		case 10:
			exercicioVetor10();
			break;
		case 12:
			exercicioVetor12();
			break;
		case 13:
			exercicioVetor13();
			break;
		case 14:
			exercicioVetor14();
			break;
		case 15:
			exercicioVetor15();
			break;
		default:
			System.out.println("Exerc�cio n�o encontrado...");
			break;
		}
		entradaValores.close();
	}

	public static void exercicioVetor1() {
//		  Leia um vetor de 12 posi��es e em seguida ler tamb�m dois valores X e Y
//		  quaisquer correspondentes a duas posi��es no vetor. Ao final seu programa
//		  dever� escrever a soma dos valores encontrados nas respectivas posi��es X e Y.

		Scanner entradaValores = new Scanner(System.in);
		int[] valores = new int[12];
		int[] posicaoXY = new int[2];
		int soma;

		for (int i = 0; i < valores.length; i++) {
			valores[i] = ThreadLocalRandom.current().nextInt(1, 100);
		}

		System.out.println("As posi��es dispon�veis s�o de 1 a 12");
		System.out.println("");
		System.out.println("Escolha a primeira posi��o: ");
		posicaoXY[0] = entradaValores.nextInt() - 1;
		System.out.println("Escolha a segunda posi��o: ");
		posicaoXY[1] = entradaValores.nextInt() - 1;

		System.out.println("");
		System.out.println("N�mero na posi��o " + (posicaoXY[0] + 1) + " = " + valores[posicaoXY[0]]);
		System.out.println("N�mero na posi��o " + (posicaoXY[1] + 1) + " = " + valores[posicaoXY[1]]);

		soma = valores[posicaoXY[0]] + valores[posicaoXY[1]];

		System.out.println("");
		System.out.println("Soma dos valores: " + soma);

		entradaValores.close();
	}

	public static void exercicioVetor2() {
//		Declare um vetor de 10 posi��es e o preencha com os 10 primeiros n�meros impares e o escreva

		int[] numeros = new int[10];
		int indice = 0;

		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				numeros[indice] = i;
				indice++;
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	public static void exercicioVetor3() {
//		Leia um vetor de 16 posi��es e troque os 8 primeiros valores pelos 8 �ltimos e vice-e-versa. 
//		Escreva ao final o vetor obtido

		int[] numerosCriados = new int[16];
		int[] numerosTrocados = new int[16];

		System.out.println("N�meros criados: ");
		for (int i = 0; i < numerosCriados.length; i++) {
			numerosCriados[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println(numerosCriados[i]);
		}

		for (int i = 0; i < (numerosTrocados.length / 2); i++) {
			numerosTrocados[i] = numerosCriados[i + (numerosCriados.length / 2)];
		}

		for (int i = (numerosTrocados.length / 2); i < numerosTrocados.length; i++) {
			numerosTrocados[i] = numerosCriados[i - (numerosCriados.length / 2)];
		}

		System.out.println("\nN�meros com a posi��o alterada: ");
		for (int i = 0; i < numerosTrocados.length; i++) {
			System.out.println(numerosTrocados[i]);
		}
	}

	public static void exercicioVetor4() {
//		Leia um vetor de 20 posi��es e em seguida um valor X qualquer. 
//		Seu programa devera fazer uma busca do valor de X no vetor lido e 
//		informar a posi��o em que foi encontrado ou se n�o foi encontrado

		Scanner entradaDados = new Scanner(System.in);
		boolean numeroEncontrado = false;
		int[] numeros = new int[20];
		int numeroExcolhido;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(1, 25);
		}

		System.out.println("N�meros criados: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}

		System.out.print("Digite um n�mero para saber a posi��o: ");
		numeroExcolhido = entradaDados.nextInt();

		System.out.println("");
		for (int i = 0; i < numeros.length; i++) {
			if (numeroExcolhido == numeros[i]) {
				System.out.println("Posi��o do n�mero: [" + (i + 1) + "]");
				numeroEncontrado = true;
			}
		}
		if (!numeroEncontrado) {
			System.out.println("O n�mero " + numeroExcolhido + " n�o foi encontrado!");
		}
		entradaDados.close();
	}

	public static void exercicioVetor5() throws InterruptedException {
//		Leia um vetor de 40 posi��es. Contar e escrever quantos valores pares ele possui

		int[] numeros = new int[40];
		int quantidadePares = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(1, 80);
		}

		System.out.println("N�meros gerados: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		TimeUnit.SECONDS.sleep(2);
		System.out.println("\nN�meros pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
				quantidadePares++;
			}
		}
		System.out.println("No total foram gerados " + quantidadePares + " n�meros pares.");
	}

	public static void exercicioVetor6() {
//		Leia um vetor de 40 posi��es e atribua valor 0 para todos os elementos que possu�rem valores negativos
		
		int[] numeros = new int[40];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(-10, 50);
		}

		System.out.println("N�meros antes da atribui��o: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				numeros[i] = 0;
			}
		}

		System.out.println("");
		System.out.println("N�meros ap�s atribui��o: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	public static void exercicioVetor7() {
//		Leia dos vetores de 20 posi��es e calcule um outro vetor contendo, nas posi��es 
//		pares os valores do primeiro e nas posi��es impares os valores do segundo.
		
		int[] vetorUm = new int[20];
		int[] vetorDois = new int[20];
		int[] vetorValoresUmEDois = new int[40];
		int indicePares = 0;
		int indiceImpares = 0;

		for (int i = 0; i < vetorDois.length; i++) {
			vetorUm[i] = ThreadLocalRandom.current().nextInt(1, 40);
			vetorDois[i] = ThreadLocalRandom.current().nextInt(1, 40);
		}

		System.out.println("N�meros do Vetor 1: ");
		for (int i = 0; i < vetorUm.length; i++) {
			System.out.println(vetorUm[i]);
		}

		System.out.println("");
		System.out.println("N�meros do Vetor 2: ");
		for (int i = 0; i < vetorDois.length; i++) {
			System.out.println(vetorDois[i]);
		}

		for (int i = 0; i < vetorValoresUmEDois.length; i++) {
			if ((i + 1) % 2 == 0) {
				vetorValoresUmEDois[i] = vetorUm[indicePares];
				indicePares++;
			} else {
				vetorValoresUmEDois[i] = vetorDois[indiceImpares];
				indiceImpares++;
			}
		}

		System.out.println("");
		System.out.println("N�meros dos Vetores unidos: ");
		for (int i = 0; i < vetorValoresUmEDois.length; i++) {
			System.out.println(vetorValoresUmEDois[i]);
		}
	}

	public static void exercicioVetor8() {
//		 Leia um vetor de 40 posi��es e acumule os valores do primeiro elemento no
//		 segundo, deste no terceiro e assim por diante. Ao final, escreva o vetor
//		 obtido.

		int[] numeros = new int[40];

		System.out.println("N�meros gerados: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(1, 80);
			System.out.println((i + 1) + " -> " + numeros[i]);
		}

		for (int i = 1; i < (numeros.length); i++) {
			numeros[i] += numeros[i - 1];
		}

		System.out.println("\nN�meros acumulados: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println((i + 1) + " -> " + numeros[i]);
		}
	}

	public static void exercicioVetor9() {
//		Leia um vetor contendo letras de uma frase inclusive os espa�os em branco. 
//		Retirar os espa�os em branco do vetor e depois escreve-los.

		String[] fraseComEspacos = { "C", "o", "o", "k", "i", "e", " ", "�", " ", "b", "o", "m" };
		String[] fraseSemEspacos = new String[fraseComEspacos.length];

		System.out.println("Frase com espa�os:");
		for (int i = 0; i < fraseComEspacos.length; i++) {
			System.out.print(fraseComEspacos[i]);
		}

		System.out.println("\nFrase sem espa�os: ");
		for (int i = 0; i < fraseComEspacos.length; i++) {
			fraseSemEspacos[i] = fraseComEspacos[i].replaceAll(" ", "");
			System.out.print(fraseSemEspacos[i]);
		}
	}

	public static void exercicioVetor10() {
//		Leia um vetor de 5 posi��es contendo os caracteres de um numero. Em seguida escreva esse numero por extenso

		String[] caracteresNumero = { "C", "i", "n", "c", "o" };
		String numeroPorExtenso = "";

		System.out.println("Caracteres no vetor: ");
		for (int i = 0; i < caracteresNumero.length; i++) {
			numeroPorExtenso += caracteresNumero[i];
			System.out.println("caracteresNumero[" + i + "] -> " + caracteresNumero[i]);
		}

		System.out.println("");
		System.out.println("N�mero escrito: ");
		System.out.println(numeroPorExtenso);
	}

	public static void exercicioVetor11() {
//		Leia dois vetores. Verifique e escreva se um � anagrama de outro
		
		Scanner entradaPalavras = new Scanner(System.in);
		boolean continua = true;
		char[] palavraUm = new char[1];
		char[] palavraDois = new char[palavraUm.length];
		int palavraIgual = 0;
		int letrasIguais = 0;

		System.out.println("Digite a primeira palavra:");
		palavraUm = (entradaPalavras.next()).toCharArray();

		System.out.println("Digite a segunda palavra: (" + palavraUm.length + " letras)");
		palavraDois = (entradaPalavras.next()).toCharArray();

		for (int i = 0; i < palavraDois.length; i++) {
			if (palavraUm[i] == palavraDois[i]) {
				palavraIgual++;
			} else {
				break;
			}
		}

		if (palavraIgual == palavraUm.length) {
			continua = false;
		}

		if (continua) {
			for (int i = 0; i < palavraDois.length; i++) {
				for (int j = 0; j < palavraDois.length; j++) {
					if (palavraUm[i] == palavraDois[j]) {
						palavraDois[j] = ' ';
						letrasIguais++;
						break;
					}
				}

				if (letrasIguais == 0) {
					break;
				}
			}
		}

		System.out.println("Quantidade de letras iguais: " + letrasIguais);
		if (letrasIguais == palavraUm.length) {
			System.out.println("As palavras s�o anagramas");
		} else {
			System.out.println("As palavras n�o s�o anagramas");
		}
		entradaPalavras.close();
	}

	public static void exercicioVetor12() {
//		Leia 3 vetores de 9 posi��es e crie outro com o 1� ter�o do primeiro, 
//		o segundo 3�. do segundo e o ultimo ter�o do 3�. Escrever o vetor resultante ao final
		
		int[] vetorUm = new int[9];
		int[] vetorDois = new int[9];
		int[] vetorTres = new int[9];
		int[] unirVetores = new int[9];
		int valorTerco = vetorUm.length / 3;

		System.out.print("Valores no primeiro vetor: \n| ");
		for (int i = 0; i < vetorUm.length; i++) {
			vetorUm[i] = ThreadLocalRandom.current().nextInt(1, 40);
			System.out.print(vetorUm[i] + " | ");
		}
		System.out.print("\n\nValores no segundo vetor: \n| ");
		for (int i = 0; i < vetorDois.length; i++) {
			vetorDois[i] = ThreadLocalRandom.current().nextInt(1, 40);
			System.out.print(vetorDois[i] + " | ");
		}
		System.out.print("\n\nValores no terceiro vetor: \n| ");
		for (int i = 0; i < vetorTres.length; i++) {
			vetorTres[i] = ThreadLocalRandom.current().nextInt(1, 40);
			System.out.print(vetorTres[i] + " | ");
		}

		for (int i = 0; i < unirVetores.length; i++) {
			if (i < valorTerco) {
				unirVetores[i] = vetorUm[i];
			} else if (i < (valorTerco + valorTerco)) {
				unirVetores[i] = vetorDois[i];
			} else {
				unirVetores[i] = vetorTres[i];
			}
		}

		System.out.print("\n\nValores Unidos em Ter�os: \n| ");
		for (int i = 0; i < unirVetores.length; i++) {
			System.out.print(unirVetores[i] + " | ");
		}
	}

	public static void exercicioVetor13() {
//		Leia um vetor de 10 posi��es e verifique se existem valores iguais e os escreva.
		
		int[] valores = new int[10];

		for (int i = 0; i < valores.length; i++) {
			valores[i] = ThreadLocalRandom.current().nextInt(1, 20);
		}

		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}

		System.out.println("Valores Repitidos: ");
		for (int i = 0; i < valores.length; i++) {
			for (int j = i; j < valores.length; j++) {
				if (i != j) {
					if (valores[i] == valores[j]) {
						System.out.println("Posi��o " + (i + 1) + " -> " + valores[i] + " | " + "Posi��o " + (j + 1)
								+ " -> " + valores[j]);
					}
				}
			}
		}
	}

	public static void exercicioVetor14() {
//		Leia um vetor de 50 posi��es e o compacte, ou seja, elimine as 
//		posi��es com valor zero avan�ando uma posi��o, com os com os valores 
//		subseq�entes do vetor. Dessa forma todos �zeros� devem ficar para as posi��es finais do vetor
		
		int[] numeros = new int[50];
		int auxiliar;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(-1, 10);
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
		}

		for (int j = 0; j < numeros.length; j++) {
			for (int i = 0; i < numeros.length - 1; i++) {
				if (numeros[i] == 0) {
					auxiliar = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = auxiliar;
				}
			}
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
		}
	}

	public static void exercicioVetor15() {
//		Considere um vetor de trajet�rias de 9 elementos, onde cada 
//		elemento possui o valor do pr�ximo elemento do vetor a ser lido. 
//        �ndice      1   2   3   4   5   6   7   8   9  
//        Valor       5   7   6   9   2   8   4   0   3 
//        Assim, a seq��ncia da leitura seria 1, 5, 2, 7, 4, 9, 3, 6, 8, 0
//        Fa�a um algoritmo que seja capaz de ler esse vetor e seguir a trajet�ria

		
		int[] valores = { 5, 7, 6, 9, 2, 8, 4, 0, 3 };
		int trajetoria = 1;

		System.out.println("Posi��o | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
		System.out.println("Valor   | 5 | 7 | 6 | 9 | 2 | 8 | 4 | 0 | 3 |");

		System.out.println("");
		System.out.println("Leitura: ");
		System.out.print("1, ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[trajetoria - 1]);
			if (valores[trajetoria - 1] != 0) {
				System.out.print(", ");
			}
			trajetoria = valores[trajetoria - 1];
		}
	}
}
