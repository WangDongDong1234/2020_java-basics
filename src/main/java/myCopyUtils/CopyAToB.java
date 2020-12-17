package myCopyUtils;

//import org.apache.commons.beanutils.BeanUtils;


import org.springframework.beans.BeanUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-15 15:22
 * @description   把一个类的属性封装到另一个
 **/
public class CopyAToB {

	/**
	 * 方案一
	 * A类中有String name，int score；B类中有String name ，int score，String schoole，
	 * 现在想把A类中的name和score的值复制到B中.双层for循环
	 * @param source
	 * @param target
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws InvocationTargetException
	 */
	public static void copyA(Object source, Object target) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InvocationTargetException {
		//得到对象的Class
		Class sourceClass = source.getClass();
		//得到对象的Class
		Class targetClass = target.getClass();

		//得到Class对象的所有属性
		Field[] sourceFields = sourceClass.getDeclaredFields();
		//得到Class对象的所有属性
		Field[] targetFields = targetClass.getDeclaredFields();

		for(Field sourceField : sourceFields){
			//属性名
			String name = sourceField.getName();
			//属性类型
			Class type = sourceField.getType();

			String methodName = name.substring(0, 1).toUpperCase() + name.substring(1);

			//得到属性对应get方法
			Method getMethod = sourceClass.getMethod("get" + methodName);

			//执行源对象的get方法得到属性值
			Object value = null;
			try {
				value = getMethod.invoke(source);
			} catch (InvocationTargetException e) {
				System.out.println("属性名:"+name);
				e.printStackTrace();
			}

			for(Field targetField : targetFields){
				//目标对象的属性名
				String targetName = targetField.getName();

				if(targetName.equals(name)){
					//属性对应的set方法
					Method setMethod = targetClass.getMethod("set" + methodName, type);
					//执行目标对象的set方法
					setMethod.invoke(target, value);
				}
			}
		}
	}

	/**
	 * 使用common的BeanUtils  禁止用
	 * @param source
	 * @param target
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	public static void copyB(Object source, Object target) throws InvocationTargetException, IllegalAccessException {
		//BeanUtils.copyProperties(source,target);
	}


	public static void copyC(Object source, Object target) throws InvocationTargetException, IllegalAccessException {
		BeanUtils.copyProperties(source, target);
	}


}
