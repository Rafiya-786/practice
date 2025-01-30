package Day3;
import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;
abstract class Employeee{
	abstract void setSalary(int salary);
	abstract int getSalary();
	abstract void setGrade(String grade);
	abstract String getGrade();
	void label() {
		System.out.println("Employee's data:\n");
	}
}
class Engineer extends Employeee{
	private int salary;
	private String grade;
public void Engineer1(int salary,String grade) {
	this.salary=salary;
	this.grade=grade;
}
public void setSalary(int salary) {
	this.salary=salary;
}
public int getSalary() {
	return salary;
}
public void setGrade(String grade) {
	this.grade=grade;
}
public String getGrade() {
	return grade;
}
}
class Manager extends Employeee{
	private int salary;
	private String grade;
	public void Manager1(int salary,String grade) {
		this.salary=salary;
		this.grade=grade;	
	}
public void setSalary(int salary) {
	this.salary=salary;
}
public int getSalary() {
	return salary;
}
public void setGrade(String grade) {
	this.grade=grade;
}
public String getGrade() {
	return grade;
}
}
public class Activity21 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String sub = sc.nextLine();

int n = Integer.parseInt(sub);

for (int i = 0; i < n; i++) {

String[] input = sc.nextLine().split(" ");

if (input[0].equals("ENGINEER")) {

Engineer e = new Engineer();

e.setSalary(Integer.parseInt(input[2]));

e.setGrade(input[1]);

e.label();

System.out.println("GRADE : " + e.getGrade());

System.out.println("SALARY : " + e.getSalary());

}

if (input[0].equals("MANAGER")) {

Manager e = new Manager();

e.setSalary(Integer.parseInt(input[2]));

e.setGrade(input[1]);

e.label();

System.out.println("GRADE : " + e.getGrade());

System.out.println("SALARY : " + e.getSalary());

}

}

}

}