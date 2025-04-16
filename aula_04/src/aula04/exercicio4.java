package aula04;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		        Scanner leia = new Scanner(System.in);
		        int numero;
		        int soma = 0;
		        int contador = 0;
		        
		        do {
		            System.out.print("Digite um número: ");
		            numero = leia.nextInt();
		            
		            if (numero != 0 && numero % 3 == 0) {
		                soma += numero;
		                contador++;
		            }
		        } while (numero != 0);
		        
		        if (contador > 0) {
		            double media = (double) soma / contador;
		            System.out.printf("A média de todos os números múltiplos de 3 é: %.1f\n", media);
		        } else {
		            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
		        }
		        System.out.println("Programa encerrado.");
		        
	}
}
