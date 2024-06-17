package javacondicionais;

import java.util.Scanner;

public class CEF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo médio do cliente: ");
        double saldoMedio = scanner.nextDouble();

        double credito;
        if (saldoMedio <= 500) {
            credito = 0;
        } else if (saldoMedio <= 1000) {
            credito = saldoMedio * 0.30;
        } else if (saldoMedio <= 3000) {
            credito = saldoMedio * 0.40;
        } else {
            credito = saldoMedio * 0.50;
        }

        System.out.println("Saldo médio: R$" + saldoMedio);
        System.out.println("Valor de crédito: R$" + credito);
    }
}

