package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-18 19:56
 * @description 主副卡标识  Primary and secondary card labels
 **/
@Getter
public enum IdentificationOfPSCard {
	PRIMARY_CARD("主卡"),
	SECONDARY_CARD("副卡");

	private final String description;

	private IdentificationOfPSCard(String description) {
		this.description = description;
	}
}
