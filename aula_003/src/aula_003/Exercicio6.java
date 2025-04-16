package aula_003;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				
				double novoSalario = 0.0;
				System.out.println("Digite o Nome do Colaborador :");
				String nome = leia.nextLine();
        		System.out.println("Por favor, insira o código do cargo: ");
                System.out.println("| Código do Cargo | Cargo           | Percentual do Reajuste |");
                System.out.println("-----------------------------------------------------");
                System.out.println("| 1               | Gerente         | 10%                   |");
                System.out.println("| 2               | Vendedor        | 7%                    |");
                System.out.println("| 3               | Supervisor      | 9%                    |");
                System.out.println("| 4               | Motorista       | 6%                    |");
                System.out.println("| 5               | Estoquista      | 5%                    |");
                System.out.println("| 6               | Técnico de TI   | 8%                    |");
                System.out.println("-----------------------------------------------------");
                int codigo = leia.nextInt();
                System.out.println("Digite o Valor do salario:");
                double salario = leia.nextDouble();
                
                switch(codigo) {
    				case 1:
    				novoSalario = salario + (0.10 * salario);
    				break; 
    				case 2:
        				novoSalario = salario + (0.7 * salario);
        			break; 
    				case 3:
    					novoSalario = salario + (0.9 * salario);
    					break; 
    				case 4:
    					novoSalario = salario + (0.6 * salario);
    					break; 
    				case 5:
    					novoSalario = salario + (0.5 * salario);
    					break; 
    				case 6:
    					novoSalario = salario + (0.8 * salario);
    					break; 
                }
                
                System.out.printf("\n Nome do colaborador: %s",nome);
    			System.out.printf("\n Cargo: %d",codigo);
    			System.out.printf("\n salario: %.4f",novoSalario);
                	
                	
                
                              
	}

}
