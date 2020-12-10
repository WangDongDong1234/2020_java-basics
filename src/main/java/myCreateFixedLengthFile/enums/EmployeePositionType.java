package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 11:49
 * @description 员工职务
 **/
@Getter
public enum EmployeePositionType {
	A("高级管理人员/厅局级以上"),
	B("中层管理人员/县处级"),
	C("低层管理人员/科级"),
	D("一般员工/科员"),
	E("内勤"),
	F("后勤"),
	G("工人"),
	H("销售/中介/业务代表"),
	I("营业员/服务员"),
	J("正部级"),
	K("副部级"),
	L("正厅级"),
	M("副厅级"),
	N("正处级"),
	O("副处级"),
	P("正科级"),
	Q("副科级"),
	R("正股级"),
	S("副股级"),
	Z("其他");
	private final String description;

	private EmployeePositionType(String description) {
		this.description = description;
	}
}
