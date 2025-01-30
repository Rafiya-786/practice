package Day3;

import java.io.BufferedWriter;
import java.io.*;

public class ReaderWriter {
public void writeToFile(String data) throws IOException{
	FileWriter write=new FileWriter("mybufferfile.txt");
	BufferedWriter buffer=new BufferedWriter(write);
	buffer.write(data);
	buffer.flush();
	write.close();
}
public String readFromFile() throws FileNotFoundException,IOException{
	FileReader reader=new FileReader("mybufferfile.txt");
	BufferedReader buffer=new BufferedReader(reader);
	char[] cstr=new char[50];
	buffer.read(cstr);
	return new String(cstr);
}

	public static void main(String[] args) {
		ReaderWriter obj=new ReaderWriter();
		try {
		obj.writeToFile("Hello Capgemini!");
		String str=obj.readFromFile();
		System.out.println(str);
		}
		catch(FileNotFoundException e) {
		}
		catch(IOException e) {
	}

}
}
