/**
 * 
 */
package entrada_saida;

import java.util.Scanner;

/**
 * @author wellington
 *
 */
public class EntradaDeTexto {

	/**
	 * 
	 */
	public EntradaDeTexto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		System.out.println("Digite o seu texto: ");
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
