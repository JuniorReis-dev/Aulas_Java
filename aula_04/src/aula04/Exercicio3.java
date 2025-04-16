package aula04;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        int quantidade21 = 0;
	        int quantidade50 = 0;
	        int contador = 1;
	        while (contador <= 10) { 
	            System.out.print("Digite uma idade: ");
	            int numero = leia.nextInt();
	            if (numero < 0 || numero > 120) {
	            	System.out.println("numero invalido!");
	            	break;
	            }
	            if (numero < 21) { 
	                quantidade21++;
	            } else if (numero > 50) { 
	                quantidade50++;
	            }

	            contador++; 
	        }
	        System.out.println("\nTotal de pessoas com menos de 21 anos: " + quantidade21);
	        System.out.println("Total de pessoas com mais de 50 anos: " + quantidade50);
	        leia.close();
     }

}
