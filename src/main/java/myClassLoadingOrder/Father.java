package myClassLoadingOrder;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-02 20:02
 * @description
 **/
public class Father {
	private int i=test();
    private static int j=method();

    static {
		System.out.println("(1)");
	}
	Father(){
		System.out.println("(2)");
	}
	{
		System.out.println("(3)");
	}



	int test() {
		System.out.println("(4)");
		return 1;
	}

	public static int method() {
		System.out.println("(5)");
		return 1;
	}
}
