package com.mapper;

import org.apache.ibatis.annotations.Insert;

import com.bean.UserBean;

public interface UserMapper {
	@Insert(value="insert into student(name) value(#{name});")
	public void add(UserBean bean);
}
