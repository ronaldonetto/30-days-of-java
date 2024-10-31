package challenges.day02;

import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {

		/*
		 * Conversor de Temperatura – Implementar um programa que converte temperaturas
		 * de Celsius para Fahrenheit e vice-versa.
		 */

		// Instanciando um objeto da classe Scanner para entrada de dados
		Scanner scan = new Scanner(System.in);
		int escolha;

		// Utilizando o 'do while' para permitir ao usuário executar o programa várias vezes sem interrupções
		do {

			// Exibe as opções para o usuário
			System.out.println("!!Bem vindo(a) ao conversor de temperaturas!!\n");
			System.out.println("1- Converter de Fahrenheit para Celsius");
			System.out.println("2- Converter de Celsius para Fahrenheit");
			System.out.println("3- Sair do programa\n");

			System.out.print("Digite o número da sua escolha aqui: ");
			escolha = scan.nextInt();

			// Utiliza o switch para determinar a ação com base na escolha do usuário
			switch (escolha) {
			case 1:
				converterFahrenheitParaCelsius(scan);
				break;
			case 2:
				converterCelsiusParaFahrenheit(scan);
				break;
			case 3:
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

			System.out.println(); // Linha em branco para separar cada execução
		} while (escolha != 3); // Repete enquanto a opção não for 3 (sair)

		scan.close(); // Fecha o Scanner ao sair do loop
	}

	// Método para converter Fahrenheit para Celsius
	public static void converterFahrenheitParaCelsius(Scanner scan) {
		System.out.println("--------------------------------------------------");
		System.out.print("\nDigite a temperatura em Fahrenheit: ");
		double f = scan.nextDouble();
		

		double c = (f - 32) / 1.8; // Fórmula de conversão
		
		
		System.out.printf("\nTemperatura convertida: %.2f Celsius\n", c); // Exibe o resultado da conversão
		System.out.println("--------------------------------------------------");
	}

	// Método para converter Celsius para Fahrenheit
	public static void converterCelsiusParaFahrenheit(Scanner scan) {
		System.out.println("--------------------------------------------------");
		System.out.print("\nDigite a temperatura em Celsius: ");
		double c = scan.nextDouble();

		double f = (c * 1.8) + 32; // Fórmula de conversão

		System.out.printf("\nTemperatura convertida: %.2f Fahrenheit\n", f); // Exibe o resultado da conversão
		System.out.println("--------------------------------------------------");
	}
}
