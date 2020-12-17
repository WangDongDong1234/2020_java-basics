package myUtils.springbean;

import java.util.Date;

import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-15 16:33
 * @description
 **/
public class TestCopy {
	public static void main(String[] args) {
		//
		testB();

	}

	private static void testA() {
		SourceDemo sourceDemo = new SourceDemo();
		sourceDemo.setId(10);
		sourceDemo.setName("姓名");
		sourceDemo.setAddress("地址");
		sourceDemo.setCreateTime(new Date());

		TargetDemo targetDemo = new TargetDemo();
		copyProperties(sourceDemo, targetDemo);
		System.out.println(sourceDemo);
		System.out.println(targetDemo);
		sourceDemo.setName("王冬冬");
		System.out.println(sourceDemo);
		System.out.println(targetDemo);
	}

	/**
	 * 浅拷贝
	 */
	private static void testB() {
		SourceDemo sourceDemo = new SourceDemo();
		sourceDemo.setId(10);
		sourceDemo.setName("姓名");
		sourceDemo.setAddress("地址");
		sourceDemo.setCreateTime(new Date());
		Grade grade=new Grade();
		grade.setShuxue(100);
		grade.setYinyu(100);
		grade.setYuwen(100);
		sourceDemo.setGrade(grade);
		TargetDemo targetDemo = new TargetDemo();
		copyProperties(sourceDemo, targetDemo);
		System.out.println(sourceDemo);
		System.out.println(targetDemo);
		grade.setShuxue(90);
		sourceDemo.setGrade(grade);
		System.out.println(sourceDemo);
		System.out.println(targetDemo);
	}
}
