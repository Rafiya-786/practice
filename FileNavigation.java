package Day3;
import java.io.*;

public class FileNavigation {
 
	public static void main(String[] args) {
		
		try {
			File obj=new File("abc.txt");
			System.out.println(obj.getName());
			System.out.println(obj.getParent());
			System.out.println("file exsists"+obj.exists());
			System.out.println("it is a file:"+obj.isFile());
			System.out.println("it is a directory:"+obj.isDirectory());
		
			File fileobj=new File("C://Trainingdec30");
			String[] filelist=fileobj.list();
			for(String s:filelist) {
				System.out.println(s);
			}
			
		}
		catch(Exception e) {
			
		}
 
	}
 
}
 