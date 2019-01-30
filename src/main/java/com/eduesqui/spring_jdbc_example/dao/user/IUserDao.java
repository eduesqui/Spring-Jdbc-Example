package com.eduesqui.spring_jdbc_example.dao.user;
import com.eduesqui.spring_jdbc_example.dto.UserDto;

public interface IUserDao {
	
	public UserDto getById(int id);
	
}
