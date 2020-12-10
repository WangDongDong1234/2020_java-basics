package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 17:03
 * @description 工作稳定性
 **/
@Getter
public enum EmployeeStability {
	A("很稳定"),
	B("基本稳定"),
	C("不稳定");
	private final String description;

	private EmployeeStability(String description) {
		this.description = description;
	}
}
