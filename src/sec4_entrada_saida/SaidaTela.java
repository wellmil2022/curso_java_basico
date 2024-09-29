package sec4_entrada_saida;

//import java.util.Locale;

public class SaidaTela {

	public static void main(String[] args) {
		double x = 10.35784;
		//Locate
	//	Locale.setDefault(Locale.US);
		System.out.println("Formatação");
		System.out.printf("%.4f%n", x);
		System.out.println(x);
		
		System.out.println("Resultado ="+ x + " metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		double func = 16.0;
		
		double raiz = Math.sqrt(func);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
		System.out.println("Raiz de 16 = " + raiz);
	}

}
