package myPath;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-13 17:41
 * @description
 **/
public class TestPath {
	public static void main(String[] args) throws URISyntaxException, IOException {
		/**
		 * 1.java文件经过build后的class在target目录中，所以getResource输出的目录是class在的真实目录
		 */
		Class<?> c = TestPath.class;
		//     /Users/wangdongdong/Documents/ownCode/2020_java-basics/target/classes/myPath/
		System.out.println(c.getResource("").getPath());
		//     /Users/wangdongdong/Documents/ownCode/2020_java-basics/target/classes/
		System.out.println(c.getResource("/").getPath());
		//     /Users/wangdongdong/Documents/ownCode/2020_java-basics/target/classes/myPath/
		System.out.println(c.getResource("").toURI().getPath());


		// 第一种：获取类加载的根路径    /Users/wangdongdong/Documents/ownCode/2020_java-basics/target/classes
		File f = new File(c.getResource("/").getPath());
		System.out.println("path1: "+f);

		// 获取当前类的所在工程路径; 如果不加“/”  获取当前类的加载目录  /Users/wangdongdong/Documents/ownCode/2020_java-basics/target/classes/myPath
		File f2 = new File(c.getResource("").getPath());
		System.out.println("path2: "+f2);

		// 第二种：获取项目路径    /Users/wangdongdong/Documents/ownCode/2020_java-basics
		File directory = new File("");// 参数为空
		String courseFile = directory.getCanonicalPath();
		System.out.println("path3: "+courseFile);


		// 第三种：  file:/Users/wangdongdong/Documents/ownCode/2020_java-basics/target/classes/
		URL xmlpath = c.getClassLoader().getResource("");
		System.out.println("path4: "+xmlpath.getPath());

		// 第四种： /Users/wangdongdong/Documents/ownCode/2020_java-basics
		System.out.println("path5: "+System.getProperty("user.dir"));
		/*
		 * 结果： C:\Documents and Settings\Administrator\workspace\projectName
		 * 获取当前工程路径
		 */

		// 第五种：  获取所有的类路径 包括jar包的路径
		System.out.println("path6: "+System.getProperty("java.class.path").split(";")[0]);


	}
}
