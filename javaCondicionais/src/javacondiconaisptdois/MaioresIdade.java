package javacondiconaisptdois;

import java.util.Scanner;

public class MaioresIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countMaioresIdade = 0;

        System.out.println("Digite as idades das 20 pessoas:");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                countMaioresIdade++;
            }
        }

        System.out.println("O número de pessoas maiores de idade é: " + countMaioresIdade);

        scanner.close();
    }
}
