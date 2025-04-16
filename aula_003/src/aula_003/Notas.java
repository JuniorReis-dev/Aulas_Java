package aula_003;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno");
		float nota = leia.nextFloat();
		
		if (nota >= 7) {System.out.println("aluno aprovado!");}
		
		else if (nota >= 5 && nota < 7) 
		{System.out.println("aluno de exame ");}
		
		else {System.out.println("aluno Reprovado ");}
		
		

	}

}
