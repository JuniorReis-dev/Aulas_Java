package aula_02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite salarioBruto ");
		float numero1 = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno");
		float numero2 = leia.nextFloat();
		
		System.out.println("Digite a Horas extras ");
		float numero3 = leia.nextFloat();
		
		System.out.println("Digite o desconto ");
		float numero4 = leia.nextFloat();
		
		float calculo = (numero1 * numero2 )-(numero3 * numero4);
		
		System.out.printf("a diferença é : %.1f",calculo);

	}

}
