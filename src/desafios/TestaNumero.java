package desafios;

/**
 * @author wellington
 *
 * Essa classe testa se o numero é primo
 * basta chamar o método estático ehPrimo
 */
public class TestaNumero {
	
	public static boolean ehPrimo(int numero) {
		int contador = 0;
		int aux = numero;
		while (aux > 0) {
			if (numero % aux == 0) {
				contador++;
			}
			aux--;
		}	
		if (contador != 2) {
			return false;
		} else {
			return true;
		}
	}
}
