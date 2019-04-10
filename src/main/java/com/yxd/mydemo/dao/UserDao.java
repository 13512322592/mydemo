package com.yxd.mydemo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yxd.mydemo.po.UserPo;

@Mapper
public interface UserDao {
	
	int insert(UserPo user);
}
