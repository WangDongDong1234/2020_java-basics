package myProxy.demo2_biaozhun;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-25 17:29
 * @description
 **/
public class RealSubject implements Subject{
	@Override
	public void rent() {
		System.out.println("I want to rent my house");
	}

	@Override
	public void hello(String str) {
		System.out.println("hello: " + str);
	}
}
