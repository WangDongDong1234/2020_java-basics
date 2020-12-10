package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 10:17
 * @description 申请人职业
 **/
@Getter
public enum OccupationType {
	A("国家机关、党群组织、企业、事业单位负责人"),
	B("专业技术人员"),
	C("办事人员和有关人员"),
	D("商业、服务业人员工"),
	E("农、林、牧、渔、水利业生产人员"),
	F("生产、运输设备操作人员及有关人员"),
	G("军人"),
	H("其他从业人员"),
	I("学龄前儿童、学生、失业、无业或离退休");
	private final String description;

	private OccupationType(String description) {
		this.description = description;
	}
}
