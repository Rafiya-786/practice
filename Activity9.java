package Day3;
import java.util.*;
public class Activity9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
         Arrays.sort(arr1);
         //System.out.println(arr1);
         Arrays.sort(arr2);
         //System.out.println(arr2);
         String arr3=new String(arr1);
         String arr4=new String(arr2);
         if(arr3.equals(arr4)) {
        	 System.out.println("Yes");
         }
         else {
        	 System.out.println("No");
         }

	}

}
