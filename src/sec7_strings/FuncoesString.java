package sec7_strings;



public class FuncoesString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC DEFG     ";
		String nome = "nome";
		System.out.println("Original: "+ original+"-");
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		// String s03 = original.;
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x') ;
		String s07 = original.replace("abc", "xyz") ;
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
//		char letra = original.charAt(0);
		StringBuilder invertido = new StringBuilder();
		
		for(i=nome.length()-1; i >= 0; i--) {
			System.out.println(nome.charAt(i));
			invertido.append(nome.charAt(i));
		}
		
		
		System.out.println("Invertido = "+invertido);
		System.out.println("toLowerCase: -"+s01+"-");
		System.out.println("toUpperCase: -"+s02+"-");
		System.out.println("trim: "+s03+"-");
		System.out.println("substring 2: "+s04);
		System.out.println("substring 2 e 9: "+s05);
		System.out.println("replace a - x: "+s06);
		System.out.println("replace abc - xyz: "+s07);
		System.out.println("Indexof bc: "+ i+ " e Last bc: "+ j );
		
		String data = "1985-04-24";
		String[] vetor = data.split("-");
		String ano = vetor[0];
		String mes = vetor[1];
		String dia = vetor[2];
		System.out.println("Data: "+dia+"/"+mes+"/"+ano);
		System.out.printf("Data: %s/%s/%s\n",dia,mes,ano);
		
		// Split
		String testeSplit = "potato apple lemon orange";
		String[] vectorSplit = testeSplit.split(" ");
		//enhanced-for
		for (String fruit : vectorSplit) {
			System.out.println(fruit);
		}
		
	}

}