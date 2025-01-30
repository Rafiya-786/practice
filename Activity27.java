package Day3;
import java.util.*;;

interface Bank{
	void assignLoans(int[] loans);
	void averageLoan();
	void maxLoan();
	void minLoan();
}
class PersonalLoanDept implements Bank{
	int clients;
	int[]loanAmounts;
	PersonalLoanDept(int clients){
		this.clients=clients;
		loanAmounts=new int[clients];
	}
	public void assignLoans(int[] loans) {
		for(int i=0;i<loanAmounts.length;i++) {
			if(i<loans.length) {
				loanAmounts[i]=loans[i];
			}
		}
		System.out.println("Loans for clients processed");	
	}
	public void averageLoan() {
		double average=Arrays.stream(loanAmounts).average().orElse(0);
		System.out.printf("Average loan amount for clients is %.2f", average);
	System.out.println();	
	}
	public void maxLoan() {
		int max=Arrays.stream(loanAmounts).max().orElse(0);
		System.out.println("Maximum loan amount amongst clients is"+max);
	}
	public void minLoan() {
		int min=Arrays.stream(loanAmounts).min().orElse(0);
		System.out.println("Minimum loan amount amongst clients is"+min);
	}
}
class BusinessLoanDept implements Bank{
	int[]loanAmounts;
	public BusinessLoanDept(int business) {
		loanAmounts=new int[business];
	}
	public void assignLoans(int[] loans) {
		for(int i=0;i<loanAmounts.length;i++) {
			if(i<loans.length) {
				loanAmounts[i]=loans[i];
			}
		}
		System.out.println("Loans for businesses processed");
				
			}
	public void averageLoan() {
		double average=Arrays.stream(loanAmounts).average().orElse(0);
		System.out.printf("Average loan amount for business is %.2f",average);
	System.out.println();	
	}
	public void maxLoan()
	{
		int max=Arrays.stream(loanAmounts).max().orElse(0);
	System.out.println("Maximum loan amongst businesses is"+max);
	}
	public void minLoan() {
		int min=Arrays.stream(loanAmounts).min().orElse(0);
		System.out.println("Minimum loan amongst businesses is"+min);
	}
}
public class Activity27 {

public static void main(String args[]) throws Exception {

Scanner sc = new Scanner(System.in);


String[] count = sc.nextLine().split(" ");


PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));

BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));


count = sc.nextLine().split(" ");


int[] loansClients = new int[count.length];

for (int i = 0; i < count.length; i++) {

loansClients[i] = Integer.parseInt(count[i]);

}

p.assignLoans(loansClients);


count = sc.nextLine().split(" ");

int[] loansBusinesses = new int[count.length];

for (int i = 0; i < count.length; i++) {

loansBusinesses[i] = Integer.parseInt(count[i]);

}

b.assignLoans(loansBusinesses);


p.averageLoan();

p.maxLoan();

p.minLoan();


b.averageLoan();

b.maxLoan();

b.minLoan();

}

}
