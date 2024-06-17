package comandofor;

import java.util.Scanner;

public class ForIf {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int par = 0;
		int impar = 0;
		for (int cont = 1; cont <= 10; cont++) {

			System.out.println("Digite um número: ");
			int num = scanner.nextInt();
			
			if (num % 2 == 0) {
	            System.out.println("O número é par");
	            par = par +1;
	        }else if (num % 3 == 0) {
	        	System.out.println("O número é impar.");
	        	impar = impar +1;
	        }

		}
		
		System.out.format("%nNúmeros pares: %s ", par);
		System.out.format("%nNúmeros ímpar: %s ", impar);
	}

}
