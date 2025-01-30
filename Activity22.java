package Day3;
import java.util.*;
class Carr{
	public int no_of_tires=4;
	public String bodyType="Plastic";
	public void  reverseGear() {
		System.out.println("Reverse Gear is Applied....");
	}
	public void switchOnHeadlights() {
		System.out.println("Headlights turned on...");
	}
}
class BMW extends Carr{
	public String modelName="X3";
	public void topSpeed() {
		System.out.println("TopSpeed of BMW is 200kmph");
	}
}
public class Activity22 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


for (int i = 0; i < 3; i++) {

String name = sc.nextLine();

BMW b = new BMW();


if (name.equals("reverseGear")) {

b.reverseGear();

}

if (name.equals("switchOnHeadlights")) {

b.switchOnHeadlights();

}

if (name.equals("topSpeed")) {

b.topSpeed();

}

}

}

}