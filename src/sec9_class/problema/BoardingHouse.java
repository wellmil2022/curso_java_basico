package sec9_class.problema;

import java.util.Locale;
import java.util.Scanner;

public class BoardingHouse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		PeopleHouse[] vect = new PeopleHouse[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the number of rooms will be rented: ");
		// n = quantity
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			//limpar o buffer
			sc.nextLine();
			System.out.println("Write the name: ");
			String name = sc.nextLine();
			System.out.println("Write the email: ");
			String email = sc.nextLine();
			System.out.println(" Choice the room: ");
			int room = sc.nextInt();
			PeopleHouse people = new PeopleHouse(name, email);
			vect[room] = people;
			
		}
		sc.close();
		
		System.out.println("Busy Rooms:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println("Room: "+i+" - "+vect[i].toString());
			}
		}

	}

}
