// Setting Thread Priority
public class ThreadDemo4 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority()); // default = 5
		Thread.currentThread().setPriority(7);
		MyThread t=new MyThread();
		System.out.println(t.getPriority()); // now 7
	}
}
class MyThread3 extends Thread
{
	
}
