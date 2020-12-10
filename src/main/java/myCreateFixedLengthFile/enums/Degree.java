package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 19:11
 * @description 学位
 **/
@Getter
public enum Degree {
	O("其他"),
	H("名誉博士"),
	D("博士"),
	M("硕士"),
	B("学士"),
	U("未知"),;
	private final String description;

	private Degree(String description) {
		this.description = description;
	}
}
