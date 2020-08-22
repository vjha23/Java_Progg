// Synchronized method
public class ThreadDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		MyThread10 t1=new MyThread10(d,"Dhoni");
		MyThread10 t2=new MyThread10(d,"Yuvraj");
		t1.start();
		t2.start();
	}

}
class Display{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{
			
			}
			System.out.println(name);
		}
	}
}
class MyThread10 extends Thread
{
	private Display d;
	private String name;
	public MyThread10(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
	
}
