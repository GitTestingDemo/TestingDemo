package LuckyVipSid;
public class HuiWen {

	public static void main(String[] args) {
		int gw;//个位
		int sw;//十位
		int bw;//百位
		int qw;//千位
		for(int i=1000;i<=9999;i++)//打印出1000-9999之间的所有回文
		{
			gw = i%10;
			sw = (i/10)%10;
			bw = (i/100)%10;
			qw = i/1000;
			if((gw==qw)&&(sw==bw))
			{
				System.out.print(i+",");
			}			
		}

	}

}
