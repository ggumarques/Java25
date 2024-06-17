package javacondiconaisptdois;

import java.util.Scanner;

public class Entre0e100 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int countNumerosEntre0e100 = 0;

        System.out.println("Digite 20 números:");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                countNumerosEntre0e100++;
            }
        }

        System.out.println("O número de números entre 0 e 100 é: " + countNumerosEntre0e100);

    }
}

