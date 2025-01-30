package Day3;
import java.util.*;
public class Activity10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int target=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=binarysearch(arr,target);
		System.out.println(result);

	}
	public static int binarysearch(int[]arr,int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(target>arr[mid]) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}

}
