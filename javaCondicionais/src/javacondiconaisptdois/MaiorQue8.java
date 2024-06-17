package javacondiconaisptdois;

import java.util.Scanner;

public class MaiorQue8 {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        int countMaioresQue8 = 0;


        System.out.println("Digite 20 números:");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 8) {
                countMaioresQue8++;
            }
        }

        System.out.println("O número de números maiores que 8 é: " + countMaioresQue8);

        scanner.close();
    }
}
