package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RefazendoExerciciosVetores {

	public static void exercicio1() {
//		 Leia um vetor de 12 posi��es e em seguida ler tamb�m dois valores X e Y
//		 quaisquer correspondentes a duas posi��es no vetor. Ao final seu programa
//		 dever� escrever a soma dos valores encontrados nas respectivas posi��es X e Y.

		String[] vetorPosicoes = { "primeira", "segunda" };
		Scanner entradaValores = new Scanner(System.in);
		int[] vetorNumerosAleatorios = new int[12];
		int[] vetorXY = new int[2];
		int soma = 0;

		System.out.println("Vetor gerado: ");
		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			vetorNumerosAleatorios[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("Na posi��o [" + (i + 1) + "] " + vetorNumerosAleatorios[i]);
		}

		for (int i = 0; i < vetorXY.length; i++) {
			System.out.print("Escolha a " + vetorPosicoes[i] + " posi��o: ");
			vetorXY[i] = entradaValores.nextInt() - 1;
		}

		for (int i = 0; i < vetorXY.length; i++) {
			soma += vetorNumerosAleatorios[vetorXY[i]];
		}

		System.out
				.println("Na posi��o [" + (vetorXY[0] + 1) + "] est� o n�mero: " + vetorNumerosAleatorios[vetorXY[0]]);
		System.out
				.println("Na posi��o [" + (vetorXY[1] + 1) + "] est� o n�mero: " + vetorNumerosAleatorios[vetorXY[1]]);
		System.out.println("A soma dos dois n�meros �: " + soma);

		entradaValores.close();
	}

	public static void exercicio2() {
//		Declare um vetor de 10 posi��es e o preencha com os 10 primeiros n�meros impares e o escreva

		int[] vetorNumerosImpares = new int[10];
		int quantidadeNumerosPreenchidos = 10;
		int numeros = 0;
		int i = 0;

		System.out.println("N�meros �mpares no vetor: ");
		while (i < quantidadeNumerosPreenchidos) {
			if (numeros % 2 != 0) {
				vetorNumerosImpares[i] = numeros;
				System.out.println("vetorNumerosImpares[" + i + "] " + vetorNumerosImpares[i]);
				i++;
			}
			numeros++;
		}
	}

	public static void exercicio3() {
//		Leia um vetor de 16 posi��es e troque os 8 primeiros valores pelos 8 �ltimos e vice-e-versa. 
//		Escreva ao final o vetor obtido

		int[] vetorNumerosGerados = new int[16];
		int[] vetorNumerosTrocados = new int[vetorNumerosGerados.length];

		System.out.println("N�meros gerados: ");
		for (int i = 0; i < vetorNumerosTrocados.length; i++) {
			vetorNumerosGerados[i] = ThreadLocalRandom.current().nextInt(1, 40);
			System.out.println("vetorNumerosGerados[" + i + "] " + vetorNumerosGerados[i]);
		}

		for (int i = 0; i < (vetorNumerosTrocados.length / 2); i++) {
			vetorNumerosTrocados[i] = vetorNumerosGerados[i + (vetorNumerosGerados.length / 2)];
			vetorNumerosTrocados[i + (vetorNumerosTrocados.length / 2)] = vetorNumerosGerados[i];
		}

		System.out.println("\nVetor com os n�meros trocados: ");
		for (int i = 0; i < vetorNumerosTrocados.length; i++) {
			System.out.println("vetorNumerosTrocados[" + i + "] " + vetorNumerosTrocados[i]);
		}
	}

	public static void exercicio4() {
//		Leia um vetor de 20 posi��es e em seguida um valor X qualquer. 
//		Seu programa devera fazer uma busca do valor de X no vetor lido e 
//		informar a posi��o em que foi encontrado ou se n�o foi encontrado

		Scanner entradaValores = new Scanner(System.in);
		int[] vetorNumerosAleatorios = new int[20];
		int numeroX;

		System.out.println("N�meros gerados aleatoriamente: ");
		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			vetorNumerosAleatorios[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("vetorNumerosAleatorios[" + i + "] " + vetorNumerosAleatorios[i]);
		}

		System.out.print("Escolha um n�mero para saber sua posi��o: ");
		numeroX = entradaValores.nextInt();

		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			if (numeroX == vetorNumerosAleatorios[i]) {
				System.out.println("O n�mero " + numeroX + " foi encontrado na posi��o " + (i + 1));
			}
		}

		entradaValores.close();
	}

	public static void exercicio5() {
//		Leia um vetor de 40 posi��es. Contar e escrever quantos valores pares ele possui

		int[] vetorNumeros = new int[40];
		int quantidadePares = 0;
		String numerosGerados = "";
		String numerosPares = "";

		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = ThreadLocalRandom.current().nextInt(1, 99);
			numerosGerados += String.format("| %2d | \n", vetorNumeros[i]);
			if (vetorNumeros[i] % 2 == 0) {
				numerosPares += String.format("| %2d | \n", vetorNumeros[i]);
				quantidadePares++;
			}
		}

		System.out.println("N�meros gerados: ");
		System.out.println(numerosGerados);

		System.out.println("N�meros Pares:");
		System.out.println(numerosPares);
		System.out.println("A quantidade de n�meros pares � " + quantidadePares);
	}

	public static void exercicio6() {
//		Leia um vetor de 40 posi��es e atribua valor 0 para todos os elementos que possu�rem valores negativos

		int[] vetorNumeros = new int[40];
		String textoNumerosGerados = "";
		String textoNumerosMenoresQueZero = "";

		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = ThreadLocalRandom.current().nextInt(-50, 50);
			textoNumerosGerados += String.format("| %3d | \n", vetorNumeros[i]);
			if (vetorNumeros[i] < 0) {
				vetorNumeros[i] = 0;
				textoNumerosMenoresQueZero += String.format("| %2d | \n", vetorNumeros[i]);
			} else {
				textoNumerosMenoresQueZero += String.format("| %2d | \n", vetorNumeros[i]);
			}

		}

		System.out.println("N�meros gerados: ");
		System.out.println(textoNumerosGerados);

		System.out.println("N�meros menores que zero trocados: ");
		System.out.println(textoNumerosMenoresQueZero);
	}

	public static void exercicio7() {
//		Leia dos vetores de 20 posi��es e calcule um outro vetor contendo, nas posi��es 
//		pares os valores do primeiro e nas posi��es impares os valores do segundo.

		int[] vetorNumerosAleatoriosUm = new int[20];
		int[] vetorNumerosAleatoriosDois = new int[20];
		int[] vetorUniaoVetores = new int[40];
		int[] colocaNumeros = { 0, 0 };
		String[] textos = { "N�meros no primeito vetor: \n", "N�meros no segundo vetor: \n",
				"N�meros no vetor de uni�o: \n" };

		for (int i = 0; i < vetorNumerosAleatoriosDois.length; i++) {
			vetorNumerosAleatoriosUm[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textos[0] += String.format("vetorNumerosAleatoriosUm[%2d] ", i)
					+ String.format("| %2d |\n", vetorNumerosAleatoriosUm[i]);

			vetorNumerosAleatoriosDois[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textos[1] += String.format("vetorNumerosAleatoriosDois[%2d] ", i)
					+ String.format("| %2d |\n", vetorNumerosAleatoriosDois[i]);
		}

		System.out.println(textos[0]);
		System.out.println(textos[1]);

		for (int i = 0; i < vetorUniaoVetores.length; i++) {
			if (i % 2 == 0) {
				vetorUniaoVetores[i] = vetorNumerosAleatoriosUm[colocaNumeros[0]];
				textos[2] += String.format("vetorUniaoVetores[%2d] ", i)
						+ String.format("| %2d |\n", vetorUniaoVetores[i]);
				colocaNumeros[0]++;
			} else {
				vetorUniaoVetores[i] = vetorNumerosAleatoriosDois[colocaNumeros[1]];
				textos[2] += String.format("vetorUniaoVetores[%2d] ", i)
						+ String.format("| %2d |\n", vetorUniaoVetores[i]);
				colocaNumeros[1]++;

			}
		}

		System.out.println(textos[2]);
	}

	public static void exercicio8() {
//		 Leia um vetor de 40 posi��es e acumule os valores do primeiro elemento no
//		 segundo, deste no terceiro e assim por diante. Ao final, escreva o vetor
//		 obtido.

		int[] vetorNumeros = new int[40];

		System.out.println("N�meros gerados:");
		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = ThreadLocalRandom.current().nextInt(1, 100);
			System.out.println(String.format("vetorNumeros[%2d] ", i) + String.format("| %2d |", vetorNumeros[i]));
		}

		System.out.println("\nN�meros acumulados: \n" + "vetorNumeros[ 0] |   " + vetorNumeros[0] + " |");
		for (int i = 0; i < vetorNumeros.length - 1; i++) {
			vetorNumeros[i + 1] = vetorNumeros[i] + vetorNumeros[i + 1];
			System.out.println(
					String.format("vetorNumeros[%2d] ", i + 1) + String.format("| %4d |", vetorNumeros[i + 1]));
		}
	}

	public static void exercicio9() throws InterruptedException {
//		Leia um vetor contendo letras de uma frase inclusive os espa�os em branco. 
//		Retirar os espa�os em branco do vetor e depois escreve-los.

		Scanner entradaDados = new Scanner(System.in);
		String[] letrasFrase;
		String frase;

		System.out.print("Digite uma frase: ");
		frase = entradaDados.nextLine();
		letrasFrase = new String[frase.length()];

		System.out.print("Frase escrita: ");
		for (int i = 0; i < letrasFrase.length; i++) {
			letrasFrase[i] = frase.charAt(i) + "";
			System.out.print(letrasFrase[i]);
		}

		System.out.println("\n\nRetirando os espa�os...");
		TimeUnit.SECONDS.sleep(2);

		System.out.print("\nFrase sem espa�os: ");
		for (int i = 0; i < letrasFrase.length; i++) {
			if (letrasFrase[i].equals(" ")) {
				letrasFrase[i] = "";
			}
			System.out.print(letrasFrase[i]);
		}

		entradaDados.close();

	}

	public static void exercicio10() {
//		Leia um vetor de 5 posi��es contendo os caracteres de um numero. Em seguida escreva esse numero por extenso

		String[] letrasNumero = { "S", "e", "t", "e", "n", "t", "a" };

		System.out.println("N�mero no vetor escrito por extenso:");
		for (int i = 0; i < letrasNumero.length; i++) {
			System.out.print(letrasNumero[i]);
		}
	}

	public static void exercicio11() {
		VerificadorAnagramas.main(null);
	}
	
	public static void exercicio12() {
//		Leia 3 vetores de 9 posi��es e crie outro com o 1� ter�o do primeiro, 
//		o segundo 3�. do segundo e o ultimo ter�o do 3�. Escrever o vetor resultante ao final

		int[] vetorPrimeiro = new int[9];
		int[] vetorSegundo = new int[9];
		int[] vetorTerceiro = new int[9];
		int[] vetorUniao = new int[9];
		String textoPrimeiroVetor = "| ", textoSegundoVetor = "| ", textoTerceiroVetor = "| ", textoVetorUniao = "| ";

		for (int i = 0; i < vetorPrimeiro.length; i++) {
			vetorPrimeiro[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoPrimeiroVetor += String.format("%2d | ", vetorPrimeiro[i]);

			vetorSegundo[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoSegundoVetor += String.format("%2d | ", vetorSegundo[i]);

			vetorTerceiro[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoTerceiroVetor += String.format("%2d | ", vetorTerceiro[i]);

			if (i < vetorUniao.length / 3) {
				vetorUniao[i] = vetorPrimeiro[i];
			} else if (i < vetorUniao.length / 3 + vetorUniao.length / 3) {
				vetorUniao[i] = vetorSegundo[i];
			} else {
				vetorUniao[i] = vetorTerceiro[i];
			}
			textoVetorUniao += String.format("%2d | ", vetorUniao[i]);
		}

		System.out.println("\nPrimeiro vetor gerado: ");
		System.out.println(textoPrimeiroVetor);

		System.out.println("\nSegundo vetor gerado: ");
		System.out.println(textoSegundoVetor);

		System.out.println("\nTerceiro vetor gerado: ");
		System.out.println(textoTerceiroVetor);

		System.out.println("\nVetor Unido: ");
		System.out.println(textoVetorUniao);
	}

	public static void exercicio13() {
//		Leia um vetor de 10 posi��es e verifique se existem valores iguais e os escreva.

		int[] vetorNumerosAleatorios = new int[10];
		boolean numerosIguaisExistem = false;
		String textoVetorGerado = "| ";

		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			vetorNumerosAleatorios[i] = ThreadLocalRandom.current().nextInt(1, 20);
			textoVetorGerado += String.format("%2d | ", vetorNumerosAleatorios[i]);
		}
		System.out.println("Vetor gerado: ");
		System.out.println(textoVetorGerado);
		
		System.out.println("\n-----------");
		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			for (int j = i; j < vetorNumerosAleatorios.length; j++) {
				if (i != j && vetorNumerosAleatorios[i] == vetorNumerosAleatorios[j]) {
					System.out.println("vetorNumerosAleatorios[" + i + "] " + vetorNumerosAleatorios[i]);
					System.out.println("vetorNumerosAleatorios[" + j + "] " + vetorNumerosAleatorios[j]);
					System.out.println("-----------");
					numerosIguaisExistem = true;
				} else if(!numerosIguaisExistem) {
					numerosIguaisExistem = false;
				}
			}
		}
		
		if(!numerosIguaisExistem) {
			System.out.println("N�o existem n�meros repetidos");
			System.out.println("-----------");
		}
	}

	public static void exercicio14() {
//		Leia um vetor de 50 posi��es e o compacte, ou seja, elimine as 
//		posi��es com valor zero avan�ando uma posi��o, com os com os valores 
//		subseq�entes do vetor. Dessa forma todos �zeros� devem ficar para as posi��es finais do vetor

		int[] vetorNumeros = new int[50];
		int auxiliar = 0;
		int quantidadeZeros = 0;
		String textoVetorGerado = "Vetor gerado: \n";

		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = ThreadLocalRandom.current().nextInt(0, 30);
			textoVetorGerado += String.format("| %3d |\n", vetorNumeros[i]);
		}
		System.out.println(textoVetorGerado);

		for (int i = 0; i < vetorNumeros.length; i++) {
			for (int j = 0; j < vetorNumeros.length; j++) {
				if (vetorNumeros[j] == 0 && j < vetorNumeros.length - 1) {
					auxiliar = vetorNumeros[j + 1];
					vetorNumeros[j + 1] = 0;
					vetorNumeros[j] = auxiliar;
				}
			}
		}

		System.out.println("Vetor compactado:");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println(String.format("| %3d |", vetorNumeros[i]));
			if(vetorNumeros[i] == 0) {
				quantidadeZeros++;
			}
		}
		
		System.out.println("A quantidade de zeros colocados para o final do vetor foram: " + quantidadeZeros);
	}

	public static void exercicio15() {
//		Considere um vetor de trajet�rias de 9 elementos, onde cada 
//		elemento possui o valor do pr�ximo elemento do vetor a ser lido. 
//        �ndice      1   2   3   4   5   6   7   8   9  
//        Valor       5   7   6   9   2   8   4   0   3 
//        Assim, a seq��ncia da leitura seria 1, 5, 2, 7, 4, 9, 3, 6, 8, 0
//        Fa�a um algoritmo que seja capaz de ler esse vetor e seguir a trajet�ria

		int[] valores = { 5, 7, 6, 9, 2, 8, 4, 0, 3 };
		int trajetoria = 1;
		String textoTrajetoria = "Trajet�ria: \n1, ";

		System.out.println("Posi��o | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
		System.out.println("Valor   | 5 | 7 | 6 | 9 | 2 | 8 | 4 | 0 | 3 |\n");

		for (int i = 0; i < valores.length; i++) {
			textoTrajetoria += valores[trajetoria - 1];
			if (valores[trajetoria - 1] != 0) {
				textoTrajetoria += ", ";
			}
			trajetoria = valores[trajetoria - 1];
		}

		System.out.println(textoTrajetoria);
	}
}