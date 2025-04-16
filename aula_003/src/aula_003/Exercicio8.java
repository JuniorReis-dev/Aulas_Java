package aula_003;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float saldo = 1000;
		System.out.println("---------------------------------------");
        System.out.println("| Código | Operação                   |");
        System.out.println("---------------------------------------");
        System.out.println("| 1      | Saldo                      |");
        System.out.println("| 2      | Saque                      |");
        System.out.println("| 3      | Depósito                   |");
        System.out.println("---------------------------------------");
        int codigo = leia.nextInt();	
        
        switch(codigo) {
		case 1:
			System.out.printf("Saldo: %.2f",saldo);
		break;
		
		case 2:
			System.out.println("digite o valor");
			float valor = leia.nextFloat();
			if (valor < saldo) {
				float saldoNovo = saldo - valor;
				saldo = saldoNovo ;
				System.out.printf("saque confirmado seu novo saldo é : %.2f",saldo);}
			else {System.out.println("saldo Saldo Insuficiente!");}
	        break;
		case 3:
			System.out.println("digite o valor");
			  float deposito = leia.nextFloat();
				float saldoNovo = saldo + deposito;
				saldo = saldoNovo ;
				System.out.printf("saque confirmado seu novo saldo é : %.2f",saldo);
			break;
		default:
			System.out.println("Opção inválida!");
			break;}
        leia.close();
        
}
	}
