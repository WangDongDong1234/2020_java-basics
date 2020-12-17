package myUtils.springbean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-15 16:33
 * @description
 **/
@Setter
@Getter
@ToString
public class TargetDemo {
	private Integer id;

	private String name;

	private String email;

	private Date createTime;

	private Grade grade;
}
