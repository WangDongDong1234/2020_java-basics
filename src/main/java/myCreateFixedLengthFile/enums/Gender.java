package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-24 16:21
 * @description 性别
 **/
@Getter
public enum Gender {
	M("男"),
	F("女");
	private final String description;

	private Gender(String description) {
		this.description = description;
	}
}
