package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.booleanThat;

import java.util.Scanner;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.UserDTO;

@SpringBootTest
public class UserServiceTests {
	Scanner sc = new Scanner(System.in); // 스캐너 생성.
	
	@Autowired @Qualifier("userServiceImpl")
	private UserService service;
	
	@Test
	public void testExist() {
		assertNotNull(service);
	}
	
	@Test
	public void joinTest() {
		UserDTO user = new UserDTO();
		user.setId("test");
		service.join(user);
	}
	
	@Test
	public void getDetailTest() {
		assertNotNull(service.getDetail("test"));	
	}
}

