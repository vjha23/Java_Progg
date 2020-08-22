// Getting Thread names
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t=new MyThread1();
		t.start();
		System.out.println("This is line is executed by "+Thread.currentThread().getName());
	}

}
class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("This line is executed by thread "+Thread.currentThread().getName());
	}
}
