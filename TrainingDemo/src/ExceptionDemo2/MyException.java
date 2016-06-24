package ExceptionDemo2;
//自定义异常类
public class MyException extends Exception {
	public String toString()
	{
		return "抛出了我自定义的异常！";
	}
}
