package Day3;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Function;
class Coffee{
	private String name;
	private int price;
	Coffee(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", id=" + price + "]";
	}
}


public class StreamDemo {

	public static void main(String[] args) {
		//List<Integer> numberList=Arrays.asList(12,23,34,45,56,67);
		//IntStream numberStream=IntStream.of(12,23,34,45,56,67,78);
		//Stream<Integer> stream=numberList.stream();
		//numberStream.forEach(e->System.out.println(e));
		/*Stream.Builder<String> streamBuilder=Stream.builder();
		streamBuilder.add("Router");
		streamBuilder.add("switch");
		streamBuilder.add("cables");
		streamBuilder.add("lines");
		Stream stream=streamBuilder.build();
		stream.forEach(e->System.out.println(e));*/
		/*List<String> nameList=Arrays.asList("Peter","sam","erric");
		Stream<String> nameStream=nameList.stream();
		nameStream.map((e)->e.toUpperCase()).forEach((e)->System.out.println(e));
		//nameStream.filter(e->e.length()>=3).forEach((e)->System.out.println(e));*/
		List<Coffee> coffeeList=Arrays.asList(new Coffee("Expresso",200),
				new Coffee("Latte",100),
				new Coffee("Capacchino",300));
		Stream<Coffee> coffeeStream=coffeeList.stream();
		Predicate<Coffee> filterByPrice=(e)->e.getPrice()>200;
		Function<Coffee,String>displayCoffee=(e)->e.getName().toUpperCase()+","+e.getPrice();
		coffeeStream.filter(filterByPrice).map(displayCoffee).forEach((e)->System.out.println(e));
		
		
	}

}
