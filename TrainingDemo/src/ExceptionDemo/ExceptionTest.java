package ExceptionDemo;
class Person
{
	Person()
	{
		
	}
	public void sayHello()
	{
		System.out.println("��Һá���������");
	}
}
public class ExceptionTest {
	public static Person p; //������ò�ָ���κζ���
	public static void fn()
	{
		try{
		   p.sayHello();//���׳�NullPointerException,��������ʱ�쳣
		}
		catch(Exception ex)
		{
			System.out.println("���򼴽��˳�");
			//System.exit(0);//�����������˳�
			//return;
		}
		finally  //һ����ִ�м�ʹ����return
		{
			System.out.println("��һ��Ҫִ��2......");
		}
		
	}
	
	public static void main(String[] args){
		try {
			int a = 10;
			int b = 0;
			int arr[] = {1,2,3};
			ExceptionTest.fn();
			System.out.println(a/b); //������ʱ���׳��쳣
			//System.out.println(arr[3]); //��ӡ���ĸ�Ԫ�أ����׳�ArrayIndexOutOfBoundsException
			//Class.forName("cn.com.A"); // ����cn.com.A��
		} 
		catch(ArithmeticException ex)
		{
			System.out.println("��ĸ����Ϊ�㣡");
		}
//		catch (ClassNotFoundException ex) {
//			ex.printStackTrace();
//			System.out.println("�����쳣��");
//		}
		finally//һ����ִ�м�ʹ����return�� ֻ������System.exit(0)�Ų���ִ�С�ͨ�������ͷ���Դ�����磺�ر����ӣ��ر��ļ��ȵ�
		{
			System.out.println("��һ��Ҫִ��......");
		}
	}
}
