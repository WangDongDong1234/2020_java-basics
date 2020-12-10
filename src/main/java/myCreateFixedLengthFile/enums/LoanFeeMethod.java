package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 19:25
 * @description 分期手续费收取方式
 **/
@Getter
public enum LoanFeeMethod {
	F("一次性收取"),
	E("分期收取"),
	C("自行指定");
	private final String description;

	private LoanFeeMethod(String description) {
		this.description = description;
	}
}
