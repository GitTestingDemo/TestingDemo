package ExceptionDemo2;
import java.sql.SQLException;

//������д�����׳��ȸ��෶Χ������쳣
public class A {
	public void fn() throws SQLException
	{
		
	}
}
class B extends A{

	@Override //������д�����׳��ȸ��෶Χ������쳣
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
		catch(SQLException ex)//���׳�������쳣
		{
			
		}
		catch(Exception ex)
		{
			
		}
	}
}