package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 14:53
 * @description 卡片寄送方式
 **/
@Getter
public enum CardFetchMethod {
	A("邮件寄送"),
	B("分支行领卡"),
	E("快递寄送"),
	R("挂号信");
	private final String description;

	private CardFetchMethod( String description) {
		this.description = description;
	}
}
