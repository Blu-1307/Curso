package Curso.Exercises;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		int iLado1, iLado2, iLado3, iSoma1, iSoma2, iSoma3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o comprimento do primeiro lado: ");
		iLado1 = sc.nextInt();
		System.out.print("Digite o comprimento do segundo lado: ");
		iLado2 = sc.nextInt();
		System.out.print("Digite o comprimento do terceiro lado: ");
		iLado3 = sc.nextInt();

		iSoma1 = iLado1 + iLado2;
		iSoma2 = iLado2 + iLado3;
		iSoma3 = iLado3 + iLado1;

		if (iSoma1 > iLado3 && iSoma2 > iLado1 && iSoma3 > iLado2) {
			System.out.println("O Tri�ngulo � V�lido!");
			if (iLado1 == iLado2 && iLado2 == iLado3) {
				System.out.println("Tri�ngulo Equil�tero");
			} else if (iLado1 == iLado2 || iLado2 == iLado3 || iLado3 == iLado1) {
				System.out.println("Tri�ngulo Is�sceles");
			} else {
				System.out.println("Tri�ngulo Escaleno");
			}
		} else {
			System.out.println("O Tri�ngulo � Inv�lido!");
		}
		

	}
}
