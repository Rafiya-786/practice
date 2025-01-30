package Day3;

public class MyRunnable implements Runnable {
	public void run() {
		//System.out.println("Thread with runnable interface started");
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MyRunnable obj=new MyRunnable();
Thread t1=new Thread(obj) ;
Thread t2=new Thread(obj);
t1.start();	
t2.start();

	}

}
