package javacondiconaisptdois;

import java.util.Scanner;

public class MenorIdade {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        System.out.println("Digite os nomes e idades das 10 pessoas:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();

            System.out.print("Idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNova);

        scanner.close();
    }
}
