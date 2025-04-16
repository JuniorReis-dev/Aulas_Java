package aula_003;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("*************************************");
		System.out.println("somas entre numeros");
		System.out.println("*************************************");
		System.out.println("Digite o número A:");
			int numeroA = leia.nextInt();
		System.out.println("Digite o número B:");
			int numeroB = leia.nextInt();
		System.out.println("Digite o número C:");
			int numeroC = leia.nextInt();
			
			int soma = numeroA + numeroB;
		
		if (soma > numeroC)
			{System.out.printf("\n A Soma de %d + %d e maior que: %d ",numeroA,numeroB,numeroC);}
		
		if (soma < numeroC) 
			{System.out.printf("\n A Soma de %d + %d e menor que: %d ",numeroA,numeroB,numeroC);}	
		
		if (soma == numeroC) 
			{System.out.printf("\n A Soma de %d + %d e igual a: %d ",numeroA,numeroB,numeroC);}
		}
	}


