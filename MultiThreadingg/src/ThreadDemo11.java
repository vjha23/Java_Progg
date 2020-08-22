// Sync class level lock(use static)
public class ThreadDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Displayy d=new Displayy();
		MyThread11 t1=new MyThread11(d);
		MyThread12 t2=new MyThread12(d);
		t1.start();
		t2.start();
	}

}
class Displayy
{
	public static synchronized void displayn()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
	public static synchronized void display()
	{
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			
		}
	}
}
class MyThread11 extends Thread
{
	Displayy d;
	public MyThread11(Displayy d)
	{
		this.d=d;
	}
	public void run()
	{
		d.displayn();
	}
}
class MyThread12 extends Thread
{
	Displayy d;
	public MyThread12(Displayy d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display();
	}
}