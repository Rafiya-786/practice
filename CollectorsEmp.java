package Day3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Employeeee {
	private String employeeName;
	private String department;
	private double salary;
	public Employeeee(String employeeName, String department, double salary) {
		super();
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", department=" + department + ", salary=" + salary + "]";
	}
 
}
public class CollectorsEmp{
	 public static void main(String[] args) {
		 List<Employeeee> employeeList=Arrays.asList(new Employeeee("A","sales",1200),
				 new Employeeee("B","training",15000),
				 new Employeeee("C","admin",12000),
				 new Employeeee("D","devops",13000),
				 new Employeeee("A","devops",16000));
		 Stream<Employeeee> employeeStream=employeeList.stream();
		 Collector<Employeeee,?,List<Employeeee>> collector=Collectors.toList();
		 //Or
		 List<Employeeee> devopsList=employeeStream.filter((e)->e.getDepartment().equals("devops")).collect(Collectors.toList());
		 devopsList.forEach(System.out::println);
	 }
	
}
 