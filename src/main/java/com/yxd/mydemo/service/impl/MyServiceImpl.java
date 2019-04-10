package com.yxd.mydemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxd.mydemo.dao.EmpDao;
import com.yxd.mydemo.po.EmpPo;
import com.yxd.mydemo.service.MyService;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	EmpDao empDao;

	@Override
	public EmpPo getEmpById(String id) {
		return empDao.findEmpById(id);
	}

}
