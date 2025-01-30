package Day3;
public class Synchronizedrunnable implements Runnable {
	public synchronized void run() {
	//public void run(){
		// code does not come under sysnchronized block will be excecuted by both
		//threads immefddiately
		//System.out.println(Thread.currentThread().getName());
		//synchronized(this) {
		for(int i=0;i<10;i++) {
		
			System.out.println(Thread.currentThread().getName()+","+i);
			System.out.println(i);
		}
	}
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchronizedrunnable runnable=new Synchronizedrunnable();
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		t1.start();
		t2.start();
 
	}
 
}
 