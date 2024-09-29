package sec5_condicional;

public class OperadorTernario {

	public static void main(String[] args) {
		double preco = 34.5;
		double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.2;

		System.out.printf("%.2f%n", desconto);

	}

}
