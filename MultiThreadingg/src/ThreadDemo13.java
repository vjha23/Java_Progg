// sync block for class level lock
public class ThreadDemo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display3 d1=new Display3();
		Display3 d2=new Display3();
		MyThread14 t1=new MyThread14(d1,"Dhoni");
		MyThread14 t2=new MyThread14(d2,"Yuvraj");
		t1.start();
		t2.start();
	}

}
class Display3
{
	public void wish(String name)
	{
		;;;;;;; //1 lakh of code
		synchronized (Display3.class) { // for class level lock
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
class MyThread14 extends Thread
{
	Display3 d;
	String name;
	MyThread14 (Display3 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}