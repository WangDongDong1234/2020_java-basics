package myEnum;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-01 15:10
 * @description
 **/
public class TestColor {
	public static void main(String[] args) {
		System.out.println(Color.RED.toString());  //RED
		System.out.println(String.valueOf(Color.RED));  //RED
		Color color = Color.valueOf("RED");
		System.out.println(color);
	}
}
