package instanceofDemo;
//instanceof 用于类和接口
public class Test {
	public static void checkAnimal(Animal a)
	{
		if(a instanceof Pet)  //判断是否是宠物
		{
			if(a instanceof CatchMouse)  //判断是否能捉耗子
			{
				System.out.println(a.name+"是能捉耗子的宠物...");
			}
			else
			{
				System.out.println(a.name+"是普通宠物...");
			}
		}
		else
		{
			System.out.println(a.name+"不是宠物...");
		}
	}

	public static void main(String[] args) {
		Animal a = new Dog("旺财");
		Test.checkAnimal(a);
		Animal b = new Bird("鹦鹉");
		Test.checkAnimal(b);
		Animal c = new Tiger("东北虎");
		Test.checkAnimal(c);
	}
}
