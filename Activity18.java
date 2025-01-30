package Day3;
import java.util.*;
class Activity0 implements AutoCloseable{
String name;
int age;
String address;
int phone;
public  Activity0(String name,int age,String address,int phone){
this.name=name;
this.age=age;
this.address=address;
this.phone=phone;
}
public void close(){
System.out.println("resources closed");
}

public String toString(){
return name+" "+age+" "+address+" "+phone;
} 
}
public class Activity18{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
try{
	Activity0 ac=new Activity0(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
	System.out.println(ac);
	ac.close();
}
catch(InputMismatchException e){
System.out.println("Datatype error");
}
}
}
