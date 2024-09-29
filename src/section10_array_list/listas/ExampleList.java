package section10_array_list.listas;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Maria");
		lista.add("Bob");
		lista.add("Carlos");
		lista.add("Well");
		lista.add("Marcos");
		lista.add(2, "Jovem");
		
		System.out.println("Tamanho: "+lista.size());
//		for(String nome : lista) {
//			System.out.println(nome);
//		}
		System.out.println(lista);
		
		lista.remove("Maria");
		
		System.out.println("Tamanho: "+lista.size());
		System.out.println(lista);
		
		lista.remove(0);
		System.out.println("Tamanho: "+lista.size());
		System.out.println(lista);
//		for(String nome : lista) {
//			System.out.println(nome);
//		}
		System.out.println("--------");
		lista.add("Maria");
		lista.add("Bob");
		System.out.println(lista);
		// lambda - predicado
		lista.removeIf(item -> item.charAt(0) == 'M');
		System.out.println("Tamanho: "+lista.size());
		System.out.println(lista);
		System.out.println("--------");
		System.out.println(lista.indexOf("Bob"));
		System.out.println(lista.indexOf("Maria"));
		//filtro - stream
		System.out.println("--------");
		List<String> lista2 = lista.stream().filter(x -> x.charAt(0) == 'C').toList();
		System.out.println(lista2);
		
		//busca
		System.out.println("--------");
		String name = lista.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
	}
}
