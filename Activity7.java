package Day3;
import java.util.Scanner;
import java.util.Arrays;

public class Activity7 {
    public static int finddenominations(int[] arr, int amount) {
        Arrays.sort(arr);
        int m = arr.length;
        int count = 0;
        for (int i = m - 1; i >= 0 && amount > 0; i--) {
            if (arr[i] <= amount) {
                count += amount / arr[i];
                amount %= arr[i];
            }
        }
        return amount == 0 ? count : -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of denominations: ");
        int n = sc.nextInt();
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the denominations: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = finddenominations(arr, amount);
        if (result == -1) {
            System.out.println("It's not possible to achieve the given amount with the provided denominations.");
        } else {
            System.out.println("Minimum number of coins/notes required: " + result);
        }
    }
}
