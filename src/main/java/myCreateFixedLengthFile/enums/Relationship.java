package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 15:10
 * @description 人际关系类型
 **/
@Getter
public enum Relationship {
	C("配偶"),
	F("父亲"),
	M("母亲"),
	B("兄弟"),
	S("姐妹"),
	L("亲属"),
	W("同事"),
	D("父母"),
	H("子女"),
	X("兄弟姐妹"),
	T("同学"),
	Y("朋友"),
	O("其他");
	private final String description;

	private Relationship(String description) {
		this.description = description;
	}
}
