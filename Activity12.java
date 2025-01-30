package Day3;
import java.util.*;
public class Activity12 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
int count=1;
for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++) {
		if(arr[i]==arr[j]) {
			count++;
		}
	}
	if(count==1) {
		System.out.println(arr[i]);
	}
}
	}

}
