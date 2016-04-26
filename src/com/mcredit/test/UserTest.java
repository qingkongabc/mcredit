package com.mcredit.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mcredit.mapper.UserMapper;
import com.mcredit.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/spring-common.xml")
public class UserTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testAdd(){
		User user = new User("aaa", "a","b","ÄãÒª","d");
		userMapper.insertUser(user);
		
	}
	
	@Test
	public void testFindAll(){
		List<User> findAllList = userMapper.selectUser(new User());
		System.out.println(findAllList.size());
	}
	
	@Test
	public void testFindById(){
		User user = new User();
		user.setId(2);
		List<User> users = userMapper.selectUser(user);
		System.out.println(user.getId());
		System.out.println(users.size());
	}


	@Test
	public void testUpdate(){
		
		User user = new User();
		userMapper.updateUser(user);
	}
	
	@Test
	public void testDelete(){
		//userMapper.delete(1);
	}
}
