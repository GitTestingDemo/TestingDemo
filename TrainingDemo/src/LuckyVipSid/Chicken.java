package LuckyVipSid;
public class Chicken {

	public static void main(String[] args) {
		int gj;
		int mj;
		int xj;
		for(gj=0;gj<=20;gj++)
		{
			for(mj=0;mj<=33;mj++)
			{
				for(xj=0;xj<=100;xj++)
				{
					if(xj%3==0)
					{
						if((gj+mj+xj==100)&&(5*gj+3*mj+xj/3==100))
						{
							System.out.println("攻击: "+gj+"只， 母鸡："+mj+"只,小鸡："+xj+"只.");
						}											
					}
				}
			}
		}   
	}
}
