package com.eduesqui.spring_jdbc_example.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduesqui.spring_jdbc_example.dao.user.IUserDao;
import com.eduesqui.spring_jdbc_example.dto.UserDto;

@Service
public class UserBo {
	
	@Autowired
	private IUserDao userDao;
	

	public UserDto findUserById(Integer id) {
		return userDao.getById(id);
	}
}
