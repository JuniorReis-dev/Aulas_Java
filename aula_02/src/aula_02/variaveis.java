package aula_02;

import java.util.Scanner;

public class variaveis {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//definiçoes da variavel 
		System.out.println("digite um valor");
		int numero_01 = leia.nextInt();
		System.out.println("digite um valor");
		int numero_02 = leia.nextInt();
		char opcao = 'V';
		boolean menorIdade = true;
		System.out.println("digite o seu nome ");
		String nome = leia.next();
		
		// definiciao da costante PI 
		final double PI = 3.1415;
		// atribuiçao de valor 
		numero_02 = 75;
		System.out.printf("Variável numero 1 é igual a: %d\n", numero_01);
		System.out.println(numero_01);
		System.out.println(numero_02);
		System.out.println(PI);
		System.out.println("Variável nome em letras maiúsculas: " + nome.toUpperCase());

	}

}
