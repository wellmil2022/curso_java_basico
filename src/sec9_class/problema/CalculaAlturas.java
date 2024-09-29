package sec9_class.problema;
import java.util.Scanner;
//erro NUllPointerException
public class CalculaAlturas {

	public static void main(String[] args) {
		int n;
		// ERRO: double vet[] = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a quantidade de pessoas: ");
		n = sc.nextInt();
		
		System.out.println("Escreva as alturas: (1.0)");
		// correção - declarar corretamente o vetor
		double[] vet = new double[n];
			for(int i = 0; i < n; i++) {
				vet[i] = sc.nextDouble();
			}
		sc.close();
		double total = 0, media = 0;
		for(int i = 0; i < vet.length; i++) {
			total += vet[i];
		}
		media = total/vet.length;
		System.out.println("Média: "+ media);
	}

}
