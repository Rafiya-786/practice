package Day3;
import java.util.*;
class Employee{
	private int eid;
	private String name;
   public  Employee(int eid,String name){
    	this.eid=eid;
    	this.name=name;
    }
   public String toString()
{
	   return eid+" "+name;
	   }
   public void setname(String name) {
	   this.name=name;
   }
   public String getName() {
	   return name;
   }
   public void setId(int eid) {
	   this.eid=eid;
   }
   public int getId() {
	   return eid;
   }
@Override
public int hashCode() {
	return Objects.hash(eid, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return eid == other.eid && Objects.equals(name, other.name);
}
   
}
public class Activity6 {

	public static void main(String[] args) {
Stack <Employee>[] st=new Stack[31];
for(int i=0;i<31;i++) {
	st[i]=new Stack<>();
}
Employee emp1=new Employee(101,"Bob");
Employee emp2=new Employee(102,"Alice");
Employee emp3=new Employee(103,"Jack");
st[0].push(emp1);
st[0].push(emp2);
st[1].push(emp3);
st[1].push(emp1);
st[1].push(emp2);
st[2].push(emp2);
Map<Employee,Integer> mp=new HashMap<>();
for(int i=0;i<31;i++) {
	Stack<Employee> s=st[i];
	while(!s.isEmpty()) {
		Employee e=s.pop();
		mp.put(e,mp.getOrDefault(e,0)+1);
	}
}
for(Map.Entry<Employee,Integer> mentry :mp.entrySet()) {
	System.out.println(mentry.getKey()+" "+mentry.getValue());
}
	

	}

}

