package myCreateFixedLengthFile.enums;

import lombok.Getter;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-25 20:51
 * @description 分期类型
 **/
@Getter
public enum LoanType {
	R("消费分期", Indicator.N),
	C("额度内现金分期", Indicator.N),
	B("账单分期", Indicator.N),
	Y("余额分期", Indicator.N),
	P("POS分期", Indicator.N),
	M("额度外分期（专项分期）", Indicator.N),
	MCAT("随借随还", Indicator.N),
	MCEP("等额本金", Indicator.Y),
	MCEI("等额本息", Indicator.Y),
	K("额度外消费分期", Indicator.N),
	J("额度外现金分期", Indicator.N),
	I("强制账户分期", Indicator.N),
	S("余额账户分期", Indicator.N),
	D("账单延迟分期", Indicator.N),
	G("抵押分期", Indicator.N);
	private final String description;
	private final Indicator useSchedule;

	private LoanType(String description, Indicator useSchedule) {
		this.description = description;
		this.useSchedule = useSchedule;
	}
}
