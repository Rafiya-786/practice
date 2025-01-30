package Day3;

 class MyThread1 extends Thread {
	private String threadName;
	
	MyThread1(String name) {
		threadName = name;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(threadName + " - Count: " + i);
			Thread.yield();
		}
	}

}

public class YieldExample {
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1("Thread 1");
		MyThread1 thread2 = new MyThread1("Thread 2");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main thread finished");
		
	}
}
