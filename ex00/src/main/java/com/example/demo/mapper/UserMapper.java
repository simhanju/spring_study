package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.UserDTO;

@Mapper
public interface UserMapper {
	int insertUser(UserDTO user);
	UserDTO getUserById(String id);
	int deleteUser(String id);
}
