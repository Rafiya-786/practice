package Day3;
import java.io.*;
import java.io.FileWriter;

public class TextReader {

	public void writeToFile(String text) throws IOException {
		FileWriter writer=new FileWriter("mytextfile.txt");
		writer.write(text);
writer.flush();
writer.close();
	}
	public String readFromFile() throws FileNotFoundException,IOException {
		FileReader reader=new FileReader("mytextFile.txt");
		char[] cstr=new char[20];
		reader.read(cstr);
		return new String(cstr);
	}
	public static void main(String a[]) {
		TextReader txt=new TextReader();
		try {
			txt.writeToFile("Hello from program");
			String str=txt.readFromFile();
			System.out.println(str);
					
		}
		catch(FileNotFoundException e) {
		}
		catch(IOException e) {	
		}
	}

}
