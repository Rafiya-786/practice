package Day3;

public class MyThread extends Thread{
	public void run() {
		System.out.println("Thread started");	
		}
	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();
		//th.run();
		//MyThread th1=new  MyThread();
		//th1.start();

	}

}
