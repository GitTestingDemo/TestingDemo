package FinalDemo;
//Person��
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
		System.out.println("������"+this.name+",����:"+this.age);
	}
}

public class FinalDemo {
	//1.final�������Ե��������ԣ������������ͣ������������ͣ�
	final int NUM = 100; //�����ͬʱ���г�ʼ��
	final Person p; //����ʱδ��ʼ�������ڹ��췽���н��г�ʼ��
	FinalDemo()
	{
		this.p = new Person("������",20);
	}
	public void change(final Person p)//final �����βΣ����ø�����һ��
	{
		p.name = "����"; //final �β����ݿɸı�
		//p = new Person("003",15); ����, �����ܸı�
	}
	

	public static void main(String[] args) {
		FinalDemo f = new FinalDemo();
		//f.NUM = 50;  //���� , final���Ͳ��ɸı�
		
		f.p.name = "÷����";//final�����ܸı䣬���Ƕ������ݿ��Ըı�
		//f.p.showInfo();*/
		
		//f.p = new Person("001",20); //����final����������ָ��Ķ����ܱ��ı�
		Person p =new Person("002",25);
		f.change(p);
		p.showInfo();
		

	}

}
