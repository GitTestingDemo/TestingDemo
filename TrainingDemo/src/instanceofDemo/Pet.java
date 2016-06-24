package instanceofDemo;
//宠物类
public class Pet extends Animal {
	Pet(String name)
	{
		super(name);
	}
	
	public void PlayWithOwner()
	{
		System.out.println(this.name+"正在和主人玩耍...");
	}

}
