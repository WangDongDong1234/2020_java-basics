package myCreateFixedLengthFile;

import lombok.Getter;
import lombok.Setter;
import myCreateFixedLengthFile.enums.Gender;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-10 17:23
 * @description
 **/
@Setter
@Getter
public class Person {
	@Column(length = 5,order = 1)
	Gender gender;

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
		Person person=new Person();
		person.setGender(Gender.F);

		List<Field> fieldList =new ArrayList<Field>();
		Collections.addAll(fieldList,Person.class.getDeclaredFields());
		fieldList.sort((f1,f2)->{
			int order1 =getColumn(f1).order();
			int order2 =getColumn(f2).order();
			return Integer.compare(order1,order2);
		});
		String[] values=new String[fieldList.size()];
		Integer[] lengths=new Integer[fieldList.size()];

		String content="";
		for(int i=0;i<fieldList.size();i++){
			String fieldName=fieldList.get(i).getName();
			String methodName=fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
			Method method=Person.class.getMethod("get"+methodName);
			values[i]=method.invoke(person).toString();
			lengths[i]=getColumn(fieldList.get(i)).length();
			content+=String.format("%-"+lengths[i]+"s",values[i]);
		}
		System.out.println(content);
		String path="/Users/wangdongdong/Documents/ownCode/2020_java-basics/src/main/java/myCreateFixedLengthFile/read.txt";
		File file=new File(path);
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		fileOutputStream.write(content.getBytes());
		fileOutputStream.close();

	}

	public static Column getColumn(Field field){
		Column column=field.getAnnotation(Column.class);
		return column;
	}
}
