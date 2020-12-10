package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-24 21:34
 * @description 公司行业类型
 **/
@Getter
public enum IndustryType {
	A("农、林、牧、渔业"),
	B("采掘业"),
	C("制造业"),
	D("电力、燃气及水的生产和供应业"),
	E("建筑业"),
	F("交通运输、仓储和邮政业"),
	G("信息传输、计算机服务和软件业"),
	H("批发和零售业"),
	I("住宿和餐饮业"),
	J("金融业"),
	K("房地产业"),
	l("租赁和商务服务业"),
	M("科学研究、技术服务业和地质勘察业"),
	N("水利、环境和公共设施管理业"),
	O("居民服务和其他服务业"),
	P("教育"),
	Q("卫生、社会保障和社会福利业"),
	R("文化、体育和娱乐业"),
	S("公共管理和社会组织"),
	T("国际组织"),
	Z("其他"),;
	private final String description;

	IndustryType(String description) {
		this.description = description;
	}
}
