package Day3;
import java.util.*;
abstract class Calculator{
	abstract int add(int a,int b);
}
class Adder extends Calculator{
	 int add(int a,int b) {
		System.out.println("Adding integers: "+a+" "+b);
		return a+b;
	}
	
}
class Multiplier{
	 int multiply(int a,int b,Calculator calculator) {
		int result=a;
		for(int i=1;i<b;i++) {
			result=calculator.add(result, a);
		}
return result;	
	}
}

public class Activity16 {

private static final Scanner INPUT_READER = new Scanner(System.in);

private static final Calculator CALCULATOR = new Adder();


private static void testAddition(int a, int b) {

System.out.println("Sum = " + CALCULATOR.add(a, b));

}


private static void testMultiplication(int a, int b) {

System.out.println("Product = " + new Multiplier().multiply(a, b, CALCULATOR));

}


public static void main(String[] args) {

int a = Integer.parseInt(INPUT_READER.nextLine());

int b = Integer.parseInt(INPUT_READER.nextLine());


System.out.println("Testing Addition");

testAddition(a, b);


System.out.println("\nTesting Multiplication");

testMultiplication(a, b);

}

}
