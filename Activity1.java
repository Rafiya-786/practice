package Day3;
import java.util.*;
class Node1{
	Employee employee;
	Node1 next;
	Node1(Employee employee){
		this.employee=employee;
		this.next=null;
	}
}
class Employee{
	 int eid;
	 String empname;
	public Employee(int eid,String empname) {
		this.eid=eid;
		this.empname=empname;
	}
	public String toString() {
		return eid+" "+empname;
	}
}
public class Activity1 {
Node1 START;
Activity1(){
	START=null;
}
public void add(int eid,String empname) {
	Employee emp=new Employee(eid,empname);
	Node1 n=new Node1(emp);
		if(START==null) {
			n.next=START;
			START=n;
			return;
		}
		Node1 curr;
		for(curr=START;curr.next!=null;curr=curr.next) {
	}
		curr.next=n;
}
public void traverse() {
	Node1 curr;
	for(curr=START;curr!=null;curr=curr.next) {
		System.out.println(curr.employee);
	}
}
public void sortById() {
	boolean swap;
	do {
		swap=false;
		Node1 Temp=START;
		while(Temp!=null&&Temp.next!=null) {
			if(Temp.employee.eid>Temp.next.employee.eid) {
				Employee empTemp=Temp.employee;
				Temp.employee=Temp.next.employee;
				swap=true;
			}
			Temp=Temp.next;
		}
}
	while(swap); 
}
public void sortByName() {
	boolean swap;
	do {
		swap=false;
		Node1 Temp=START;
		while(Temp!=null&&Temp.next!=null) {
			if(Temp.employee.empname.compareTo(Temp.next.employee.empname)>0) {
				Employee empTemp=Temp.employee;
				Temp.employee=Temp.next.employee;
				Temp.next.employee=empTemp;
				swap=true;
			}
			Temp=Temp.next;
		}
}
	while(swap); 
	
}

	public static void main(String[] args) {
		Activity1 obj=new Activity1();
		obj.add(101,"Rafiya");
		obj.add(102,"Vandana");
		obj.add(103,"Ashritha");
		obj.add(104,"Pranavi");
		obj.traverse();
		System.out.println("Sorting by using employee id");
		obj.sortById();
		obj.traverse();
		System.out.println("Sorting by using employee name ");
		obj.sortByName();
		obj.traverse();
		
	}

}
