package LuckyVipSid;
public class HuiWen {

	public static void main(String[] args) {
		int gw;//��λ
		int sw;//ʮλ
		int bw;//��λ
		int qw;//ǧλ
		for(int i=1000;i<=9999;i++)//��ӡ��1000-9999֮������л���
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
