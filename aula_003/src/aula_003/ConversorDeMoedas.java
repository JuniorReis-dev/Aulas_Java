package aula_003;

import java.util.Scanner;

public class ConversorDeMoedas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valorConvertido = 0.0;
		String moeda = "";
		System.out.println("*************************************");
		System.out.println("Conversor de moedas");
		System.out.println("*************************************");
		System.out.println("1- converter para dolar(US$)");
		System.out.println("2- converter para euro(EU$)");
		System.out.println("2- converter para pesos($)");
		System.out.println("*************************************");
		System.out.println("Digite a opçao desejada: ");
		int opcao = leia.nextInt();
		System.out.println("Digite o valor em Reais (R$)");
		double valor = leia.nextDouble();
				
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "Dólar";
			break;
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro";
			break;
		case 3:
			valorConvertido = valor / 0.0049;
			moeda = "Peso Argentino";
			break;
		default:
			System.out.println("Opção inválida!");
			leia.close();
			return; // Sair do programa
		}
		
		System.out.printf("Valor convertido em %s: %.2f", moeda, valorConvertido);
		 
		leia.close();
		
	}

}
