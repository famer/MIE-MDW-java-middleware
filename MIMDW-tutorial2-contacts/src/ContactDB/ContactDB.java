package ContactDB;

import java.util.ArrayList;

import Contact.Contact;

public class ContactDB {
	
	private static ContactDB instance =null;
	
	public static ContactDB getInstance() {
		
		if(instance == null)
			instance = new ContactDB();
		
		return instance;
	}
	
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public ArrayList<Contact> list() {
		return contacts;
	}
	
	public void add ( Contact contact ) {
		contacts.add(contact);
	}
	
	public void remove ( Contact contact ) {
		contacts.remove(contact);
	}
	
	
}
