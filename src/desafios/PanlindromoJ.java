package desafios;

public class PanlindromoJ {

	public static String inverter(String palavra) {
		StringBuilder invertida = new StringBuilder();
		for (int i = palavra.length()-1;i >=0; i--) {
			invertida.append(palavra.charAt(i));
		}
		
		return invertida.toString();
		
	}
	
	public static Boolean ehPanlindromo(String nome){
		if(nome.equals(inverter(nome))) {
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeEspaco = "socorram me subi no onibus em marrocos";
		String nome = nomeEspaco.replaceAll("\\s", "");
// @formatter:on

		if (ehPanlindromo(nome)) {
			System.out.println("A palavra "+nomeEspaco+ " é um panlídromo");
		} else {
			System.out.println("A palavra "+ nomeEspaco +" não é um panlídromo");
		}

	}

}
