package LuckyVipSid;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		int num;//��ʾҪ�жϵ�����
		boolean flag = true;//�ȼ���������
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��������: ");
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
    		System.out.print(num+"������");
    	}
    	else 
    	{
    		System.out.print(num+"��������");
    	}
	}

}
