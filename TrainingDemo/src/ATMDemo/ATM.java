package ATMDemo;
import java.util.Scanner;

//运行类
public class ATM {
	private static final Scanner in = new Scanner(System.in);
	private static int choice;//用户选择
	private static Account account;
	//显示系统菜单
	public static void showMenu()
	{
		System.out.println("********欢迎使用xxx银行ATM系统********");
		System.out.println("\t1.开户");
		System.out.println("\t2.查询余额");
		System.out.println("\t3.存款");
		System.out.println("\t4.取款");
		System.out.println("\t5.修改密码");
		System.out.println("\t6.退出");
		System.out.println("请选择：");
		choice = in.nextInt();
	}
  
	//开户方法
	public static void initAccount()
	{
		account = new Account();
		System.out.println("开户成功！以下是你的账户信息：");
		System.out.println(account);
	}
	
	//查询余额
	public static void showBalance()
	{
		System.out.println(account);
	}
	
	//存款方法
	public static boolean deposite(int number)
	{
		try{
			if(number<=0)
			{
				throw new ATMException("存款金额非法！");
			}
			else
			{
				account.setBalance(account.getBalance()+number);
				System.out.println("存款成功！");
				return true;
			}
		}
		catch(ATMException ex)
		{
			System.out.println(ex);
			return false;
		}		
	}
	
	//取款方法
	public static boolean draw(int number)
	{
		try{
			if(number<=0)
			{
				throw new ATMException("取款金额非法！");
			}
			else if(number>account.getBalance())
			{
				throw new ATMException("取款金额大于余额，余额不足！");
			}
			else
			{
				account.setBalance(account.getBalance()-number);
				System.out.println("取款成功！");
				return true;
			}
		}
		catch(ATMException ex)
		{
			System.out.println(ex);
			return false;
		}		
	}
	
	//验证密码方法
	public static boolean confirmPass(String pass)
	{
		try{
			if(pass==null||pass.equals(""))
			{
				throw new ATMException("密码不能为空！");
			}
			else if(!pass.equals(account.getPassword()))
			{
				throw new ATMException("密码验证失败！");
			}
			else
			{
				return true;
			}
		}
		catch(ATMException ex)
		{
			System.out.println(ex);
			return false;
		}		
	}
	
	//修改密码方法
	public static boolean changePass(String pass)
	{
		try{
			if(pass==null||pass.equals(""))
			{
				throw new ATMException("密码不能为空！");
			}
			else if(pass.length()!=6)
			{
				throw new ATMException("密码长度必须是6位！");
			}
			else
			{
				account.setPassword(pass);
				System.out.println("密码修改成功！");
				return true;
			}
		}
		catch(ATMException ex)
		{
			System.out.println(ex);
			return false;
		}		
	}
	
	public static void main(String[] args) {
		ATM.showMenu();
		do{
			if(choice==6)
			{
				break;
			}
			switch(choice)
			{
			   case 1: 
				   ATM.initAccount();
			       break;
			   case 2: 
				   ATM.showBalance();
			       break;
			   case 3: 
				   System.out.println("请输入存款金额：");
				   int number = in.nextInt();
				   ATM.deposite(number);
			       break;
			   case 4: 
				   System.out.println("请输入取款金额：");
				   number = in.nextInt();
				   ATM.draw(number);
			       break;		   
			   case 5: 
				   System.out.println("请输入密码：");
				   String pass = in.next();
				   if(ATM.confirmPass(pass))
				   {
					   System.out.println("请输入新密码："); 
					   pass = in.next();
					   ATM.changePass(pass);
				   }
			       break;	
			}
			ATM.showMenu();
		}while(choice!=6);
		System.out.println("感谢您的使用，欢迎下次光临！");
	}

}
