package contact;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	@Test
	public void test() {
		ContactService test = new ContactService();
		Contact A = new Contact("2", "Alexis", "Fuerte", "2544237766", "123 West St.");
		Contact B = new Contact("3", "Parker", "Brown", "2544237776", "456 East St.");
		test.addContact(A);
		test.addContact(B);
		
		ArrayList<String> C = new ArrayList<String>();
		C.add("\nContact: 2\nFirst Name: Lexi\nLast Name: Austin\nNumber: 2544237666\nAddress: 789 North St.");
		test.updateFirstName("2", "Lexi");
		test.updateAddress("2", "789 North St.");
		test.updateLastName("2", "Austin");
		test.updateNumber("2", "2544237666");

		assertEquals(C.toString(),("[" + test.getContacts(0).toString() + "]"));
		
		Contact[] peep = {A, B};
		assertEquals(peep[0].toString(), test.getContacts(0).toString());
		assertEquals(peep[1].toString(), test.getContacts(1).toString());

		test.deleteContact("3");
		assertEquals(1, test.getSize());
		
		
	}

}


//Arrays.asList("2", "Alexis", "Fuerte", "2544237766", "123 West St.").toArray()