package UserApplication;

public class Calculator {
public int add(int a,int b) {
	return a+b;
}
public int subtract(int a,int b) {
	return a-b;
}
public int multiply(int a,int b) {
	return a*b;
}
public double calculateIntrest(double principal,double rate,double time) {
	return (principal*rate*time)/100;
}
}
