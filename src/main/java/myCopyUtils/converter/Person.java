package myCopyUtils.converter;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-17 20:49
 * @description
 **/
@Data
public class Person {

	String describe;

	private String id;

	private String name;

	private int age;

	private BigDecimal source;

	private double height;

	private Date createTime;

}