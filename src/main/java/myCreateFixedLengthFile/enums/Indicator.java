package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-24 15:56
 * @description Y(是)/N(否)
 **/
@Getter
public enum Indicator {
	Y("是"),
	N("否");
	private final String description;

	private Indicator(String description) {
		this.description = description;
	}
}
