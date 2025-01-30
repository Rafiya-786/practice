package Day3;
import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate=(num)->num%2==0;
		/*System.out.println(predicate.test(100));
		System.out.println(predicate.test(200));
		System.out.println(predicate.test(203));
		System.out.println(predicate.test(104));*/
		int []arr= {12,23,11,19,55,67,22,53};
		for(int a:arr) {
			System.out.println(a);
			if(predicate.test(a)) {
				System.out.println("is even");
			}
			else {
				System.out.println("is odd");
			}
		}

	}

}
