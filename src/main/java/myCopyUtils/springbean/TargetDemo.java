package myCopyUtils.springbean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-15 16:33
 * @description
 **/

public class TargetDemo {
	private Integer id;

	private String name;

	private String email;

	private Date createTime;

	private Grade grade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "TargetDemo{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", createTime=" + createTime +
				", grade=" + grade +
				'}';
	}
}
