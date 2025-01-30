package Day3;

/*public class ThreadActivity extends Thread{
public void run() {
	String []array= {"peter","sam","erric","bob"};
	for(int i=0;i<array.length;i++) {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(array[i]);
		System.out.println("Welcome to arena");
	}
}
	public static void main(String[] args) {
		
ThreadActivity th=new ThreadActivity();
th.start();
	}

}*/
public class ThreadActivity extends Thread {
	public void run() {
		String[] str = {"abe","ss","iii","bgfr"};
		for(int i=0;i<str.length;i++) {
			if(Thread.currentThread().getName().equals("player"))
			{
			System.out.println(str[i]);
			}
			else
			{
				System.out.println("Welcome");
			}
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		
	}
	}
	
	public static void main(String args[]) {
		ThreadActivity p1 = new ThreadActivity ();
		p1.setName("player");
		ThreadActivity p2 = new ThreadActivity();
		p2.setName("welcome");
		p1.start();
		p2.start();
		
	}
 
}
 
