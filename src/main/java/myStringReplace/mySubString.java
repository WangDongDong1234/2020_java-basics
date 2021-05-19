package myStringReplace;

import sun.jvm.hotspot.ui.tree.SimpleTreeNode;

import java.util.Arrays;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-05-10 17:37
 * @description
 **/
public class mySubString {
	public static void main(String[] args) {
		String s = "2021-05-10";
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(5,7));
		System.out.println(s.substring(8,10));
		byte[] bytes = s.getBytes();
		bytes= Arrays.copyOf(bytes,30);
		System.out.println(new String(bytes));
	}



}
