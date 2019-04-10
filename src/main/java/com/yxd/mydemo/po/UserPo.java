package com.yxd.mydemo.po;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserPo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String uId;
	private String uName;
	private String uPwd;
	private String uPhone;
	private String uSex;
	private Integer uAge;
	private Date uCreateDate;
	private Date uDeleteDate;
	private String uStatus;
	@Override
	public String toString() {
		return "UserPo [uId=" + uId + ", uName=" + uName + ", uPwd=" + uPwd + ", uPhone=" + uPhone + ", uSex=" + uSex
				+ ", uAge=" + uAge + ", uCreateDate=" + uCreateDate + ", uDeleteDate=" + uDeleteDate + ", uStatus="
				+ uStatus + "]";
	}
	public void preInsert() {
		this.uId = UUID.randomUUID().toString().toLowerCase();
		this.uCreateDate = new Date();
		this.uStatus = "Y";
	}

}
