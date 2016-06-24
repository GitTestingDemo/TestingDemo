package ATMDemo;
//本文实例为大家分享了java日期操作工具类，获取指定日期前一天、后一天；日期转换；两个日期之间相隔天数等工具类，供大家参考，具体内容如下
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
  
public class DateUtil {
    
  /**
   * 获得指定日期的前一天
   * 
   * @param specifiedDay
   * @param format
   * @return
   * @throws Exception
   */
  public static Date getDayBefore(Date date, String format) {
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    int day = c.get(Calendar.DATE);
    c.set(Calendar.DATE, day - 1);
  
    String dayBeforeStr = new SimpleDateFormat(format).format(c.getTime());
      
    Date dayBefore = null;
    try {
      dayBefore = new SimpleDateFormat(format).parse(dayBeforeStr);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return dayBefore;
  }
    
    
  /**
   * 获得指定日期的后一天
   * 
   * @param specifiedDay
   * @return
   */
  public static Date getDayAfter(Date date, String format) {
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    int day = c.get(Calendar.DATE);
    c.set(Calendar.DATE, day + 1);
    String dayAfterStr = new SimpleDateFormat(format).format(c.getTime());
    Date dayAfter = null;
    try {
      dayAfter = new SimpleDateFormat(format).parse(dayAfterStr);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return dayAfter;
  }
  
    
    
  /**
   * 获得指定日期的前一天
   * 
   * @param specifiedDay
   * @param format
   * @return
   * @throws Exception
   */
  public static String getSpecifiedDayBefore(String specifiedDay, String format) {
    // SimpleDateFormat simpleDateFormat = new
    // SimpleDateFormat("yyyy-MM-dd");
    Calendar c = Calendar.getInstance();
    Date date = null;
    try {
      date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    c.setTime(date);
    int day = c.get(Calendar.DATE);
    c.set(Calendar.DATE, day - 1);
  
    String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    return dayBefore;
  }
  
  /**
   * 获得指定日期的后一天
   * 
   * @param specifiedDay
   * @return
   */
  public static String getSpecifiedDayAfter(String specifiedDay, String format) {
    Calendar c = Calendar.getInstance();
    Date date = null;
    try {
      // date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
      date = new SimpleDateFormat(format).parse(specifiedDay);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    c.setTime(date);
    int day = c.get(Calendar.DATE);
    c.set(Calendar.DATE, day + 1);
  
    // String dayAfter=new
    // SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    String dayAfter = new SimpleDateFormat(format).format(c.getTime());
    return dayAfter;
  }
    
  /**
   * 将date类型准成指定format格式的字符串
   * 
   * @param day 日期
   * @param format 指定格式
   * @return
   */
  public static String date2String(Date day, String format) {
    String dateStr = new SimpleDateFormat(format).format(day.getTime());
    return dateStr;
  }
  
  /**
   * 将字符串转成指定格式的date类型
   * 
   * @param day 日期
   * @param format 指定格式
   * @return
   */
  public static Date string2Date(String dateStr,String format) {
    Date strDate = null;
    try {
      strDate = new SimpleDateFormat(format).parse(dateStr);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return strDate;
  }
    
    
  /**
   * 
  * @Title: DateDate2CompareValue 
  * @Description: 两个date类型比较大小
  * @param dayAfter date类型
  * @param date   date类型
  * @param 格式化
  * @return boolean  
  * @throws
   */
  public static boolean DateDate2CompareValue(Date dayAfter, Date date, String pattern) {
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    try {
      Date d1 = sdf.parse(sdf.format(dayAfter));
      Date d2 = sdf.parse(sdf.format(date));
      if(d1.getTime()>=d2.getTime()){
        return true;
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return false;
  }
  
  /**
   * 比较两个日期年月日的大小
  * @Title: DateCompareValue 
  * @Description: 一个stirng一个date类型比较大小
  * @param date1 String类型
  * @param date2 date类型
  * @param @return  
  * @return boolean  
  * @throws
   */
  public static boolean DateStrDateCompareValue(String date1, Date date, String pattern) {
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    try {
      Date d1 = sdf.parse(date1);
      Date d2 = sdf.parse(sdf.format(date));
      if(d1.getTime()>=d2.getTime()){
        return true;
      }
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return false;
  }
  
  /**
   * 比较两个日期年月日的大小
  * @Title: DateStr2CompareValue 
  * @Description: 两个string类型比较时间大小
  * @param date1
  * @param date2
  * @return boolean  
  * @throws
   */
  @SuppressWarnings("unused")
  public static boolean DateStr2CompareValue(String date1, String date2,String pattern) {
  SimpleDateFormat sdf = new SimpleDateFormat(pattern);
  try {
    Date d1 = sdf.parse(date1);
    Date d2 = sdf.parse(date2);
    if(d1.getTime()>=d2.getTime()){
      return true;
    }
  } catch (ParseException e) {
    e.printStackTrace();
  }
    
    return false;
  }
    
  /**
   * 
  * @Title: get2DateListDate 
  * @date 2016年5月17日 下午2:11:48 
  * @Description: 获取时间之内的 相隔天数的date集合
  * @param @param preDate 开始时间
  * @param @param nextDate 结束时间
  * @param @param format  fomat格式
  * @param @return  
  * @return List<Date> 相隔天数集合 
  * @throws
   */
  public static List<Date> get2DateListDate(String preDate, String nextDate, String format) {
    List<Date> list = new ArrayList<>();
    if(nextDate.equals(preDate)){//开始时间 结束时间相等就直接返回
      list.add(DateUtil.string2Date(preDate, format));
      return list;
    }
    String nexDate = DateUtil.getSpecifiedDayAfter(preDate, format);
    list.add(DateUtil.string2Date(preDate, format));
    list.add(DateUtil.string2Date(nexDate, format));
    while (!nexDate.equals(nextDate)) {
      String nextnextDate = DateUtil.getSpecifiedDayAfter(nexDate, format);
      list.add(DateUtil.string2Date(nextnextDate, format));
      nexDate = nextnextDate;
    }
    return list;
  }
    
  /**
   * 
  * @Title: get2DateListDate 
  * @date 2016年5月17日 下午2:11:48 
  * @Description: 获取时间之内的 相隔天数的string集合
  * @param @param preDate 开始时间
  * @param @param nextDate 结束时间
  * @param @param format  fomat格式
  * @param @return  
  * @return List<Date> 相隔天数集合 
  * @throws
   */
  public static List<String> get2DateListDateStr(String preDate, String nextDate, String format) {
    List<String> list = new ArrayList<>();
    if(nextDate.equals(preDate)){//如果开始时间等于结束时间那么就是同一天
      list.add(preDate);
      return list;
    }
    String nexDate = DateUtil.getSpecifiedDayAfter(preDate, format);
    list.add(preDate);
    list.add(nexDate);
    while (!nexDate.equals(nextDate)) {
      String nextnextDate = DateUtil.getSpecifiedDayAfter(nexDate, format);
      list.add(nextnextDate);
      nexDate = nextnextDate;
    }
    return list;
  }
    
    
  /**
   * 
  * @Title: get2DateListWithDate 
  * @date 2016年5月26日 上午9:20:29 
  * @Description: 获取两个日期之间日期的 
  * @param @param startDate 开始日期 date类型
  * @param @param endDate  结束日期 date类型
  * @param @return  
  * @return List<Date>  datelist
  * @throws
   */
  public static List<Date> get2DateListWithDate(Date startDate, Date endDate,String format) {
    List<Date> list = new ArrayList<>();
    if(startDate.getTime() >endDate.getTime()){
      return list;
    }
    String startDateStr = DateUtil.date2String(startDate, format);
    String endDateStr = DateUtil.date2String(endDate, format);
    if(startDateStr.equals(endDateStr)){//如果开始时间等于结束时间那么就是同一天
      list.add(startDate);
      return list;
    }
    Date nextDate = DateUtil.getDayAfter(startDate, format);
    String nextDateStr = DateUtil.date2String(nextDate, format);
    //String endDateStr = DateUtil.date2String(endDate, format);
    list.add(startDate);
    list.add(nextDate);
    while (!nextDateStr.equals(endDateStr)) {
      String nextnextDate = DateUtil.getSpecifiedDayAfter(nextDateStr, format);
      list.add(DateUtil.string2Date(nextnextDate, format));
      nextDateStr = nextnextDate;
    }
      
      
    return list;
  }
  
    
    
  public static void main(String[] args) throws Exception {
  
    /**/ String preDate = getSpecifiedDayBefore("2016-05-01", "yyyy-MM-dd");
    String nextDate = getSpecifiedDayAfter("2016-05-03", "yyyy-MM-dd");
  
    Date befroDay = getDayBefore(new Date(), "yyyy-MM-dd");
    Date dateAfter = getDayAfter(new Date(), "yyyy-MM-dd");
  
    // System.out.println("前一天：" + preDate + " 后一天:" + nextDate);
    // System.err.println("前一天：" +date2String( befroDay ,"yyyy-MM-dd")+ "
    // 后一天:" + dateAfter);
  
    String mat = "yyyy-MM-dd";// 这里最好从数据库中读取
    SimpleDateFormat dateTimeFormat = new SimpleDateFormat(mat);
    Date dd = DateUtil.getDayBefore(new Date(), mat);
    // Date befroDay = getDayBefore(new Date(), "yyyy-MM-dd");
    String sd = date2String(befroDay, "yyyy-MM-dd");
    String dateStr = dateTimeFormat.format(befroDay);
    // System.out.println("dateStr="+dateStr+" sd "+sd);
  
    //List<Date> listDate = get2DateListDate("2016-05-01", "2016-05-03", "yyyy-MM-dd");
    //List<String> listDateStr = get2DateListDateStr("2016-05-01", "2016-05-03", "yyyy-MM-dd");
    Date startDate = new Date();
    Date endDate = dateTimeFormat.parse("2016-05-31");
    List<Date> listDate = get2DateListWithDate(startDate,endDate,"yyyy-MM-dd");
      
    for (int i = 0; i < listDate.size(); i++) {
      System.err.println(listDate.get(i));
    }
  
    /*for (int i = 0; i < listDateStr.size(); i++) {
      //System.out.println(listDateStr.get(i));
    }*/  
  }
}