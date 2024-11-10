package challenges.day05;

import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite qualquer coisa: ");
		String texto = scan.nextLine();

		// Remove os espaços em branco antes de contar
		texto = texto.replaceAll(" ", "");

		//conta o tamanho da string fornecida sem incluir os espaços
		int tamanho = texto.length();

		System.out.println("O tamanho da string fornecida, sem contar os espaços: " + tamanho);

		scan.close();
	}
}
