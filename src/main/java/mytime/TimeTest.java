package mytime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-03-12 19:06
 * @description
 **/
public class TimeTest {
	public static void main(String[] args) {
//		System.out.println(LocalDateTime.now());
//		//1.localDate 转字符串
//		localDate2String(LocalDate.now());
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime time = LocalDateTime.now();
		String localTime = df.format(time);
		LocalDateTime ldt = LocalDateTime.parse("2018-01-12 17:07",df);
		System.out.println("LocalDateTime转成String类型的时间："+localTime);
		System.out.println("String类型的时间转成LocalDateTime："+ldt);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l = LocalDateTime.parse("2021-03-12 17:50", fmt);
		System.out.println(LocalDateTime.now().isBefore(l));
		System.out.println(l);

	}

	public static String localDate2String(LocalDate source){
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateStr = source.format(fmt);
		System.out.println("LocalDate转String:"+dateStr);
//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//		String dateStr2 = source.format(fmt2);
//		System.out.println("LocalDate转String:"+dateStr2);

		return dateStr;
	}

	public static LocalDate string2LocalDate(String source){
		return null;
	}
}
