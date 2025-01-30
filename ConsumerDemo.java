package Day3;
import java.util.function.Consumer;
public class ConsumerDemo {
	void analyzeText(Consumer<String>consumer,String str) {
		consumer.accept(str);
	}
	

	public static void main(String[] args) {
		ConsumerDemo obj=new ConsumerDemo();
		obj.analyzeText((str)->{System.out.println(str.length());
		String[] strarray=str.split(" ");
		System.out.println("No of words here "+strarray.length);
		},"Hello World");
		
		
		/*Consumer<String> consumer=(str)->{
			System.out.println(str);
			System.out.println(str.length());
			System.out.println(str.toUpperCase());	
		};
		consumer.accept("Hello world");*/

	}

}
