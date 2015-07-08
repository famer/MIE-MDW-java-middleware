package task1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string_s = "bank_account: XXXX-XXXX/XXXX \n owner_name: NAME \n owner_surname: SURNAME \n expiration: JAN/2020";
		
		System.out.println(string_s);
		String[] array = string_s.split("\n");
		
		// Source data
		String string1 = "bank_account: XXXX-XXXX/XXXX";
		String string2 = "owner_name: NAME";
		String string3 = "owner_surname: SURNAME";
		String string4 = "expiration: JAN/2020";
		
		// Account extraction
		String account = string1.substring(string1.indexOf(": ") + 2);
		String accountFirstPart = account.substring(0, account.indexOf("/"));
		String accountSecondPart = account.substring(account.indexOf("/") + 1);
		
		// Owner extraction
		String ownerName = string2.substring(string2.indexOf(": ") + 2);
		String ownerSurname = string3.substring(string3.indexOf(": ") + 2);
		String ownerFullName = ownerName + " " + ownerSurname;
		
		// Date extraction
		String expDate = string4.substring(string4.indexOf(": ") + 2);
		
		System.out.println("<bankAccount>");
		
		System.out.println("\t" + String.format("<accountPrefix>%s</accountPrefix>", accountFirstPart));
		System.out.println("\t" + String.format("<accountSuffix>%s</acccountSuffix>", accountSecondPart));
		System.out.println("\t" + String.format("<owner>%s</owner>", ownerFullName));
		System.out.println("\t" + String.format("<exp>%s</exp>", expDate));
		System.out.println("</bankAccount>");
		
	}

}
