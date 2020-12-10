package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-24 16:50
 * @description 证件类型
 **/
@Getter
public enum CredentialType {
	I("身份证","01"),
	A("军官证","02"),
	P("护照","03"),
	H("港澳居民来往内地通行证","04"),
	W("台湾居民来往内地通行证","05"),
	C("警官证","06"),
	S("士兵证","07"),
	V("中国旅游证","08"),
	E("外国护照","09"),
	F("外国人永久居留证","10"),
	X("边民出入境通行证","11"),
	B("港澳居民居住证","12"),
	D("台湾居民居住证","13"),
	O("其他有效证件","99"),
	T("临时身份证","99"),
	L("香港身份证","99"),
	R("户口簿","99"),
	G("澳门身份证","99"),
	J("台湾身份证","99");
	private final String description;
	private final String idTypeValue;

	private CredentialType(String description, String idTypeValue) {
		this.description = description;
		this.idTypeValue = idTypeValue;
	}
}
