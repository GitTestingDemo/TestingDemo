package instanceofDemo;

public class Cat extends Pet implements CatchMouse {

	Cat(String name) {
		super(name);
	}

	@Override
	public void catchMouse() {
		System.out.println("���Ǻ��ӵ����...");		
	}

}
