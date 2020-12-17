package myUtils.springbean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-15 16:32
 * @description
 **/
@Getter
@Setter
@ToString
public class SourceDemo {
	private int id;

	private String name;

	private String address;

	private Date createTime;

	private Grade grade;
}
