package Day3;
import java.util.Hashtable;
public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<String,Integer> hashtable=new Hashtable<>();
		hashtable.put("Alice",30);
		hashtable.put("Bob",10);
		hashtable.put("Charlie",20);
		System.out.println("Alice age:" +hashtable.get("Alice"));
		if(hashtable.containsKey("Bob")) {
			System.out.println("Bob age:" +hashtable.get("Bob"));	
		}
		hashtable.remove("Charlie");
		System.out.println("Charlie age:" +hashtable.get("Charlie"));
		

	}

}
