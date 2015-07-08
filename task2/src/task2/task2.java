package task2;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static void transferMoney ( Person from, Person to, int amount) {
		from.sub(amount);
		to.add(amount);
		
	}
	
	public static void add ( Person to, int amount) {
		to.add(amount);
	}
	
	public static void sub ( Person from, int amount) {
		from.sub(amount);
	}

}


