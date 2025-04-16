package aula_003;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorTotal = 0.00;
		String nomeProduto = "";
		
		System.out.println("------------------------------------------------------\r\n"
				+ "| Código do Produto | Produto           | Preço Unitário |\r\n"
				+ "------------------------------------------------------------\r\n"
				+ "| 1                 | Cachorro Quente   | R$ 10.00       |\r\n"
				+ "| 2                 | X-Salada          | R$ 15.00       |\r\n"
				+ "| 3                 | X-Bacon           | R$ 18.00       |\r\n"
				+ "| 4                 | Bauru             | R$ 12.00       |\r\n"
				+ "| 5                 | Refrigerante      | R$ 8.00        |\r\n"
				+ "| 6                 | Suco de Laranja   | R$ 13.00       |\r\n"
				+ "------------------------------------------------------------\r\n"
				+ "");
		System.out.println("Digite o codigo do produto :");
			int produto = leia.nextInt();;
		System.out.println("digite a quantidade ");
			int quantidade = leia.nextInt();;
			
			switch(produto) {
			case 1:
				valorTotal = 10.00 * quantidade;
				nomeProduto = "Cachorro Quente";
				break;
			case 2:
				valorTotal = 15.00 * quantidade;
				nomeProduto = "X-Salada";
				break;
			case 3:
				valorTotal =  18.00 * quantidade;
				nomeProduto = "X-Bacon";
				break;
			case 4:
				valorTotal = 12.00 * quantidade;
				nomeProduto = "Bauru";
				break;
			case 5:
				valorTotal = 8.00 * quantidade;
				nomeProduto = "Refrigerante";
				break;
			case 6:
				valorTotal = 13.00 * quantidade;
				nomeProduto = "Suco de Laranja";
				break;
			}
		
			System.out.printf("\n Produto: %s",nomeProduto);
			System.out.printf("\n Valor total:  %.2f",valorTotal);
	}

}
