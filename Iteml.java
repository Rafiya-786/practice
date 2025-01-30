package Day3;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.stream.Collectors;
class Item{
	private int itemId;
	private String itemName;
	private double price;
	Item(int itemId,String itemName,double price){
		this.itemId=itemId;
		this.itemName=itemName;
		this.price=price;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
}
public class Iteml  {
	/*public static double getDiscount(Supplier<Double>supplier) {
		return supplier.get();
	}
	 static void display(Consumer<Item>consumer,Item ref) {
		consumer.accept(ref);
	}*/
	public static void main(String[] args) {
		//Comparator<Item> comparator=(p1,p2)->p1.getItemName().compareTo(p2.getItemName());
		//Comparator<Item> comparator=(p1,p2)->p1.getPrice()!=p2.getPrice()?p1.getPrice()>p2.getPrice()?1:-1:0;
		//Predicate<Double>predicate=(num)->num>200;
		List<Item>lst=new ArrayList<>();
	lst.add(new Item(101,"Papaya",220));
	lst.add(new Item(102,"Guava",100));
	lst.add(new Item(103,"Apple",90));
	lst.add(new Item(104,"Queen",350));
	lst.sort(Comparator.comparing(Item::getItemName).thenComparing(Item::getPrice));
	//lst.forEach(System.out::println);
	Iterator<Item> it=lst.iterator();
	while(it.hasNext()) {
		Item ref=it.next();
		System.out.println(ref);
		}
		//display((REF)->System.out.println("Price for "+ref.getItemName()+"---->"+ref.getPrice()),ref);
		
		//double Price=ref.getPrice();
		//System.out.println(getDiscount(()->Price*0.05));
		//if(predicate.test(Price)) {
	
		//}*/
	//System.out.println(lst);
	//}
	
	}
}



