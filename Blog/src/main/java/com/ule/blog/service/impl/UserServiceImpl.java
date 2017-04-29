package com.ule.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ule.blog.dao.IUserDao;
import com.ule.blog.pojo.User;
import com.ule.blog.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}
