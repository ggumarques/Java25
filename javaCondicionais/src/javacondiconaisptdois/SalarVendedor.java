package javacondiconaisptdois;

import java.util.Scanner;

public class SalarVendedor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do vendedor: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o salário fixo do vendedor: R$");
		double salarioFixo = scanner.nextDouble();
		System.out.print("Digite o total de vendas efetuadas pelo vendedor: R$");
		double vendas = scanner.nextDouble();

		double comissao = vendas * 0.15;

		double salarioFinal = salarioFixo + comissao;

		System.out.println("Nome do vendedor: " + nome);
		System.out.println("Salário fixo: R$" + salarioFixo);
		System.out.println("Comissão sobre vendas: R$" + comissao);
		System.out.println("Salário no final do mês: R$" + salarioFinal);
	}
}
