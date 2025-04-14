package aula_02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o seu abono: ");
		float abono = leia.nextFloat();
		
		float novosalario = salario + abono;
			System.out.printf("\n Novo salario é: %f",novosalario);

	}

}
