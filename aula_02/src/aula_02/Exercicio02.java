package aula_02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota ");
		float nota01 = leia.nextFloat();
		
		System.out.println("Digite a nota ");
		float nota02 = leia.nextFloat();
		
		System.out.println("Digite a nota ");
		float nota03 = leia.nextFloat();
		
		System.out.println("Digite a nota ");
		float nota04 = leia.nextFloat();
		
		float media = (nota01 + nota02 + nota03 + nota04) / 4;
			System.out.printf("sua media é : %.1f",media);
	}

}
