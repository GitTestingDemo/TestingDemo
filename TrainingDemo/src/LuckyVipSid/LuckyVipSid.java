package LuckyVipSid;
import java.math.BigInteger;
import java.util.Scanner;

public class LuckyVipSid {

	public static void main(String[] args) {
		String sid;//���֤����
		Scanner in = new Scanner(System.in);
		System.out.print("���������֤���룺");
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
			System.out.println("��ϲ���н���");
		}
		else
		{
			System.out.println("���ź�����û���н���");
		}
	}

}
