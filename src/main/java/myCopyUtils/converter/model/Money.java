package myCopyUtils.converter.model;

import java.math.BigDecimal;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-29 11:32
 * @description
 **/

public class Money {
	private BigDecimal caifu;

	public BigDecimal getCaifu() {
		return caifu;
	}

	public void setCaifu(BigDecimal caifu) {
		this.caifu = caifu;
	}

	public Money(BigDecimal caifu) {
		this.caifu = caifu;
	}

	@Override
	public String toString() {
		return caifu+"";
	}
}
