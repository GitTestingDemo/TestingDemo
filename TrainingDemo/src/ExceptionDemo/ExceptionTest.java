package ExceptionDemo;
class Person
{
	Person()
	{
		
	}
	public void sayHello()
	{
		System.out.println("大家好。。。。。");
	}
}
public class ExceptionTest {
	public static Person p; //这个引用不指向任何对象
	public static void fn()
	{
		try{
		   p.sayHello();//会抛出NullPointerException,属于运行时异常
		}
		catch(Exception ex)
		{
			System.out.println("程序即将退出");
			//System.exit(0);//程序无条件退出
			//return;
		}
		finally  //一定会执行即使碰到return
		{
			System.out.println("我一定要执行2......");
		}
		
	}
	
	public static void main(String[] args){
		try {
			int a = 10;
			int b = 0;
			int arr[] = {1,2,3};
			ExceptionTest.fn();
			System.out.println(a/b); //在运行时会抛出异常
			//System.out.println(arr[3]); //打印第四个元素，会抛出ArrayIndexOutOfBoundsException
			//Class.forName("cn.com.A"); // 加载cn.com.A类
		} 
		catch(ArithmeticException ex)
		{
			System.out.println("分母不能为零！");
		}
//		catch (ClassNotFoundException ex) {
//			ex.printStackTrace();
//			System.out.println("加载异常！");
//		}
		finally//一定会执行即使碰到return， 只有碰到System.exit(0)才不会执行。通常用来释放资源，例如：关闭连接，关闭文件等等
		{
			System.out.println("我一定要执行......");
		}
	}
}
