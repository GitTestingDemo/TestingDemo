package ATMDemo;
//ATM异常类
public class ATMException extends Exception{
	String msg; //异常消息
	ATMException(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return this.msg;
	}
}
