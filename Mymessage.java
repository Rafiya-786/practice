package Day3;
interface IMath{
	void calculate(int a,int b);
}
public class Mymessage {

	public static void main(String[] args) {
		IMath imath=(a,b)->System.out.println(a+b);
imath.calculate(12,13);
IMath imath1=(a,b)->System.out.println(a*b);
imath1.calculate(11, 10);
	}

}
