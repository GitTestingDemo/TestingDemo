package FinalDemo;
//Person类
class Person{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public void showInfo()
	{
		System.out.println("姓名："+this.name+",年龄:"+this.age);
	}
}

public class FinalDemo {
	//1.final修饰属性的两种属性（基本数据类型，引用数据类型）
	final int NUM = 100; //定义的同时进行初始化
	final Person p; //定义时未初始化，但在构造方法中进行初始化
	FinalDemo()
	{
		this.p = new Person("无名氏",20);
	}
	public void change(final Person p)//final 修饰形参，作用跟属性一样
	{
		p.name = "靖王"; //final 形参内容可改变
		//p = new Person("003",15); 错误, 对象不能改变
	}
	

	public static void main(String[] args) {
		FinalDemo f = new FinalDemo();
		//f.NUM = 50;  //错误 , final类型不可改变
		
		f.p.name = "梅长苏";//final对象不能改变，但是对象内容可以改变
		//f.p.showInfo();*/
		
		//f.p = new Person("001",20); //错误，final引用类型所指向的对象不能被改变
		Person p =new Person("002",25);
		f.change(p);
		p.showInfo();
		

	}

}
