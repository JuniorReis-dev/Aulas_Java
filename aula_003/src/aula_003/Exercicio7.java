package aula_003;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		float resultado = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("digite um numero:");
			float numero1 = leia.nextFloat();
		System.out.println("digite outro numero:");
			float numero2 = leia.nextFloat();
		System.out.println("digite o codigo da operaçao:");
		System.out.println("---------------------------------------");
        System.out.println("| Código | Operação                   |");
        System.out.println("---------------------------------------");
        System.out.println("| 1      | Soma                       |");
        System.out.println("| 2      | Subtração                  |");
        System.out.println("| 3      | Multiplicação              |");
        System.out.println("| 4      | Divisão                    |");
        System.out.println("---------------------------------------");
        	int codigo = leia.nextInt();
        	
        	switch(codigo) {
			case 1:
				resultado = numero1 + numero2 ;
			break;
			
			case 2:
				resultado = numero1 - numero2 ;
				break;
				
			case 3:
				resultado = numero1 * numero2 ;
				break;
				
			case 4:
				resultado = numero1 / numero2 ;
				break;
			default:
				System.out.println("Opção inválida!");
				return;
        	}
        	
        	System.out.printf("resultado:%.1f",resultado);
	}

}
