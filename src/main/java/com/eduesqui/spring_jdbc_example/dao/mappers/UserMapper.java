package com.eduesqui.spring_jdbc_example.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.eduesqui.spring_jdbc_example.dto.UserDto;

public class UserMapper implements RowMapper<UserDto> {

	public UserDto mapRow(ResultSet resultSet, int arg1) throws SQLException {
		UserDto userDto = new UserDto();
		userDto.setId(resultSet.getInt("id"));
		userDto.setName(resultSet.getString("name"));
		userDto.setLastName(resultSet.getString("last_name"));
		return userDto;
	}

}
