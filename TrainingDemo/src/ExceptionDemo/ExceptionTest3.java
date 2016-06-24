package ExceptionDemo;
//如果在类的方法中用throws抛出一个异常,那么在调用该方法的地方就必须明确的用try-catch来捕捉
class Test{
	void add(int a, int b) throws Exception
	{
		int c;
		c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}	
}
public class ExceptionTest3 {
	public static void main (String args[])
	{
		Test t = new Test();
		try{
			
			t.add(4, 0);			
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("被除数为0,程序出错！");
		}
	}
}
