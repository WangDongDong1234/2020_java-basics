package myProxy.demo2_biaozhun;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-25 17:30
 * @description
 **/
public class DynamicProxy implements InvocationHandler {
	// 这个就是我们要代理的真实对象
	private Object subject;


	// 构造方法，给我们要代理的真实对象赋初值
	public DynamicProxy(Object subject)
	{
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//System.out.println("proxy:"+proxy);  不能打印这个，打印了会报java.lang.StackOverflowError
		// 在代理真实对象前我们可以添加一些自己的操作
		System.out.println("before rent house");
		System.out.println("Method:" + method);
		// 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		method.invoke(subject, args);
		// 在代理真实对象后我们也可以添加一些自己的操作
		System.out.println("after rent house");
		return null;
	}
}
