package myCron;

import java.text.ParseException;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-25 19:56
 * @description
 **/
public class CronTest {
	public static void main(String[] args) throws ParseException {
		String s=CronUtil.generateCron("2020-12-25 12:12");
		System.out.println(s);
	}
}
