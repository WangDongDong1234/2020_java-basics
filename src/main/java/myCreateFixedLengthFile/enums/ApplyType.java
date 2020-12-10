package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-18 20:26
 * @description  申请类型
 **/
@Getter
public enum ApplyType {
	PRIMARY_AND_SECOND_CARD( "主附同申"),
	PRIMARY_CARD( "独立主卡"),
	SECOND_CARD("独立附卡");
	private final String description;

	private ApplyType(String description) {
		this.description = description;
	}
}
