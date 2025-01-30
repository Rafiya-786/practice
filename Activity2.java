package Day3;

public class Activity2 {
	public boolean balanced(String str) {
		int n=str.length();
		String str1=str.substring(0,n/2);
		String str2=str.substring(n/2,n);
		String str3 = new StringBuilder(str1).reverse().toString();
		str3.replace('(', ')');
		str3.replace('[', ']');
		str3.replace('{', '}');
		if(str3.equals(str2)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Activity2 a=new Activity2();
		System.out.println(a.balanced("((())"));

	}

}
