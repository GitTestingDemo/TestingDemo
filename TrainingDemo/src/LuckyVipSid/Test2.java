package LuckyVipSid;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		int num;//表示要判断的数；
		boolean flag = true;//先假设是素数
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个正整数: ");
		num = in.nextInt();
        for(int i=2;i<=Math.sqrt(num);i++)
        {
        	if(num%i == 0)
        	{
        		flag = false;        
        		break;
        	}
        }
    	if(flag)
    	{
    		System.out.print(num+"是素数");
    	}
    	else 
    	{
    		System.out.print(num+"不是素数");
    	}
	}

}
