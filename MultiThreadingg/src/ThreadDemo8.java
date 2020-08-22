// Join method
public class ThreadDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread8.emp=Thread.currentThread();
		MyThread8 t=new MyThread8();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.print("main thread  ");
		}
	}

}
class MyThread8 extends Thread
{
	public static Thread emp;
	public void main()
	{
		try {
			emp.join();
		}catch(InterruptedException e) {
			for(int i=0;i<5;i++)
			{
				System.out.print("Child Thread  ");
			}
		}
	}
}