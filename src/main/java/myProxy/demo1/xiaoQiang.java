package myProxy.demo1;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-25 17:10
 * @description
 **/
public class xiaoQiang implements Person{
	private String name;
	private String house;

	public xiaoQiang(String name, String house) {
		this.name = name;
		this.house = house;
	}

	@Override
	public void buy() {
		System.out.println(name+"买了"+house);
	}

	@Override
	public void buy1() {
		System.out.println("我是你爸爸");
	}
}
