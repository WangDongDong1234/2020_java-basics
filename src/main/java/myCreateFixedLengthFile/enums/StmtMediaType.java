package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 15:55
 * @description 账单介质类型
 **/
@Getter
public enum StmtMediaType {
	P("纸质账单"),
	E("电子账单"),
	B("both");
	private final String description;

	private StmtMediaType(String description) {
		this.description = description;
	}
}
