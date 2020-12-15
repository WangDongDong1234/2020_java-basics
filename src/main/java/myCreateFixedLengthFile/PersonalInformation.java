package myCreateFixedLengthFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-09 14:26
 * @description
 **/
public class PersonalInformation {
	@Column(length = 5,order = 10)
	private String name;

	@Column(length = 18,order = 20)
	private String customer_id;

	@Column(length = 11,order = 30)
	private String mobile;

	@Column(length = 20,order = 40)
	private String address;

	@Column(length = 20,order = 50)
	private String work;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
		PersonalInformation personalInformation=new PersonalInformation();
		personalInformation.setName("王冬冬");
		personalInformation.setCustomer_id("321283199602061635");
		personalInformation.setMobile("18851750391");
		personalInformation.setAddress("上海市宝山区何家湾路");
		personalInformation.setWork("上海市长宁区北新泾");

		createFile2(personalInformation,PersonalInformation.class);
		return;

	}
	private static void createFile2(Object o,Class clas) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException {
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

	private static void createFile(PersonalInformation personalInformation) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException {
		List<Field> fieldList =new ArrayList<Field>();
		Collections.addAll(fieldList,PersonalInformation.class.getDeclaredFields());
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
			Method method=PersonalInformation.class.getMethod("get"+methodName);
			values[i]=method.invoke(personalInformation).toString();
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
