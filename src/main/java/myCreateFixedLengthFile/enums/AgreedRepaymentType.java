package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 14:39
 * @description 约定还款类型
 **/
@Getter
public enum AgreedRepaymentType {
	M("最小额扣款"),
	F("全额扣款"),
	C("最小额储蓄购汇"),
	E("全额储蓄购汇"),
	N("未设置");
	private final String description;

	private AgreedRepaymentType(String description) {
		this.description = description;
	}
}
