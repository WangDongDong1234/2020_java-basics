package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 17:13
 * @description 房屋类型
 **/
@Getter
public enum HouseType {
	A("经济适用住房"),
	B("廉租房"),
	C("房改房"),
	D("安居房"),
	E("集资房"),
	F("商品房"),
	G("限价房"),
	H("别墅"),
	I("商铺"),
	Z("其他");

	private final String description;

	private HouseType(String description) {

		this.description = description;
	}
}
