package myCreateFixedLengthFile;

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
 * @create: 2021-03-08 17:29
 * @description
 **/
public class Utils {
	public static void createFile2(Object o,Class clas) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException {
		List<Field> fieldList =new ArrayList<Field>();
		Collections.addAll(fieldList,clas.getDeclaredFields());
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
			Method method=clas.getMethod("get"+methodName);
			values[i]=method.invoke(o).toString();
			lengths[i]=getColumn(fieldList.get(i)).length();
			content+=String.format("%-"+lengths[i]+"s",values[i]);
		}
		System.out.println(content);
		String path=System.getProperty("user.dir")+"/src/main/java/myCreateFixedLengthFile/read.txt";
		System.out.println(path);
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
