package com.dao;

import com.po.Users;

//用户业务逻辑类
public class UsersDAO {
	public boolean usersLogin(Users u)
	{
		if (u.getUsername().equals("admin")&&u.getPassword().equals("123456")){
			return true;
		}
		else
			return false;
	}
}
