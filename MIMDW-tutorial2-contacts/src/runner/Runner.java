package runner;

import Contact.Contact;
import ContactDB.ContactDB;

public class Runner {
	public static ContactDB DB = new ContactDB();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ContactDB DB = new ContactDB();
		
		Contact contact1 = new Contact("Tim", "tatartim@fit.cvut.cz");
		DB.add(contact1);
		
		
		Contact contact2 = new Contact("Jimm", "Jimm@fit.cvut.cz");
		DB.add(contact2);
		
		Contact contact3 = new Contact("Chuck", "Chuck@fit.cvut.cz");
		DB.add(contact3);
		
		System.out.println(DB.list().toString());
		
		DB.remove(contact3);
		
		System.out.println(DB.list().toString());
	}

}
