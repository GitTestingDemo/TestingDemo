package ExceptionDemo;
//�������ķ�������throws�׳�һ���쳣,��ô�ڵ��ø÷����ĵط��ͱ�����ȷ����try-catch����׽
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
			System.out.println("������Ϊ0,�������");
		}
	}
}
