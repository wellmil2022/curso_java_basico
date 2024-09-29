package sec7_strings;

import java.util.Scanner;

public class NumeroMaximo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("entre com tres números: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		int maior = max(a,b,c);
		showResult(maior);
		
		entrada.close();
	}
	
	public static void showResult(int valor) {
		System.out.printf("Retorno: %s",valor);
	}

	public static int max(int x, int y, int z) {
		int maior;
		if (x>y && x>z) {
			maior=x;
		} else if(y>x && y>z) {
			maior=y;
		}else {
			maior=z;
		}
		return maior;
	}

}
