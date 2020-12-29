package myCopyUtils.converter.model;

import java.math.BigDecimal;

public class User {
	private Integer id;
	private String name;
	private double account;
	private boolean married;
	private BigDecimal caifu;
	private BigDecimal yue;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public BigDecimal getCaifu() {
		return caifu;
	}

	public void setCaifu(BigDecimal caifu) {
		this.caifu = caifu;
	}

	public BigDecimal getYue() {
		return yue;
	}

	public void setYue(BigDecimal yue) {
		this.yue = yue;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", account=" + account + ", " +
				"married=" + married +",caifu= "+caifu+ ",yue="+yue+"]";
	}


}
