package aula_003;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("*************************************");
		System.out.println("Indentificador de numeros");
		System.out.println("*************************************");
		System.out.println("Digite o número :");
			int numero1 = leia.nextInt();
		System.out.println("Digite o número :");
			int numero2 = leia.nextInt();
		System.out.println("Digite o número :");
			int numero3 = leia.nextInt();
			System.out.println("Digite o número :");
			int numero4 = leia.nextInt();
			
			if (numero1 % 2 == 0 && numero1 > 0) 
				{System.out.printf("\n O Número %d é par e positivo!:",numero1);}
			if (numero2 % 2 != 0 && numero2 < 0) 
			{System.out.printf("\n O Número %d é impar e negativo:",numero2);}
			if (numero3 % 2 == 0 && numero3 < 0) 
			{System.out.printf("\n O Número %d é par e negativo!:",numero3);}
			if (numero4 % 2 != 0 && numero4 > 0) 
			{System.out.printf("\n O Número %d é impar e negativo:",numero4);}
			
	}

}
