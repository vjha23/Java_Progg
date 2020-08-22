class MyThread5 implements Runnable
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.print("child thread ");
		}
	}
}
public class ThreadDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 thread=new MyThread5();
		Thread t=new Thread(thread);
		t.setPriority(7);
		t.start();
		for(int i=1;i<5;i++)
		{
			System.out.println("Parent class");
		}
		System.out.println(t.getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}

}
