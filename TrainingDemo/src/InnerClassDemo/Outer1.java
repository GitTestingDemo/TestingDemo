package InnerClassDemo;

public class Outer1 {
	int score = 95;
	Outer1()
	{
		System.out.println("打印出成绩....");
	}
	class Inner
	{
		void display()
		{
			System.out.println("成绩:"+score);
		}
	}

	public static void main(String[] args) {
		Inner inner = new Outer1().new Inner();
		inner.display();

	}

}
