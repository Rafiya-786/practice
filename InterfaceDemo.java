package Day3;
interface IInterest{
	double getInterest(double principal,double rate,double time);
}
public class InterfaceDemo {
	public void CalculateInterest(IInterest interest) {
		double result =interest.getInterest(1200, 3, 2);
		System.out.println(result);
	}

	public static void main(String[] args) {
		InterfaceDemo obj=new InterfaceDemo();
		obj.CalculateInterest((principal,rate,time)->(principal*rate*time)/100);;
		//IInterest simpleInterest=(principal,rate,time)->(principal*rate*time)/100;
		/*IInterest simpleInterest=(principal,rate,time)->{System.out.println("Principal "+principal);
		System.out.println("Rate "+rate);
		System.out.println("Time "+time);
		return (principal*rate*time)/100;
		};
		double result=simpleInterest.getInterest(12000,2,3);
		System.out.println(result);*/

	}

}
