package section10_array_list;

public class ExampleForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		// for
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("---------------");
		
		//foreach
		/*
		 * para cada item do tipo string
		 * no vetor vect faça:
		 */
		for (String item : vect) {
			System.out.println(item);
		}

	}

}
