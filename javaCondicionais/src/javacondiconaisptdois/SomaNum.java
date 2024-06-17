package javacondiconaisptdois;

public class SomaNum {
	public static void main(String[] args) {
		int soma = 0;

		for (int i = 1; i <= 15; i++) {
			soma += i;
		}

		System.out.println("A soma dos números de 1 a 15 é: " + soma);
	}
}
