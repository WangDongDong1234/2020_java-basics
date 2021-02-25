package myProxy.demo3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-25 19:09
 * @description
 **/
public class CglibProxy implements MethodInterceptor {
	public Object newInstall(Object object){
		return Enhancer.create(object.getClass(),this);
	}
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("先热身一会");
		methodProxy.invokeSuper(o,objects);
		System.out.println("打完了");
		return null;
	}
}
