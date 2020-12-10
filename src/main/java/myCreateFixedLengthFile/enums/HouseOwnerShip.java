package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-24 17:42
 * @description 房屋持有类型
 **/
@Getter
public enum HouseOwnerShip {
	A("自由住房（无贷款）"),
	B("贷款购房"),
	C("租房"),
	D("与亲属合住"),
	E("集体宿舍"),
	Z("其他");
	private final String description;

	private HouseOwnerShip(String description) {
		this.description = description;
	}
}
