package InnerClassDemo;

public class Outer1 {
	int score = 95;
	Outer1()
	{
		System.out.println("��ӡ���ɼ�....");
	}
	class Inner
	{
		void display()
		{
			System.out.println("�ɼ�:"+score);
		}
	}

	public static void main(String[] args) {
		Inner inner = new Outer1().new Inner();
		inner.display();

	}

}
