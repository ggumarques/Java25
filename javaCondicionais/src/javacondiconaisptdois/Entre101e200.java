package javacondiconaisptdois;

import java.util.Scanner;

public class Entre101e200 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int countEntre101e200 = 0;
        int countMaioresQue200 = 0;

        System.out.println("Digite 20 números:");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero >= 101 && numero <= 200) {
                countEntre101e200++;
            } else if (numero > 200) {
                countMaioresQue200++;
            }
        }

        System.out.println("Números entre 101 e 200: " + countEntre101e200);
        System.out.println("Números maiores que 200: " + countMaioresQue200);

        scanner.close();
    }
}
