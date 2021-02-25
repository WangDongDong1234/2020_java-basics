package myProxy.demo1;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-25 17:13
 * @description
 **/
public class TestProxyDemo1 {
	public static void main(String[] args) {
		ProxySaler proxySaler=new ProxySaler();
		Person object= (Person) proxySaler.newInstall(new xiaoQiang("黄豪强","南山区"));
		object.buy1();
		object.buy();
	}
}
