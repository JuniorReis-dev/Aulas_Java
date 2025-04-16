package aula_003;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("*************************************");
		System.out.println("sistemas para doar sangue");
		System.out.println("*************************************");
		System.out.println("Digite o seu nome :");
			String nome = leia.nextLine();
		System.out.println("Digite o idade :");
			int idade = leia.nextInt();
		System.out.println("voce ja dou sangue ? digite 1 para true ou 2 para false ");
			int pergunta = leia.nextInt();
			
		if (idade >= 18 && idade <= 60) {
			System.out.printf("\n %s Voce está apto(a) para doar sangue!",nome);}
		if (idade >= 60 && idade <= 69 && pergunta == 2 ) {
			System.out.printf("\n %s Voce Não está apto(a) para doar sangue!",nome);}
		if (idade >= 60 && idade <= 69 && pergunta == 1 ) {
			System.out.printf("\n %s Voce está apto(a) para doar sangue!",nome);}
		else {System.out.println("voce nao esta apto para doar sangue !");}	
			

	}

}
