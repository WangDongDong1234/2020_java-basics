package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-24 14:59
 * @description
 **/
public class TestCollections {
	public static void main(String[] args) {
		String receiverMail="wangdongdong15@meituan.com;niexiaoxu@meituan.com";
		String supervisorMail = "wangdongdong15@meituan.com";
		List receiversMails =new ArrayList<>();
		Collections.addAll(receiversMails,receiverMail.split(";"));
		Collections.addAll(receiversMails,supervisorMail.split(";"));
		System.out.println(receiversMails);
	}
}
