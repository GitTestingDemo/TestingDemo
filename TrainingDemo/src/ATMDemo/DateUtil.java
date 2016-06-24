package ATMDemo;
//����ʵ��Ϊ��ҷ�����java���ڲ��������࣬��ȡָ������ǰһ�졢��һ�죻����ת������������֮����������ȹ����࣬����Ҳο���������������
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
  
public class DateUtil {
    
  /**
   * ���ָ�����ڵ�ǰһ��
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
   * ���ָ�����ڵĺ�һ��
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
   * ���ָ�����ڵ�ǰһ��
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
   * ���ָ�����ڵĺ�һ��
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
   * ��date����׼��ָ��format��ʽ���ַ���
   * 
   * @param day ����
   * @param format ָ����ʽ
   * @return
   */
  public static String date2String(Date day, String format) {
    String dateStr = new SimpleDateFormat(format).format(day.getTime());
    return dateStr;
  }
  
  /**
   * ���ַ���ת��ָ����ʽ��date����
   * 
   * @param day ����
   * @param format ָ����ʽ
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
  * @Description: ����date���ͱȽϴ�С
  * @param dayAfter date����
  * @param date   date����
  * @param ��ʽ��
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
   * �Ƚ��������������յĴ�С
  * @Title: DateCompareValue 
  * @Description: һ��stirngһ��date���ͱȽϴ�С
  * @param date1 String����
  * @param date2 date����
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
   * �Ƚ��������������յĴ�С
  * @Title: DateStr2CompareValue 
  * @Description: ����string���ͱȽ�ʱ���С
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
  * @date 2016��5��17�� ����2:11:48 
  * @Description: ��ȡʱ��֮�ڵ� ���������date����
  * @param @param preDate ��ʼʱ��
  * @param @param nextDate ����ʱ��
  * @param @param format  fomat��ʽ
  * @param @return  
  * @return List<Date> ����������� 
  * @throws
   */
  public static List<Date> get2DateListDate(String preDate, String nextDate, String format) {
    List<Date> list = new ArrayList<>();
    if(nextDate.equals(preDate)){//��ʼʱ�� ����ʱ����Ⱦ�ֱ�ӷ���
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
  * @date 2016��5��17�� ����2:11:48 
  * @Description: ��ȡʱ��֮�ڵ� ���������string����
  * @param @param preDate ��ʼʱ��
  * @param @param nextDate ����ʱ��
  * @param @param format  fomat��ʽ
  * @param @return  
  * @return List<Date> ����������� 
  * @throws
   */
  public static List<String> get2DateListDateStr(String preDate, String nextDate, String format) {
    List<String> list = new ArrayList<>();
    if(nextDate.equals(preDate)){//�����ʼʱ����ڽ���ʱ����ô����ͬһ��
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
  * @date 2016��5��26�� ����9:20:29 
  * @Description: ��ȡ��������֮�����ڵ� 
  * @param @param startDate ��ʼ���� date����
  * @param @param endDate  �������� date����
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
    if(startDateStr.equals(endDateStr)){//�����ʼʱ����ڽ���ʱ����ô����ͬһ��
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
  
    // System.out.println("ǰһ�죺" + preDate + " ��һ��:" + nextDate);
    // System.err.println("ǰһ�죺" +date2String( befroDay ,"yyyy-MM-dd")+ "
    // ��һ��:" + dateAfter);
  
    String mat = "yyyy-MM-dd";// ������ô����ݿ��ж�ȡ
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