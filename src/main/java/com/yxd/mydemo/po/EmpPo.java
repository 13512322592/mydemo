package com.yxd.mydemo.po;

import java.io.Serializable;

public class EmpPo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** id*/
	private String id;
	/** 姓名*/
	private String name;
	/** 年龄*/
	private Integer age;
	/** 工作*/
	private String job;
	/** 薪资*/
	private Double sal;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmpPo [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpPo other = (EmpPo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
