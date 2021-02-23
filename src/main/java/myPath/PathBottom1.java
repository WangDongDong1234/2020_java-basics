package myPath;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-22 14:51
 * @description
 **/
public class PathBottom1 {
	public static void main(String[] args) {
		System.out.println(PathBottom1.class.getResource("pathbottom1.xml")); //  不带/的name，会经过resolveName方法转成myPath/pathbottom1.xml
		System.out.println(PathBottom1.class.getResource("/pathbottom1.xml"));//   带/的那么，经过resolceNamefang方法返回pathbottom1.xml
		System.out.println();
		System.out.println(PathBottom1.class.getClassLoader().getResource("pathbottom1.xml"));
		System.out.println(PathBottom1.class.getClassLoader().getResource("/pathbottom1.xml"));
	}

}
