package myStringReplace;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-04-11 15:18
 * @description
 **/
public class ReplaceStringTest {
	public static void main(String[] args) {
		//replaceAll,replace,replaceFirst的区别
		String strTmp = new String("BBBBBBBYYYYYYY");
		String result = null;
//replaceAll支持正则表达式和字符替换
		result = strTmp.replaceAll ("\\D", "Y");
		System.out.println(result);
		result = strTmp.replaceAll ("Y", "N");
		System.out.println(result);
//replace支持字符和字符串替换
		result = strTmp.replace("N", "C");
		System.out.println(result);
//只替换第一个字符
		result = strTmp.replaceFirst("\\D", "q");
		System.out.println(result);
	}
}
