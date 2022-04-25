package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	public void test() {
		
		Contact test = new Contact();
		test.setFirstName("Alexis");
		test.setLastName("Fuerte");
		test.setAddress("123 West St.");
		test.setNumber("2544237766");
		String output = test.getFirstName();
		String output2 = test.getID();
		String output3 = test.getLastName();
		String output4 = test.getAddress();
		String output5 = test.getNumber();
		assertEquals("Alexis", output);
		assertEquals("Fuerte", output3);
		assertEquals("123 West St.", output4);
		assertEquals("2544237766", output5);
		assertEquals("2", output2);
		
		Contact test2 = new Contact("2", "Alexis", "Fuerte", "2544237766", "123 West St.");
		String dutput = test2.getFirstName();
		String dutput2 = test2.getID();
		String dutput3 = test2.getLastName();
		String dutput4 = test2.getAddress();
		String dutput5 = test2.getNumber();
		assertEquals("Alexis", dutput);
		assertEquals("Fuerte", dutput3);
		assertEquals("123 West St.", dutput4);
		assertEquals("2544237766", dutput5);
		assertEquals("2", dutput2);
	}
}