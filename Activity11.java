package Day3;
import java.util.*;
public class Activity11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		String s=twoSum(arr,target);
		System.out.println(s);
	}
	public static String twoSum(int[]arr,int target) { 
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]+arr[j]==target) {
						return i+" "+j; 
					}
				}
				
}
			
		
			return "-1";	
	}
	
}