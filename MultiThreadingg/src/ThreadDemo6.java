// Yield method
public class ThreadDemo6 {
 public static void main(String[] args) {
	 MyThread6 t=new MyThread6();
	 t.start();
	
	 for(int i=0;i<5;i++)
	 {
		 
		 System.out.print("parent ");
		 t.yield();
	 }
}
}
class MyThread6 extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.print("child ");
		
		}
	}
}