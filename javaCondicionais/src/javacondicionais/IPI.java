package javacondicionais;

import java.util.Scanner;

public class IPI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a porcentagem do IPI: ");
		double ipi = scanner.nextDouble();

		System.out.print("Digite o valor da peça 1: ");
		double valor1 = scanner.nextDouble();
		System.out.print("Digite a quantidade de peças 1: ");
		int quant1 = scanner.nextInt();

		System.out.print("Digite o valor da peça 2: ");
		double valor2 = scanner.nextDouble();
		System.out.print("Digite a quantidade de peças 2: ");
		int quant2 = scanner.nextInt();

		double valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

		System.out.println("Valor total a ser pago: R$" + valorTotal);
	}
}
