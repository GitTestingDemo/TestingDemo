package LuckyVipSid;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入圣诞树的高度: ");
		height = in.nextInt();
		for(int i=1;i<=height;i++)
		{
			for(int j=1;j<=height-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
