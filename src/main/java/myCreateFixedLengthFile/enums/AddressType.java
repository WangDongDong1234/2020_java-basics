package myCreateFixedLengthFile.enums;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 16:07
 * @description
 **/
public enum AddressType {
	H("家庭地址"),
	C("公司地址"),
	S("户籍地址"),
	R("单位注册地址"),
	O("单位运营地址"),
	M("其他地址1"),
	N("其他地址2");
	private final String description;

	private AddressType(String description) {
		this.description = description;
	}
}
