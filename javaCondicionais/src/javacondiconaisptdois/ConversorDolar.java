package javacondiconaisptdois;

import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("O valor em reais é: R$" + valorEmReais);

        scanner.close();
    }
}
