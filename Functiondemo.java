package Day3;
import java.util.function.Function;
public class Functiondemo {
public static void printLength(Function<String,Integer>function,String str) {
	System.out.println(function.apply(str));
}
	public static void main(String[] args) {
		printLength((str)->str.length(),"Hello world");
		printLength((str)->(int)str.toCharArray()[0],"Hello world");
		printLength((str)->str.split(" ").length,"Hello world");
	}

}
