package comandofor;

public class Fatorial {
	public static void main(String[] args) {
		
		int num = 8; // Número para o qual queremos a tabuada
		int fat = 1; // Inicializamos o valor do fatorial como 1

		for (int i = 1; i <= num; i++) {
			fat *= i; 
		}

		System.out.format("%nO fatorial de %s é: %s", num, fat);
	}
}
