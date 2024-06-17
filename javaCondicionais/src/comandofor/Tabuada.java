package comandofor;

public class Tabuada {
	public static void main(String[] args) {
		int numero = 8;

		for (int mult = 0; mult <= 10; mult++) { // mult começa por 0, vai até 10 e vai de um em um
			int resultado = numero * mult;
			System.out.format("%nA tabuada do %s x %s = %s", numero, mult, resultado);
		}
	}
}