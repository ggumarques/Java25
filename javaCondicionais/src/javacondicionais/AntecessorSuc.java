package javacondicionais;

import java.util.Scanner;

public class AntecessorSuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        int antecessor = valor - 1;
        int sucessor = valor + 1;

        System.out.println("Valor: " + valor);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
    }
}
