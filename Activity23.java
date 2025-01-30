package Day3;
import java.util.*;
class Library{
	private int number_of_books;
	private String name;
	private Map<String,Integer>bookGenres;
	public void setNumber_of_books(int number_of_books) {
		this.number_of_books=number_of_books;
	}
	public int getNumber_of_books() {
		return number_of_books;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setBookGenres(Map<String,Integer>bookGenres) {
		this.bookGenres=bookGenres;
	}
	public Map<String,Integer> getBookGenres(){
		return bookGenres;
	}
	
}
class Activity23 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String sub = sc.nextLine();

int n = Integer.parseInt(sub);

for (int i = 0; i < n; i++) {

String name = sc.nextLine();

Library library = new Library();

library.setName(name);

System.out.println("Library with name : " + library.getName() + " is started");


Integer numberOfBooks = Integer.parseInt(sc.nextLine());

library.setNumber_of_books(numberOfBooks);

System.out.println("It contains " + library.getNumber_of_books() + " books");


Integer bookGenresCount = Integer.parseInt(sc.nextLine());

Map<String, Integer> bookGenresMap = new LinkedHashMap<>();

System.out.println("It contains books with following genres :");

for (int j = 0; j < bookGenresCount; j++) {

String[] bookGenres = sc.nextLine().split(" ");

bookGenresMap.put(bookGenres[0], Integer.parseInt(bookGenres[1]));

}

library.setBookGenres(bookGenresMap);

Map<String, Integer> temp = library.getBookGenres();


for (Map.Entry<String, Integer> t : temp.entrySet()) {

System.out.println(t.getKey() + " " + t.getValue());

}

}

}

}