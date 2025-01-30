package Day3;
import java.util.*;

class Encrypter {
	public static String getEncryptedName(String name) {
		Validator v=new Validator();
		boolean result=v.validate(name);
		StringBuilder sb=new StringBuilder();
		if(result==true) {
			String s=name.toLowerCase();
			sb.append(s);
			sb.reverse();
		}
		else {
			throw new IllegalArgumentException("Try again with valid name");
		}
		return sb.toString();
	}
}
class Validator{
	public boolean validate(String name) {
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if (c != ' ' && !(Character.isLowerCase(c) || Character.isUpperCase(c))) {

				return false;
			}
		}
		return true;
	}
}
public class Activity29 {

private static final Scanner INPUT_READER = new Scanner(System.in);


public static void main(String[] args) {

String name = INPUT_READER.nextLine();


try {

System.out.println(Encrypter.getEncryptedName(name));

} catch (Exception e) {

System.out.println(e);

}

}

}