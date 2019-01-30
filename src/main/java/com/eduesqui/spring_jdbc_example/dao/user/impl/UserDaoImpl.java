package com.eduesqui.spring_jdbc_example.dao.user.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.jta.SpringJtaSynchronizationAdapter;

import com.eduesqui.spring_jdbc_example.dao.mappers.UserMapper;
import com.eduesqui.spring_jdbc_example.dao.user.IUserDao;
import com.eduesqui.spring_jdbc_example.dto.UserDto;

@Repository
public class UserDaoImpl implements IUserDao{
	
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public UserDto getById(int id) {
		
//		try {
			StringBuilder query = new StringBuilder();
			query.append("SELECT * ");
			query.append("FROM ");
			query.append("user ");
			query.append("WHERE id = ?");
			return jdbcTemplate.queryForObject(query.toString(),new Object[] {1},new UserMapper());
			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return null;
		
		
		
	}

}
