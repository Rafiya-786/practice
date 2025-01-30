package Day3;

public class ThreadDemo extends Thread {
	public void run() {
		String name=this.getName();
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name);
	}
		

	public static void main(String[] args) {
		ThreadDemo th1=new ThreadDemo();
		th1.setName("First Thread");
		ThreadDemo th2= new ThreadDemo();
		th2.setName("Second Thread");
		th1.start();
		th2.start();
				

	}

}
