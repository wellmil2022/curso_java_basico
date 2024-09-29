package sec5_condicional;

import java.util.Scanner;

public class MostraODia {

	public static void main(String[] args) {
		int numero;
		String dia = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva quantos minutos:");
		numero = entrada.nextInt();
		
		switch (numero){
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;	
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor Inválido";
			break;
		}
		System.out.println("Hoje é :"+ dia);
		entrada.close();
	}

}
