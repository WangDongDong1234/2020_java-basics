package myDate;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-25 10:20
 * @description
 **/
public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
		System.out.println(now);
		System.out.println(localDate2Date(now));
		Date today = new Date();
		System.out.println(date2LocalDate(today));
	}

	/**
	 * LocalDate转Date
	 * @param localDate
	 * @return
	 */
	public static Date localDate2Date(LocalDate localDate) {
		if(null == localDate) {
			return null;
		}
		ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
		return Date.from(zonedDateTime.toInstant());
	}

	/**
	 * Date转LocalDate
	 * @param date
	 */
	public static LocalDate date2LocalDate(Date date) {
		if(null == date) {
			return null;
		}
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
}
