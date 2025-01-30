package Day3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.regex.Pattern;
class exchangeRate{
	public String rate(double localCurrency,String foreignCurrency) {
		String str=String.valueOf((int)Math.round(localCurrency));
		return str+foreignCurrency;
	}
	public String rate(double localCurrency,double foreignCurrency) {
double sum=localCurrency+foreignCurrency;
BigDecimal bd=new BigDecimal(Double.toString(sum));
bd=bd.setScale(2,RoundingMode.HALF_UP);
String result=bd.toString();
if(result.endsWith(".00")) {
	result=result.substring(0,result.length()-1);
}
return result;
}
	public String rate(String localCurrency,String foreignCurrency) {
		return localCurrency.concat(foreignCurrency);
	}
}
public class Activity28 {

public static void main(String args[]) throws Exception {

/* Enter your code here. Read input from STDIN. Print output to STDOUT */

Scanner sc = new Scanner(System.in);

String input = sc.nextLine();

int n = Integer.parseInt(input);

for (int i = 0; i < n; i++) {

String[] entries = sc.nextLine().split(" ");

Boolean isFirstEntryDouble = isFloat(entries[0]);

Boolean isSecondEntryDouble = isFloat(entries[1]);

exchangeRate currencyExchange = new exchangeRate();

if (isFirstEntryDouble && isSecondEntryDouble) {

System.out.println(currencyExchange.rate(Double.parseDouble(entries[0]), Double.parseDouble(entries[1])));

} else {

System.out.println(currencyExchange.rate(entries[0], entries[1]));

}

}

}


private static final Pattern DOUBLE_PATTERN = Pattern.compile(

"[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)" +

"([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|" +

"(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)" +

"(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");


public static boolean isFloat(String s) {

return DOUBLE_PATTERN.matcher(s).matches();

}

}