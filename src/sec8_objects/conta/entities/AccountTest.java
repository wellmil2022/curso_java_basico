package sec8_objects.conta.entities;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class AccountTest {

	Account conta1 = new Account(1, "Wellington");
	
	
//	@Test
//	void testSetName() {
//		assertEquals("Inclui o nome", "Wellington", conta1.getName());
//	}

	@Test
	void testGetName() {
		conta1.setName("Marcos");
		assertEquals("Veja o nome", "Marcos", conta1.getName());
	}


}
