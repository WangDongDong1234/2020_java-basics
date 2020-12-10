package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-24 16:28
 * @description  婚姻状态
 **/
@Getter
public enum MaritalStatus {
	C("已婚有子女"),
	M("已婚无子女"),
	S("未婚"),
	W("丧偶"),
	D("离异"),
	O("其他");
	private final String description;

	private MaritalStatus( String description) {
		this.description = description;
	}
}
