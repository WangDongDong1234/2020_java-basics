package myCreateFixedLengthFile;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import static myCreateFixedLengthFile.ControlContentLength.strAppendStr;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-09 11:08
 * @description
 **/
public class FixedLengthFile {
	public static void main(String[] args) throws Exception{
		System.out.println(String.format("%-12s","qqq中国")+ "|");
		System.out.println(String.format("%-12s", "中华") + "|");
		System.out.println(String.format("%-12s", "人民") + "|");
		System.out.println(String.format("%-12s", "共和国") + "|");

		System.out.println(strAppendStr("中华人民",24,"-")+"|");
		System.out.println(strAppendStr("共和国",24,"-")+"|");

		int length=12;
		System.out.println(String.format("%-"+length+"s","qqq中国")+ "|");
		System.out.println(String.format("%-12s","qqq中国")+String.format("%-12s", "共和国"));
		System.out.println(String.format("%-12s","qqq中国")+String.format("%-12s", "共和国")+String.format("%-12s","")+"|");
	}
}
