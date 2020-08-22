// implementing through runnable interface
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharPrint a1=new CharPrint('a',5);
		NumPrint b2=new NumPrint(3);
		CharPrint c3=new CharPrint('b',4);
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b2);
		Thread t3=new Thread(c3);
		t1.start();
		t2.start();
		t3.start();
	}

}
class CharPrint implements Runnable
{
	private char charToprint;
	private int times;
	public CharPrint(char c,int t)
	{
		charToprint=c;
		times=t;
	}
	public void run()
	{
		for(int i=1;i<=times;i++)
		{
			System.out.print(charToprint);
		}
	}
}

class NumPrint implements Runnable{
	private int lastnum;
	public NumPrint(int n)
	{
		lastnum=n;
	}
	public void run()
	{
		for(int i=1;i<=lastnum;i++)
		{
			System.out.print(" "+i);
		}
	}
}
