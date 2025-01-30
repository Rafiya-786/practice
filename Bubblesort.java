package Day3;
import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 2, 5};
        int temp;
        for (int i=0;i<5; i++) {
        	for(int j=i+1;j<5;j++) {
            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        }
        System.out.println(Arrays.toString(arr));
    }
}
