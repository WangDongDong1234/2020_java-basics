package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 17:54
 * @description 风险类别
 **/
@Getter
public enum SocialStatus {
	N("普通"),
	M("中风险"),
	F("高风险");
	private final String description;

	private SocialStatus(String description) {
		this.description = description;
	}
}
