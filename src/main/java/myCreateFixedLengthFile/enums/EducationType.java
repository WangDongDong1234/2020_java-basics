package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-24 17:20
 * @description 教育类型
 **/
@Getter
public enum EducationType {
	A("博士及以上"),
	B("硕士"),
	C("本科"),
	D("大专"),
	E("中专及技校"),
	F("高中"),
	G("初中及一下");
	private final String description;

	private EducationType(String description) {
		this.description = description;
	}
}
