package myCopyUtils.springbean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-15 16:37
 * @description
 **/

public class Grade {
	private int yuwen;
	private int shuxue;
	private int yinyu;

	public int getYuwen() {
		return yuwen;
	}

	public void setYuwen(int yuwen) {
		this.yuwen = yuwen;
	}

	public int getShuxue() {
		return shuxue;
	}

	public void setShuxue(int shuxue) {
		this.shuxue = shuxue;
	}

	public int getYinyu() {
		return yinyu;
	}

	public void setYinyu(int yinyu) {
		this.yinyu = yinyu;
	}

	@Override
	public String toString() {
		return "Grade{" +
				"yuwen=" + yuwen +
				", shuxue=" + shuxue +
				", yinyu=" + yinyu +
				'}';
	}
}
