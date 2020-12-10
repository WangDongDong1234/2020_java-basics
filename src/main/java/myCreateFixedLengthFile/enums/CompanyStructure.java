package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-24 17:58
 * @description 公司性质
 **/
@Getter
public enum CompanyStructure {
	A("党政机关"),
	B("事业单位"),
	C("军队"),
	D("社会团体"),
	E("内资企业"),
	F("国有企业"),
	G("集体企业"),
	H("股份合作企业"),
	I("联营企业"),
	J("有限责任公司"),
	K("股份有限公司"),
	L("私营企业"),
	M("外商投资企业（含港、澳、台）"),
	N("中外合资经营企业（含港、澳、台）"),
	O("中外合作经营企业（含港、澳、台）"),
	P("外资企业（含港、澳、台）"),
	Q("外资投资股份有限公司（含港、澳、台）"),
	R("个体经营"),
	Z("其他");
	private final String description;

	private CompanyStructure(String description) {
		this.description = description;
	}
}
