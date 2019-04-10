package com.yxd.mydemo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yxd.mydemo.po.EmpPo;

@Mapper
public interface EmpDao {
	
	EmpPo findEmpById(String id);

}
