package aula04;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro número do intervalo");
        int numero1 = leia.nextInt();
        System.out.println("Digite o segundo número do intervalo");
        int numero2 = leia.nextInt();
        
        if (numero1 >= numero2) {
            System.out.println("Intervalo inválido! O primeiro número deve ser menor que o segundo.");
            return; }
        
        System.out.println("No Intervalo entre 10 e 100:");
        for (int i = numero1; i <= numero2;++i) {
        	if (i % 3 == 0 && i % 5 == 0) {
        		System.out.printf("\nNumero  %d é multipo de 3 e 5 ",i);}
        }
	}

}
