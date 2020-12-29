package myCron;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-25 19:54
 * @description
 **/
public class CronUtil {


	public static String generateCron(String time) throws ParseException {
		System.out.println(String.format("==生成cron表达式,[%s]==",time));
		String dateFormat="ss mm HH dd MM ? yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = sdf.parse(time);
		return  fmtDateToStr(date, dateFormat);
	}

	public static String fmtDateToStr(Date date, String dtFormat) {
		if (date == null){
			return "";
		}
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(dtFormat);
			return dateFormat.format(date);
		} catch (Exception e) {
			System.out.println("处理出错");
			return "";
		}
	}
}
