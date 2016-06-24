package InnerClassDemo;
//外部类
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
	//在成员方法中定义内部类
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
	//在静态方法中定义内部类
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
	//普通内部类
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
	//静态的内部类
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
		Outer outer = new Outer("外部类");
		outer.showName();
		
		System.out.println("----普通内部类----");
		Inner inner = new Outer().new Inner("Normal inner class");
		inner.showName();
		
		System.out.println("----静态内部类----");
		Outer.Inner2 inner2 = new Inner2("Static inner2 class");
		inner2.showName();
		
		System.out.println("----方法内部类----");
		outer.fun("Method Inner3");
		
		System.out.println("----静态方法内部类----");
		Outer.method("Static Method Inner3");

	}

}
