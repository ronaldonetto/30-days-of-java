package challenges.day03;

import java.util.Scanner;

public class Day03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int escolha;

		do {
			escolha = mostrarMenu(scan);

			switch (escolha) {
			case 1:
				calculadoraImc(scan);
				break;
			case 2:
				System.out.println("--------------------------------------------------");
				System.out.println("\nPrograma finalizado!");
				System.out.println("--------------------------------------------------");
				break;
			default:
				System.out.println("--------------------------------------------------");
				System.out.println("\nEscolha inválida! Tente novamente.\n");
				System.out.println("--------------------------------------------------");
				break;
			}

			System.out.println();
		} while (escolha != 2);

		scan.close();
	}

	// Método para exibir o menu e capturar a escolha do usuário
	public static int mostrarMenu(Scanner scan) {

		int escolhaUsuario;

		System.out.println("<< CALCULADORA IMC >>\n");
		System.out.println("1- Utilizar calculadora:");
		System.out.println("2- Sair da calculadora: \n");

		System.out.print("Digite o número da sua escolha aqui: ");
		while (!scan.hasNextInt()) {
			System.out.println("\nEntrada inválida! Digite um número válido (1 ou 2):");
			scan.next();
		}

		escolhaUsuario = scan.nextInt();
		return escolhaUsuario;
	}

	// Método para calcular o IMC do usuário
	public static void calculadoraImc(Scanner scan) {
		System.out.println("--------------------------------------------------");

		double altura = validarAltura(scan);
		double peso = validarPeso(scan);

		double imc = peso / (altura * altura);
		System.out.println("--------------------------------------------------");
		System.out.printf("Seu IMC é: %.2f \n", imc);
		exibirClassificacaoIMC(imc);
		System.out.println("--------------------------------------------------");

	}

	// Método para validar a altura que o usuário digitar
	public static double validarAltura(Scanner scan) {
		double altura;

		do {
			System.out.print("\nDigite a sua altura em metros(m): ");
			while (!scan.hasNextDouble()) {
				System.out.println("Entrada inválida! Por favor, insira um valor numérico para a altura.");
				scan.next();
			}
			altura = scan.nextDouble();
			if (altura <= 0) {
				System.out.println("\nAltura inválida. Por favor, insira um valor positivo.");
			}
		} while (altura <= 0);

		return altura;

	}

	// Método para validar o peso que o usuário digitar
	public static double validarPeso(Scanner scan) {
		double peso;

		do {
			System.out.print("Digite seu peso em quilogramas(Kg): ");
			while (!scan.hasNextDouble()) {
				System.out.println("Entrada inválida! Por favor, insira um valor numérico para o peso.");
				scan.next();
			}
			peso = scan.nextDouble();
			if (peso <= 0) {
				System.out.println("\nPeso inválido. Por favor, insira um valor positivo.");
			}
		} while (peso <= 0);

		return peso;
	}

	// Método para exibir a classificação do IMC que o usuário se encontra
	public static void exibirClassificacaoIMC(double imc) {
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso!");
		} else if (imc <= 24.9) {
			System.out.println("Você está no peso ideal!");
		} else if (imc <= 29.9) {
			System.out.println("Você está com sobrepeso!");
		} else {
			System.out.println("Você está com obesidade!");
		}

	}

}
