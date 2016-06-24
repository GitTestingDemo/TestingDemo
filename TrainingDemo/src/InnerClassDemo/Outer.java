package InnerClassDemo;
//�ⲿ��
public class Outer {
	String name;
	Outer()
	{
		System.out.println("Outer Class Constructor......");
	}
	Outer(String name)
	{
		this();
		this.name = name;
	}
	public void showName()
	{
		System.out.println("Outer Class name is:"+this.name);
	}
	//�ڳ�Ա�����ж����ڲ���
	public void fun(String name)
	{
		class Inner3
		{
			String name;
			Inner3()
			{
				System.out.println("Inner3 Class Constructor......");
			}
			Inner3(String name)
			{
				this();
				this.name = name;
			}
			public void showName()
			{
				System.out.println("Method Inner3 Class name is:"+this.name);
			}					
		}
		new Inner3(name).showName();			
	}
	//�ھ�̬�����ж����ڲ���
	public static void method(String name)
	{
		class Inner4
		{
			String name;
			Inner4()
			{
				System.out.println("Inner4 Class Constructor......");
			}
			Inner4(String name)
			{
				this();
				this.name = name;
			}
			public void showName()
			{
				System.out.println("Static Method Inner4 Class name is:"+this.name);
			}					
		}		
		new Inner4(name).showName();
	}
	//��ͨ�ڲ���
	class Inner
	{
		String name;
		Inner()
		{
			System.out.println("Normal Inner Class Constructor......");
		}
		Inner(String name)
		{
			this();
			this.name = name;
		}
		public void showName()
		{

			System.out.println("Normal Inner Class name is:"+this.name);
		}		
	}
	//��̬���ڲ���
	static class Inner2
	{
		String name;
		Inner2()
		{
			System.out.println("Static Inner2 Class Constructor......");
		}
		Inner2(String name)
		{
			this();
			this.name = name;
		}
		public void showName()
		{

			System.out.println("Static Inner2 Class name is:"+this.name);
		}		
	}

	public static void main(String[] args) {
		Outer outer = new Outer("�ⲿ��");
		outer.showName();
		
		System.out.println("----��ͨ�ڲ���----");
		Inner inner = new Outer().new Inner("Normal inner class");
		inner.showName();
		
		System.out.println("----��̬�ڲ���----");
		Outer.Inner2 inner2 = new Inner2("Static inner2 class");
		inner2.showName();
		
		System.out.println("----�����ڲ���----");
		outer.fun("Method Inner3");
		
		System.out.println("----��̬�����ڲ���----");
		Outer.method("Static Method Inner3");

	}

}
