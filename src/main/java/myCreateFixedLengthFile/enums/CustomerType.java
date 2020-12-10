package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 20:46
 * @description 客户类型
 **/
@Getter
public enum CustomerType {
	O("行外"),
	I("行内"),
	G("集团");
	private final String description;

	private CustomerType(String description) {
		this.description = description;
	}
}
