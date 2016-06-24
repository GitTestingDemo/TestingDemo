package instanceofDemo;

public class Dog extends Pet implements CatchMouse {

	Dog(String name) {
		super(name);
	}

	@Override
	public void catchMouse() {
		System.out.println("狗拿耗子多管闲事...");
		
	}

}
