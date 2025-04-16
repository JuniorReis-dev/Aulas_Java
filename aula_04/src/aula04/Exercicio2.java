package aula04;

import java.util.Scanner;

public class Exercicio2 {
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        int quantidadePares = 0; 
	        int quantidadeImpares = 0;

	        System.out.println("Digite 10 números inteiros:");

	        for (int i = 1; i <= 10; i++) { 
	            System.out.printf("Digite o %dº número: ", i);
	            int numero = leia.nextInt();

	            if (numero % 2 == 0) {
	                quantidadePares++;
	            } else {
	                quantidadeImpares++;
	            }
	        }
	        System.out.println("\nResultado:");
	        System.out.println("Total de números pares: " + quantidadePares);
	        System.out.println("Total de números ímpares: " + quantidadeImpares);
	            }
	        }
