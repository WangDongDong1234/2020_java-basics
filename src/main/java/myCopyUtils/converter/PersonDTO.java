package myCopyUtils.converter;

import lombok.Data;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-17 20:50
 * @description
 **/
@Data
public class PersonDTO {

	String describe;

	private Long id;

	private String personName;

	private String age;

	private String source;

	private String height;

}