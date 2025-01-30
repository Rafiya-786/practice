package Day3;
 interface Message{
	void printMessage();
}

public class MyMessageApp {

	public static void main(String[] args) {
		Message msg=()-> System.out.println("Hello World");
		msg.printMessage();

	}

}
