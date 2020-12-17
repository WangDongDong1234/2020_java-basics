package myGenerator;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-17 19:31
 * @description
 **/
public class TestMapper {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		Date date1=new Date();
		System.out.println(date1);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
		System.out.println(simpleDateFormat.format(date1));
	}
}
