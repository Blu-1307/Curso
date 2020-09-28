package Curso.Estudos;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
		boolean verificacao = false, repeticao = false;
		int opcaoEscolhida, numeroUm, numeroDois;
		String textoUm = "Escolha uma op��o: \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n\n0 - Cancelar", resultado = "", repete = "";
		
		do {
			opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog(null, textoUm, "Escolha", JOptionPane.QUESTION_MESSAGE));
			
			verificacao = (opcaoEscolhida >= 0 && opcaoEscolhida <= 4) ? true : false;
			
			if(verificacao) {
				numeroUm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro n�mero", "Primeiro N�mero", JOptionPane.QUESTION_MESSAGE));
				numeroDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo n�mero", "Segundo N�mero", JOptionPane.QUESTION_MESSAGE));
				
				switch (opcaoEscolhida) {
				case 0:
					System.exit(0);
					break;
				case 1:
					resultado = "O resultado de " + numeroUm  + " + " + numeroDois + " �:" + "\n" + (numeroUm + numeroDois);
					break;
				case 2:
					resultado = "O resultado de " + numeroUm  + " - " + numeroDois + " �:" + "\n" + (numeroUm - numeroDois);
					break;
				case 3:
					resultado = "O resultado de " + numeroUm  + " * " + numeroDois + " �:" + "\n" + (numeroUm * numeroDois);
					break;
				case 4:
					resultado = "O resultado de " + numeroUm  + " / " + numeroDois + " �:" + "\n" + (numeroUm / numeroDois);
					break;
				default:
					break;
				}
				
				JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
				repete = JOptionPane.showInputDialog(null, "Deseja fazer outra opera��o? S/N", "Nova opera��o?", JOptionPane.QUESTION_MESSAGE);
				
				switch (repete) {
				case "S":
					repeticao = true;
					break;
				case "N":
					repeticao = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Erro! A op��o n�o foi reconhecida " + repeticao + "\nEncerrando...");
					repeticao = false;
					break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Erro! A op��o n�o foi reconhecida " + opcaoEscolhida);
				repeticao = true;
			}
		} while (repeticao);
	}
	
	public static void exercicio4() {
		Scanner scEntrada = new Scanner(System.in);
		String produtoEscolhido;
		
		System.out.println("Produtos Dispo�veis: ");
		System.out.println(" ");
		System.out.println("--- N�o-Perec�veis --- ");
		System.out.println("Arroz, feij�o, caf� ");
		System.out.println(" ");
		System.out.println("--- Frutas --- ");
		System.out.println("Manga, banana, ma�� ");
		System.out.println(" ");
		System.out.println("--- Bebidas --- ");
		System.out.println("Leite, sucos, refrigerantes ");
		System.out.println(" ");
		System.out.print("Escolha um produto: ");
		produtoEscolhido = scEntrada.next();
		
		switch (produtoEscolhido) {
		case "arroz":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "feij�o":
		case "feijao":
			System.out.println("Produto escolhido: feij�o");
			break;
		case "caf�":
		case "cafe":
			System.out.println("Produto escolhido: caf�");
			break;
		case "manga":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "banana":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "ma�a":
		case "maca":
		case "mac�":
		case "ma��":
			System.out.println("Produto escolhido: ma��");
			break;
		case "leite":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "sucos":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		case "refrigerantes":
			System.out.println("Produto escolhido: " + produtoEscolhido);
			break;
		default:
			System.out.println("Produto n�o encontrado no sistema: " + produtoEscolhido);
			break;
		}
		
		scEntrada.close();
	}
}
