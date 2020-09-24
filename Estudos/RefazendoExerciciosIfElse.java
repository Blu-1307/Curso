package Curso.Estudos;

import java.util.Scanner;

public class RefazendoExerciciosIfElse {

	public static void exercicio1() {
		Scanner scEntrada = new Scanner(System.in);
		int numeroUm, numeroDois;
		
		System.out.print("Digite o primeiro n�mero: ");
		numeroUm = scEntrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numeroDois = scEntrada.nextInt();
		
		if(numeroUm > numeroDois ) {
			System.out.println("O maior n�mero � o " + numeroUm);
		} else {
			System.out.println("O maior n�mero � o " + numeroDois);
		}

		scEntrada.close();
	}
	
	public static void exercicio2() {
		Scanner scEntrada = new Scanner(System.in);
		int numeroUm, numeroDois, numeroTres, numeroQuatro;
		
		System.out.print("Digite o primeiro n�mero: ");
		numeroUm = scEntrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numeroDois = scEntrada.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		numeroTres = scEntrada.nextInt();
		System.out.print("Digite o quarto n�mero: ");
		numeroQuatro = scEntrada.nextInt();
		
		if(numeroUm < numeroDois && numeroUm < numeroTres && numeroUm < numeroQuatro) {
			System.out.println("O menor n�mero �: " + numeroUm);
		} else if(numeroDois < numeroUm && numeroDois < numeroTres && numeroDois < numeroQuatro) {
			System.out.println("O menor n�mero �: " + numeroTres);
		} else if(numeroTres < numeroUm && numeroTres < numeroDois && numeroTres < numeroQuatro) {
			System.out.println("O menor n�mero �: " + numeroTres);
		} else {
			System.out.println("O menor n�mero �: " + numeroQuatro);
		}
		
		scEntrada.close();
	}

	public static void exercicio3() {
		Scanner scEntrada = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = scEntrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par");
		} else {
			System.out.println("O n�mero " + numero + " � �mpar");
		}
		
		scEntrada.close();
	}

	public static void exercicio4() {
		Scanner scEntrada = new Scanner(System.in);
		String codigoProduto;
		
		System.out.print("Digite o c�digo do produto: ");
		codigoProduto = scEntrada.next();
		
		if(codigoProduto.equals("001") ) {
			System.out.println("Produto 001 - Arroz");
		} else if (codigoProduto.equals("002")) {
			System.out.println("Produto 002 - Feij�o");
		} else if (codigoProduto.equals("003")) {
			System.out.println("Produto 002 - Farinha");
		} else {
			System.out.println("Produto " + codigoProduto + " - Diversos");
		}
		
		scEntrada.close();
	}

	public static void exercicio5() {
		Scanner scEntrada = new Scanner(System.in);
		int anoNascimento;
		
		System.out.print("Digite o ano de nascimento da pessoa: ");
		anoNascimento = scEntrada.nextInt();
		
		if(2020 - anoNascimento > 15) {
			System.out.println("Pode votar esse ano!");
		} else {
			System.out.println("N�o pode votar esse ano!");
		}
		
		scEntrada.close();
	}

	public static void exercicio6() {
		Scanner scEntrada = new Scanner(System.in);
		int senhaValida = 1234, senhaDigitada;
		
		System.out.print("Para acessar, digita a senha: ");
		senhaDigitada = scEntrada.nextInt();
		
		if(senhaDigitada == senhaValida) {
			System.out.println("Acesso Permitido!");
		} else {
			System.out.println("Acesso Negado!");
		}
		
		scEntrada.close();
	}

	public static void exercicio7() {
		Scanner scEntrada = new Scanner(System.in);
		Double qntdMacas, precoPagar;
		
		System.out.print("Informe a quantidade de ma��s compradas: ");
		qntdMacas = scEntrada.nextDouble();
		
		if(qntdMacas < 12) {
			precoPagar = qntdMacas * 0.30;
		} else {
			precoPagar = qntdMacas * 0.25;
		}
		
		System.out.println("O pre�o a ser pago �: R$" + precoPagar);
		
		scEntrada.close();
	}

}
