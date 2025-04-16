package aula_003;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a Primeira palavra :");
        String palavra01 = leia.nextLine();
        
        System.out.println("Digite a Segunda palavra :");
        String palavra02 = leia.nextLine();
        
        System.out.println("Digite a Terceira palavra :");
        String palavra03 = leia.nextLine();

        
        if (palavra01.equalsIgnoreCase("Vertebrado")) {
            if (palavra02.equalsIgnoreCase("ave")) {
                if (palavra03.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else if (palavra03.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (palavra02.equalsIgnoreCase("mamifero")) {
                if (palavra03.equalsIgnoreCase("onivoro")) {
                    System.out.println("homen");
                } else if (palavra03.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (palavra01.equalsIgnoreCase("Invertebrado")) {
            if (palavra02.equalsIgnoreCase("inseto")) {
                if (palavra03.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else if (palavra03.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (palavra02.equalsIgnoreCase("anelideo")) {
                if (palavra03.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (palavra03.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

      
    }

}

