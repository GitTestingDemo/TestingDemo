package ExceptionDemo2;
import java.sql.SQLException;

//方法重写不能抛出比父类范围更大的异常
public class A {
	public void fn() throws SQLException
	{
		
	}
}
class B extends A{

	@Override //方法重写不能抛出比父类范围更大的异常
	public void fn() throws SQLException {//Exception instead of SQLException will have error
		// TODO Auto-generated method stub
		super.fn();
	}
	
	public void m()
	{
		try
		{
			throw new SQLException();
		}
		catch(SQLException ex)//先抛出子类的异常
		{
			
		}
		catch(Exception ex)
		{
			
		}
	}
}