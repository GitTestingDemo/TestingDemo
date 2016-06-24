package ExceptionDemo2;

public class Test {
	public static void fn() throws MyException
	{
		throw new MyException();
	}

	public static void main(String[] args) {
		try
		{
			Test.fn();
		}
		catch(MyException ex)
		{
			System.out.println(ex);
		}
	}

}
