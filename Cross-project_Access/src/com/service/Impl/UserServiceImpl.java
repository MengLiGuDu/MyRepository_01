package com.service.Impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.bean.UserBean;
import com.mapper.UserMapper;
import com.service.UserService;

/**
 * 自动装配 default-autowire="byName"  则必须要加@AutoWired注解
 * @author Administrator
 *
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

	@Resource(name="userMapper")
	private UserMapper userMapper;
	
	@Override
	public void add(UserBean bean) {
		userMapper.add(bean);
	}
}
