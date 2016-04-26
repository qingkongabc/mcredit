package com.mcredit.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mcredit.mapper.UserMapper;
import com.mcredit.model.User;
import com.mcredit.service.UserService;



@Service
@Transactional  //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper mapper;


	@Override
	public void insertUser(User user) {
		mapper.insertUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		return mapper.updateUser(user);
	}

	@Override
	public boolean deleteUser(int id) {
		return mapper.deleteUser(id);
	}

	@Override
	public List<User> selectUser(User user) {
		return mapper.selectUser(user);
	}
}
