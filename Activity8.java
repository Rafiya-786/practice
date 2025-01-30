package Day3;
import java.util.*;
public class Activity8 {
	public static int longestSeq(int [] arr,int n) {
		int [] dp=new int[n];
		int maxlength=1;
		for(int i=0;i<n;i++) {
			dp[i]=1;
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && dp[i]<dp[j]+1) {
					dp[i]=dp[j]+1;
				}
				
			}
			maxlength=Math.max(maxlength, dp[i]);
			
		}
		return maxlength;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Activity8 ac=new Activity8();
		System.out.println(ac.longestSeq(arr, n));
		

	}

}
