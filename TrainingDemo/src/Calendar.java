import java.util.Scanner;

/* 假设1900-1-1是星期一，所以说要计算每个月的第一天是星期几？
 * 需要统计这个月的第一天距离1900-1-1一共多了多少天。  
 * 根据年份和月份,返回该月的总天数
 * 计算给定年份和月份，计算这个月的第一天距离1900-1-1过了多少天
 **/

public class Calendar {
	//判断是否是闰年
	public static boolean isLeapYear(int year)
	{
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//根据年份和月份,返回该月的总天数
	public static int getMonthDays(int year, int month)
	{
		int days = 31;
		switch(month)
		{
		    case 4:
		    case 6:
		    case 9:
		    case 11: 
		    	days = 30;
		    	break;
		    case 2:
		    	if(isLeapYear(year))
		    	{
		    		days = 29;
		    	}
		    	else
		    	{
		    		days = 28;
		    	}
		    	break;	
		}
		return days;
	}
	
	//计算给定年份和月份，计算这个月的第一天距离1900-1-1过了多少天
    public static int getTotalDays(int year, int month)
    {
    	int totalDays = 0;
    	for (int i = 1900;i<year;i++)
    	{
    		if(isLeapYear(year))
    		{
    			totalDays+=366;
    		}
    		else
    		{
    			totalDays+=365;
    		}
    	}
    	for(int i=1;i<month;i++)
    	{
    		totalDays+=getMonthDays(year,i);
    	}
    	return totalDays;
    }
	public static void main(String[] args) {
		int year; //用户输入的年份
		int month; //用户输入的月份
		int day; //这个月的第一天是星期几
		int totalDays; //这个月的第一天距离1900-1-1一共过了多少天
		int monthDays; //每个月的总天数
		
		Scanner in = new Scanner(System.in);
		System.out.println("********欢迎使用万年历********");
		System.out.println("请输入年份:");
		year = in.nextInt();
		System.out.println("请输入月份:");
		month = in.nextInt();
		System.out.println("你输入年月是："+year+"年"+month+"月\n");
		if(isLeapYear(year))
		{
			System.out.println(year+"是闰年");
		}
		else
		{
			System.out.println(year+"是平年\n");
		}
		monthDays = getMonthDays(year,month);
		totalDays = getTotalDays(year,month);
		totalDays++; //获得总天数
		day = totalDays%7; //得到是星期几
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
		int iCount = 0; //计数器，用来决定是否换行
		for(int i=0;i<day;i++)
		{
			System.out.print("\t");
			iCount++;
		}
		for(int i=1;i<=monthDays;i++)
		{
			System.out.print(i+"\t");
			iCount++;
			if(iCount%7==0)
			{
				System.out.println();
			}
		}
		
	}

}
