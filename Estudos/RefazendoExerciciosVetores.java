package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RefazendoExerciciosVetores {

	public static void exercicio1() {
		String[] vetorPosicoes = {"primeira", "segunda"};
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
		
		System.out.println("Na posi��o [" + (vetorXY[0] + 1) + "] est� o n�mero: " + vetorNumerosAleatorios[vetorXY[0]]);
		System.out.println("Na posi��o [" + (vetorXY[1] + 1) + "] est� o n�mero: " + vetorNumerosAleatorios[vetorXY[1]]);
		System.out.println("A soma dos dois n�meros �: " + soma);
		
		entradaValores.close();
	}

	public static void exercicio2() {
		int[] vetorNumerosImpares = new int[10];
		int quantidadeNumerosPreenchidos = 10;
		int numeros = 0;
		int i = 0;
		
		System.out.println("N�meros �mpares no vetor: ");
		while(i < quantidadeNumerosPreenchidos) {
			if(numeros % 2 != 0) {
				vetorNumerosImpares[i] = numeros;
				System.out.println("vetorNumerosImpares[" + i + "] " + vetorNumerosImpares[i]);
				i++;
			}
			numeros++;
		}
	}

	public static void exercicio3() {
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
			if(numeroX == vetorNumerosAleatorios[i]) {
				System.out.println("O n�mero " + numeroX + " foi encontrado na posi��o " + (i + 1));
			}
		}
		
		entradaValores.close();
	}

	public static void exercicio5() {
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




}
