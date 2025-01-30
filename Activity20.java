package Day3;
import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;
class DataEncryption{
	private int encryptionRatio;
	private int baseEncryptionValue;
	public DataEncryption(int encryptionRatio,int baseEncryptionValue){
		this.encryptionRatio=encryptionRatio;
		this.baseEncryptionValue=baseEncryptionValue;
	}
	public int encryptValue() {
		int encryptedvalue=encryptionRatio+baseEncryptionValue;
		return encryptedvalue;
	}
public int encryptValue(int encryptionAdjustment) {
	int encryptedvalue=(encryptionRatio+baseEncryptionValue)-encryptionAdjustment;
	return encryptedvalue;
}
public int encryptValue(String encryptionAdjustment) {
	int a=Integer.parseInt(encryptionAdjustment);
	int encryptedvalue=(encryptionRatio+baseEncryptionValue)-a;
		return encryptedvalue;
}
}
public class Activity20 {

public static void main(String args[]) throws Exception {


BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


String[] values = bufferedReader.readLine().split(" ");


try {

Integer.parseInt(values[0]);


// System.out.println("Integer array");

Integer[] ia = new Integer[values.length];

for (int i = 0; i < values.length; i++) {

ia[i] = new Integer(values[i]);

}

DataEncryption dataEncryption = new DataEncryption(ia[0], ia[1]);


System.out.println(

dataEncryption.encryptValue() + " "

+ dataEncryption.encryptValue(ia[2]) + " "

+ dataEncryption.encryptValue(String.valueOf(ia[2]))

);





bufferedReader.close();

//bufferedWriter.close();


} catch (NumberFormatException nfe) {

// then string array

// System.out.println("String array");



}

}

}
