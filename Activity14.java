package Day3;
import java.util.*;
public class Activity14 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
Arrays.sort(arr);
int[] arr1=Arrays.copyOfRange(arr, n-k, n);
int sum=0;
for(int i=0;i<k;i++) {
	sum+=arr1[i];
}
System.out.println(sum);
	}

}
