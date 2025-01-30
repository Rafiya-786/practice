package Day3;
import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
       /* for(int i=1; i<n ; i++){
            for(int j=i; j>=1; j--){

                if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1]))>0){   
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                    
                }else{
                    break;
                }
            }  
        } */
        

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;


public class Solution
{
    public static class V {
        public final String s;
        public final BigDecimal b;

        public V(final String s) {
            this.s = s;
            this.b = new BigDecimal(s);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 64 * 1024);

        final int N = Integer.parseInt(br.readLine().trim(), 10);

        final V[] A = new V[N];
        for (int i = 0; i < N; i++) {
            A[i] = new V(br.readLine().trim());
        }
        Arrays.sort(A, new Comparator<V>() {
            @Override
            public int compare(final V o1, final V o2) {
                return o1.b.compareTo(o2.b);
            }
        });
        final StringBuilder sb = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            sb.append(A[i].s).append('n');
        }

        System.out.print(sb.toString());

        br.close();
        br = null;
    }
}