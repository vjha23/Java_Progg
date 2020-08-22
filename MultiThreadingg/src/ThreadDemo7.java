// Join method
public class ThreadDemo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread7 t=new MyThread7();
		t.start();
		t.join();
		for(int i=0;i<10;i++)
		{
			System.out.println("Rama thread");
		}
	}

}
class MyThread7 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Geeta thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
		}
	}
}
