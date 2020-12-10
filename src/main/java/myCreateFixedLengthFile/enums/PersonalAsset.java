package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 17:36
 * @description 各人资产类型
 **/
@Getter
public enum PersonalAsset {
	A("小于10万"),
	B("10万-20万"),
	C("20万-50万"),
	D("50万-100万"),
	E("大于100万"),;
	private final String description;

	private PersonalAsset(String description) {
		this.description = description;
	}
}
