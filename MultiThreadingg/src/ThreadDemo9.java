// Interrupted Method
public class ThreadDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread9 t=new MyThread9();
		t.start();
		t.interrupt();
		System.out.println("end of main");
	}

}
class MyThread9 extends Thread
{
	public void run()
	{
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println("I am sleeping");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
			{
				System.out.println("I got Interuppted");
			}
		}
	}
