package challenges.day01;

import java.util.Random;

public class Day01 {
	
	public static void main(String[] args) {
	
    //Desafio 01 - Criar um programa que gera um número aleatório entre 1 e 100 e exibir o número na tela.

		
    //Instância um objeto da classe Random usando o construtor básico.
    Random Random = new Random();
    
    //Gera um número entre 1 e 100
    int numeroAleatorio = Random.nextInt(100) + 1; 
    
    //Imprime um número inteiro aleatório entre 1 e 100
    System.out.print("Número aleatório gerado: " + numeroAleatorio);
    
  }

}  





