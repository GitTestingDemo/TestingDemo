package LuckyVipSid;
import java.math.BigInteger;
import java.util.Scanner;

public class LuckyVipSid {

	public static void main(String[] args) {
		String sid;//身份证号码
		Scanner in = new Scanner(System.in);
		System.out.print("请输入身份证号码：");
		sid = in.next();
		BigInteger id = new BigInteger(sid);
		int temp = 0;
		do
		{
			temp+=id.mod(new BigInteger("10")).intValue();
			id = id.divide(new BigInteger("10"));
			if(id.intValue() == 0)
			{
				break;
			}		
		}while(true);
		if(temp%13==0)
		{
			System.out.println("恭喜你中奖！");
		}
		else
		{
			System.out.println("很遗憾，你没有中奖！");
		}
	}

}
