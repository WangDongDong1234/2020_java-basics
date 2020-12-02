package myEnum;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-01 15:08
 * @description
 **/
public enum Color {
	RED("红色"),
	GREEN("绿色");
	private final String str;

	public String getStr() {
		return str;
	}

	Color(String str) {
		this.str = str;
	}
}
