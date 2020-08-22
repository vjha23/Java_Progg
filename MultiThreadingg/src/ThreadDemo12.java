// Sync Block for current object
public class ThreadDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display2 d=new Display2();
		MyThread13 t1=new MyThread13(d,"Dhoni");
		MyThread13 t2=new MyThread13(d,"Yuvraj");
		t1.start();
		t2.start();
	}

}
class Display2
{
	public void wish(String name)
	{
		;;;;;;; //1 lakh of code
		synchronized (this) { // for current object
			for(int i=0;i<=5;i++)
			{
				System.out.println("Good morning ");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
				}
				System.out.println(name);
			}
			;;;;;;; // again 1 lakh of code
		}
	}
}
class MyThread13 extends Thread
{
	Display2 d;
	String name;
	MyThread13 (Display2 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
