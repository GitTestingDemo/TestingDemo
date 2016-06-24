package instanceofDemo;
//instanceof ������ͽӿ�
public class Test {
	public static void checkAnimal(Animal a)
	{
		if(a instanceof Pet)  //�ж��Ƿ��ǳ���
		{
			if(a instanceof CatchMouse)  //�ж��Ƿ���׽����
			{
				System.out.println(a.name+"����׽���ӵĳ���...");
			}
			else
			{
				System.out.println(a.name+"����ͨ����...");
			}
		}
		else
		{
			System.out.println(a.name+"���ǳ���...");
		}
	}

	public static void main(String[] args) {
		Animal a = new Dog("����");
		Test.checkAnimal(a);
		Animal b = new Bird("����");
		Test.checkAnimal(b);
		Animal c = new Tiger("������");
		Test.checkAnimal(c);
	}
}
