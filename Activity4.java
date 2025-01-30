package Day3;
import java.util.*;
/*public class Activity4 {
	public static int Combinations(int[] arr,int amount) {
	int count=0;
		for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]==amount || arr[i]+arr[j]==amount) {
				count++;
			}
			
		}
	}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int amount=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Activity4 ac= new Activity4();
		int result=ac.Combinations(arr, amount);
		System.out.println(result);
	}

}*/
import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of coin denominations
        int n = scanner.nextInt();

        // Read the coin denominations
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        // Read the amount
        int amount = scanner.nextInt();

        // Initialize the dp array
        int[] dp = new int[amount + 1];
        dp[0] = 1; // Base case: one way to make amount 0 (use no coins)

        // Fill the dp array using the coin denominations
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }

        // Output the result
        System.out.println(dp[amount]);

        scanner.close();
    }
}












