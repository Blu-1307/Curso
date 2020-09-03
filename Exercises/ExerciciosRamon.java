package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import Curso.JOption;

public class ExerciciosRamon {
	
	public static int escolhaExercicio;
	
	public static void exerciciosRamon() throws InterruptedException {
		Scanner entradaValores = new Scanner(System.in);
		System.out.println("");
		System.out.println("1 -> Verificar se um tri�ngulo � v�lido ou n�o, e o seu tipo");
		System.out.println("2 -> Verificar se um n�mero � maior ou menor que zero");
		System.out.println("3 -> Jogo 21");
		escolhaExercicio = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exerc�cio...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolhaExercicio) {
		case 1:
			triangulo();
			break;
		case 2:
			maiorMenorZero();
			break;
		case 3:
			jogo21ComJOptionPane();
			break;
		default:
			System.out.println("Exerc�cio n�o encontrado...");
			break;
		}
		entradaValores.close();
	}

	public static void triangulo() {
		Scanner entradaValores = new Scanner(System.in);
		int iLado1, iLado2, iLado3, iSoma1, iSoma2, iSoma3;

		System.out.print("Digite o comprimento do primeiro lado: ");
		iLado1 = entradaValores.nextInt();
		System.out.print("Digite o comprimento do segundo lado: ");
		iLado2 = entradaValores.nextInt();
		System.out.print("Digite o comprimento do terceiro lado: ");
		iLado3 = entradaValores.nextInt();

		iSoma1 = iLado1 + iLado2;
		iSoma2 = iLado2 + iLado3;
		iSoma3 = iLado3 + iLado1;

		if (iSoma1 > iLado3 && iSoma2 > iLado1 && iSoma3 > iLado2) {
			System.out.println("O Tri�ngulo � V�lido!");
			if (iLado1 == iLado2 && iLado2 == iLado3) {
				System.out.println("Tri�ngulo Equil�tero");
			} else if (iLado1 == iLado2 || iLado2 == iLado3 || iLado3 == iLado1) {
				System.out.println("Tri�ngulo Is�entradaValoreseles");
			} else {
				System.out.println("Tri�ngulo EentradaValoresaleno");
			}
		} else {
			System.out.println("O Tri�ngulo � Inv�lido!");
		}
		entradaValores.close();
	}

	public static void maiorMenorZero() {
		Scanner entradaValores = new Scanner(System.in);
		int iNumero;

		System.out.print("Digite um n�mero: ");
		iNumero = entradaValores.nextInt();

		if (iNumero < 0) {
			System.out.println("O n�mero � negativo!");
		} else if (iNumero > 0) {
			System.out.println("O n�mero � positivo!");
		} else {
			System.out.println("O n�mero � igual a zero");
		}
		entradaValores.close();
	}

	public static void jogo21ComJOptionPane() {
		int numeroAleatorioJogador = ThreadLocalRandom.current().nextInt(1, 21);

		String infoJogo = "---< 21 >---" +
				  "\nVoc� informa n�mero entre 1 e 20" +
				  "\nO sistema ir� gerar um n�mero entre 1 e 20" +
				  "\nSe o resultado for:" +
				  "\n7 = 10 Pontos" +
				  "\n14 = 14 Pontos" +
				  "\n21 = 21 Pontos" +
				  "\nEntre 1 e 6 = 1 Ponto" +
				  "\nEntre 8 e 13 = 5 Pontos" +
				  "\nEntre 15 e 20 = 6 Pontos" +
				  "\n---< 21 >---" +
				  "\n" +
				  "\nInforme um n�mero entre 1 e 20";
		
		String entradaValor = JOptionPane.showInputDialog(null, infoJogo);
		
		int numeroJogador = Integer.parseInt(entradaValor);

		if(numeroJogador > 20) {
			int resultadoPontuacao = numeroJogador + numeroAleatorioJogador;

			switch (resultadoPontuacao) {
			case 7:
				JOptionPane.showMessageDialog(null, "Pontos: " + resultadoPontuacao + " pontos", "Pontua��o", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 14:
				JOptionPane.showMessageDialog(null, "Pontos: " + resultadoPontuacao + " pontos", "Pontua��o", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 21:
				JOptionPane.showMessageDialog(null, "Pontos: " + resultadoPontuacao + " pontos", "Pontua��o", JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				break;
			}
			if (resultadoPontuacao >= 1 && resultadoPontuacao <= 6) {
				JOptionPane.showMessageDialog(null, "Pontos: 1 ponto", "Pontua��o", JOptionPane.INFORMATION_MESSAGE);
			} else if (resultadoPontuacao >= 8 && resultadoPontuacao <= 13) {
				JOptionPane.showMessageDialog(null, "Pontos: 5 pontos", "Pontua��o", JOptionPane.INFORMATION_MESSAGE);
			} else if (resultadoPontuacao >= 15 && resultadoPontuacao <= 20) {
				JOptionPane.showMessageDialog(null, "Pontos: 6 pontos", "Pontua��o", JOptionPane.INFORMATION_MESSAGE);
			} else if (resultadoPontuacao > 21) {
				JOptionPane.showMessageDialog(null, "Resultado: " + resultadoPontuacao + "\nVoc� perdeu ;(", "Pontua��o", JOptionPane.INFORMATION_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Voc� inseriu um n�mero maior que 20" + numeroJogador, "Pontua��o", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
