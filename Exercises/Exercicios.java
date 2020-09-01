package Curso.Exercises;

import java.util.Scanner;

public class Exercicios {

	static Scanner entradaValores;
	static int escolhaExercicio;

	public static void main(String[] args) throws InterruptedException {

		int escolhaLista;
		entradaValores = new Scanner(System.in);

		System.out.println("Selecione uma Lista: ");
		System.out.println("1 -> Lista de Exerc�cios B�sicos Java");
		System.out.println("2 -> Exerc�cios do Cleiton");
		System.out.println("3 -> Exerc�cios do Ramon");
		System.out.println("4 -> Exerc�cios de If/Else");
		System.out.println("5 -> Exerc�cios de Switch");
		escolhaLista = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Abrindo lista...");
		
		switch (escolhaLista) {
		case 1:
			ExerciciosBasicos.exerciciosBasicos();
			break;
		case 2:
			ExerciciosCleiton.exerciciosCleiton();
			break;
		case 3:
			ExerciciosRamon.exerciciosRamon();
			break;
		case 4:
			ExerciciosIfElse.exerciciosIfElse();
			break;
		case 5:
			ExerciciosSwitch.exerciciosSwitch();
			break;
		default:
			System.out.println("Lista n�o encontrada...");
			break;
		}

	}
}