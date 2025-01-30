package Day3;
class MyThread2 extends Thread
{
	private String[] schedule={"Wednesday---Meeting","Friday---Training","Monday---Client Meet"};
	private String clientName;
	MyThread2(String name)
	{
		clientName=name;
	}
	public void run()
	{
		Thread.yield();
		//Yielding control to allow other threads to execute
		for(String event:schedule)
		{
			
			System.out.println(Thread.currentThread().getName());
			System.out.println(event);
		
 
		}
	}
}
public class SchedulePriority {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 client1=new MyThread2("Client 1");
		MyThread2 client2=new MyThread2("Client 2");
		MyThread2 client3=new MyThread2("Client 3");
		MyThread2 client4=new MyThread2("Client 4");
		
		client1.setName("Client 1");
		client2.setName("Client 2");
		client3.setName("Client 3");
		client4.setName("Client 4");
		client1.setPriority(4);//highest priority
		client2.setPriority(7);
		client3.setPriority(8);
		client4.setPriority(9); //lowest priority
		
		client1.start();
		client2.start();
		client3.start();
		client4.start();
		
		try
		{
			//wait for both threads to finish
			client1.join();
			client2.join();
			client3.join();
			client4.join();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			//superclass of all errors and exceptions.
			//This method is used to print the stack trace of the Throwable object to the standard error stream.
		}
		System.out.println("Main Thread finished....");
 
	}
 
}