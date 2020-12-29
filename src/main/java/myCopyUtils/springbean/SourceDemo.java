package myCopyUtils.springbean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-15 16:32
 * @description
 **/

public class SourceDemo {
	private int id;

	private String name;

	private String address;

	private Date createTime;

	private Grade grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "SourceDemo{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", createTime=" + createTime +
				", grade=" + grade +
				'}';
	}
}
