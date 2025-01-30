package Day3;
import java.util.*;
public class Activity5 {

	public static void main(String[] args) {
		/*String s="Hello, World! hello everyone. Welcome to the world of programming.";
		String [] words=s.toLowerCase().split("[\\W_]+");*/
		StringTokenizer st=new StringTokenizer("Hello, world! hello everyone. Welcome to the world of programming.".toLowerCase(),"! , .");

		List<String> ls=new ArrayList<>();
		while(st.hasMoreTokens()) {
			ls.add(st.nextToken());
		}
		Map<String,Integer> m=new TreeMap();
		for(String str:ls) {
			m.put(str,m.getOrDefault(str,0)+1);
		}
		for(Map.Entry<String, Integer> mentry:m.entrySet()) {
			System.out.println(mentry.getKey()+": "+mentry.getValue());
		}
	}

}
