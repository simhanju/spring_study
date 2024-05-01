package com.example.demo.persistence;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.example.demo.domain.UserDTO;
import com.example.demo.mapper.UserMapper;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserMapperTests {
	@Autowired
	private UserMapper mapper;
	
	@Test
	private void testExist() {
		assertNotNull(mapper);
	}
	
	@Test
	private void insertUserTest() {
		UserDTO user = new UserDTO();
		user.setId("test");
		mapper.insertUser(user);
	}
}
