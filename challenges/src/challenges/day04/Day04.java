package challenges.day04;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma String: ");
		String input = scan.nextLine().toLowerCase();

		int vogais = 0, consoantes = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vogais++;
				} else {
					consoantes++;
				}

			}
		}
        
		System.out.println("------------------------------------------------");
		System.out.println("Número de vogais: " + vogais);
		System.out.println("Número de consoantes: " + consoantes);

		scan.close();

	}

}
