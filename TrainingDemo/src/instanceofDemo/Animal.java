package instanceofDemo;
//������
public class Animal {
	String name;
	static int nCount = 0;
	Animal(String name)
	{
		nCount++;
		this.name = name;
	}

}
