package Curso.Estudos;

import java.util.Scanner;

public class RefazendoExerciciosSwitch {

	public static void exercicio1() {
		Scanner scEntrada = new Scanner(System.in);
		String fruta;

		System.out.println("Frutas: Ma��, Kiwi, Melancia");
		System.out.print("Escolha uma fruta: ");
		fruta = scEntrada.next();

		switch (fruta.toLowerCase()) {
		case "ma��":
		case "ma�a":
		case "maca":
			System.out.println("N�o vendemos esta fruta aqui!");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de kiwi!");
			break;
		case "melancia":
			System.out.println("Aqui est�! S�o R$3,00 o quilo!");
			break;
		default:
			System.out.println("Fruta n�o encontrada!");
			break;
		}

		scEntrada.close();
	}

	public static void exercicio2() {
		Scanner scEntrada = new Scanner(System.in);
		String carroEscolhido, confirmacao;
		boolean confirmacaoCompra = false;
		
		do {
			System.out.println("Carros dispon�veis: ");
			System.out.println("");
			System.out.println("Hatch");
			System.out.println("Sedan");
			System.out.println("Motocicleta");
			System.out.println("Caminhonete");
			System.out.println("");
			System.out.print("Escolha o modelo: ");
			carroEscolhido = scEntrada.next();
			
			switch (carroEscolhido.toLowerCase()) {
			case "hatch":
				System.out.println("Compra efetuada com sucesso! Parab�ns!");
				confirmacaoCompra = true;
				break;
			case "sedan":
				System.out.println("Tem certeza que deseja comprar este modelo? (Sedan) S/N");
				confirmacao = scEntrada.next();
				confirmacaoCompra = (confirmacao.equalsIgnoreCase("S")) ? true : false;
				if(confirmacaoCompra) {
					System.out.println("Compra efetuada com sucesso! Parab�ns!");
				}
				break;
			case "motocicleta":
				System.out.println("Tem certeza que deseja comprar este modelo? (Motocicleta) S/N");
				confirmacao = scEntrada.next();
				confirmacaoCompra = (confirmacao.equalsIgnoreCase("S")) ? true : false;
				if(confirmacaoCompra) {
					System.out.println("Compra efetuada com sucesso! Parab�ns!");
				}
				break;
			case "caminhonete":
				System.out.println("Tem certeza que deseja comprar este modelo? (Caminhonete) S/N");
				confirmacao = scEntrada.next();
				confirmacaoCompra = (confirmacao.equalsIgnoreCase("S")) ? true : false;
				if(confirmacaoCompra) {
					System.out.println("Compra efetuada com sucesso! Parab�ns!");
				}
				break;
			default:
				break;
			}
		} while(!confirmacaoCompra);
		
		scEntrada.close();
	}
	
	public static void exercicio3() {
		
	}
	
	public static void exercicio4() {
		
	}
	
	public static void exercicio5() {
		
	}













}
