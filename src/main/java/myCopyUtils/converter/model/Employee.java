package myCopyUtils.converter.model;

public class Employee {
	private int id;
	private String ename;
	private String position;
	private String married;
	private Money caifu;
	private Money yue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getMarried() {
		return married;
	}
	public void setMarried(String married) {
		this.married = married;
	}

	public Money getCaifu() {
		return caifu;
	}

	public void setCaifu(Money caifu) {
		this.caifu = caifu;
	}

	public Money getYue() {
		return yue;
	}

	public void setYue(Money yue) {
		this.yue = yue;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", position=" + position + ", " +
				"married=" + married + ",caifu=" +caifu+",yue="+yue+"]";
	}

}
