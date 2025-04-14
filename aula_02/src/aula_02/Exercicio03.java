package aula_02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite salarioBruto ");
		float salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite a Horas extras ");
		float horasExtras = leia.nextFloat();
		
		System.out.println("Digite o desconto ");
		float desconto = leia.nextFloat();
		
		float salarioLiquido = (salarioBruto + adicionalNoturno) + horasExtras * 5 - desconto;
			System.out.printf("seu salario liquido é : %.1f",salarioLiquido);

	}

}
