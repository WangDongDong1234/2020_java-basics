package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 11:42
 * @description 申请人职称
 **/
@Getter
public enum TitleOfTechnicalType {
	A("高级及以上"),
	B("中级"),
	C("初级"),
	D("初级以下");
	private final String description;

	private TitleOfTechnicalType(String description) {
		this.description = description;
	}
}
