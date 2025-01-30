package UserApplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import junit.framework.Assert;

//import junit.framework.Assert;

/*class Calculatortests {
	Calculator cal=new Calculator();
void testadd() {
	int expected=10;
	int actual=cal.add(10,11);
	assertEquals(expected, actual);
}
void testsubtract() {
	int expected=5;
	int actual=cal.subtract(9,3);
	assertEquals(expected, actual);
}
void testmultiply() {
	int expected=150;
	int actual=cal.multiply(5,6);
	assertEquals(expected, actual);
}
void testcalculateIntrest() {
	double expected=50;
	double actual=cal.calculateIntrest(20,0.5,0.9);
	assertEquals(expected, actual);
}
}*/
/*import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
class Calculatortests {
static Calculator calculator;
@BeforeEach
void setUp() throws Exception{
	Calculator cal = new Calculator();
	System.out.println("calculator initialized");
}
void cleanUp() {
	calculator = null;
	System.out.println("clean up done");
}
@BeforeAll
public static void getInitialised() {
	calculator = new Calculator();
	System.out.println("before any test case");
}
@AfterAll
public static void clearAll() {
	calculator = null;
	System.out.println("after all test cases");
}
 
 
	@Test
	@CsvSource({"12,23,35","11,10,21"})
	void testdd(int value1,int value2,int expected) {
		//Calculator cal = new Calculator();
		//int exp = 10;
		int actual=calculator.add(value1,value2);
		Assert.assertEquals(expected, actual);
	}
 void testOnlyWindows() {
	 Assumptions.assumeTrue(System.getProperty("os.name").toLowerCase().contains("win"),"test is only application on windows os");
 assertTrue(true,"this test runs only on windows");
 }
	@Test
	void testSub() {
		Calculator cal = new Calculator();
		int exp=19;
		int actual = cal.subtract(19, 0);
		assertEquals(exp,actual);
	}
 
	@Test
	void testMultiply() {
		Calculator cal = new Calculator();
		int exp=5;
		int actual = cal.multiply(5,1);
		assertEquals(exp,actual);
	}
 
	@Test
	void testCalculateInterest() {
		Calculator cal = new Calculator();
		double exp=100.0;
		double actual=cal.calculateIntrest(1000,5,2);
		assertEquals(exp,actual);
	}
 
}*/import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junit.framework.Assert;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
class CalculatorTest {
static Calculator calculator;
@BeforeEach
void setUp() throws Exception{
	Calculator cal = new Calculator();
	System.out.println("calculator initialized");
}
void cleanUp() {
	calculator = null;
	System.out.println("clean up done");
}
@BeforeAll
public static void getInitialised() {
	calculator = new Calculator();
	System.out.println("before any test case");
}
@AfterAll
public static void clearAll() {
	calculator = null;
	System.out.println("after all test cases");
}

	@Test
	void testAdd() {
		Calculator cal = new Calculator();
		int exp = 10;
		int actual=cal.add(5,5);
		assertEquals(exp,actual);
	}
	@ParameterizedTest
	@CsvSource({"12,10,22","11,10,21"})
   void testAdd(int value1,int value2,int exp) {
   	int actual=calculator.add(value1, value2);
   	Assert.assertEquals(exp, actual);
   }
	@Test
	void testOnlyOnWindows(){
		Assumptions.assumeTrue(System.getProperty("os.name").toLowerCase().contains("win"),"test is only applicable on windows OS");
       assertTrue(true,"this test runs only on windows");
	}
	@RepeatedTest(5)
	void testMultiply1() {
		int exp=15;
		int actual=calculator.multiply(3, 5);
		Assert.assertEquals(exp, actual);
	}
	@Test
	void testSub() {
		Calculator cal = new Calculator();
		int exp=19;
		int actual = cal.subtract(19, 0);
		assertEquals(exp,actual);
	}
	@Test
	void testMultiply() {
		Calculator cal = new Calculator();
		int exp=5;
		int actual = cal.multiply(5,1);
		assertEquals(exp,actual);
	}
	@Test
	void testCalculateInterest() {
		Calculator cal = new Calculator();
		double exp=100.0;
		double actual=cal.calculateIntrest(1000,5,2);
		assertEquals(exp,actual);
	}
}
